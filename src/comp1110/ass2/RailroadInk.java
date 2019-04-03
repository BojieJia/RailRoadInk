package comp1110.ass2;

import java.sql.SQLOutput;
import java.util.Random;

public class RailroadInk {
    /**
     * Determine whether a tile placement string is well-formed:
     * - it consists of exactly 5 characters;
     * - the first character represents a die A or B, or a special tile S
     * - the second character indicates which tile or face of the die (0-5 for die A and special tiles, or 0-2 for die B)
     * - the third character represents the placement row A-G
     * - the fourth character represents the placement column 0-6
     * - the fifth character represents the orientation 0-7
     *
     * @param tilePlacementString a candidate tile placement string
     * @return true if the tile placement is well formed
     */

    //Authored by Harriet
    public static boolean isTilePlacementWellFormed(String tilePlacementString) {
        boolean firstSecond = false;
        boolean third = false;
        boolean fourth = false;
        boolean fifth = false;

        char[] array = tilePlacementString.toCharArray();


        //check if string is the right length
        if(tilePlacementString.length() == 5) {

            if(array[0] == 'A' || array[0] == 'S') {
                //If the first array element is A or S
                if(array[1] <= '5') {
                    //Check that the second element has a number 0 - 5
                    //Set firstSecond to true
                    firstSecond = true;
                } else {
                    //If not return false
                    return false;
                }
            } else if (array[0] == 'B' && array[1] <= '2') {
                //If first array element is B and the second element is 0-2
                //Set firstSecond to be true
                firstSecond = true;
            } else {
                //Otherwise return false
                return false;
            }

            if(array[2] >= 'A' && array[2] <= 'G') {
                //If 3rd array element is A-G then set third to true
                third = true;
            } else {
                //Otherwise return false
                return false;
            }

            if(array[3] <= '6') {
                //If the fourth array element is 0-6 set fourth to true
                fourth = true;
            } else {
                //Otherwise return false
                return false;
            }

            if(array[4] <= '7') {
                //If the fifth array element is 0-7 set fifth to true
                fifth = true;
            } else {
                //Otherwise return false
                return false;
            }
        }


        //If all elements are true return
        if(firstSecond && third && fourth && fifth) {
            return true;
        } else {
            //Otherwise return false
            return false;
        }

    }

    /**
     * Determine whether a board string is well-formed:
     * - it consists of exactly N five-character tile placements (where N = 1 .. 31);
     * - each piece placement is well-formed
     * - no more than three special tiles are included
     *
     * @param boardString a board string describing the placement of one or more pieces
     * @return true if the board string is well-formed
     */
    //Authored by Bojie
    public static boolean isBoardStringWellFormed(String boardString) {
        if(boardString!=null &&!"".equals(boardString)) {

            int x = boardString.length() % 5;
            int N = boardString.length() / 5;
            boolean wellFormed = true;

            if (x == 0 && N > 0 && N < 32) {
                //check the length of boardString
                for (int k = 0; k < N; k++) {
                    String St = boardString.substring(5 * k, 5 * k + 5);
                    if (!isTilePlacementWellFormed(St)) {
                        wellFormed = false;
                    }
                }
                //make sure each piece placement is well- formed
                int count = 0;
                for (int j = 0; j < N; j++) {
                    if (boardString.charAt(5 * j) == 'S') {
                        count++;
                    }
                }
                if (count <= 3 && wellFormed) {
                    return true;
                }
                //check the amount of special tiles
            }
        }

        return false;

    }


    /**
     * Determine whether the provided placements are neighbours connected by at least one validly connecting edge.
     * For example,
     * - areConnectedNeighbours("A3C10", "A3C23") would return true as these tiles are connected by a highway edge;
     * - areConnectedNeighbours("A3C23", "B1B20") would return false as these neighbouring tiles are disconnected;
     * - areConnectedNeighbours("A0B30", "A3B23") would return false as these neighbouring tiles have an
     * invalid connection between highway and railway; and
     * areConnectedNeighbours("A0B30", "A3C23") would return false as these tiles are not neighbours.
     *
     * @return true if the placements are connected neighbours
     */

    //Authored by Harriet
    public static boolean areConnectedNeighbours(String tilePlacementStringA, String tilePlacementStringB) {

        char[] array1 = fixOrientation(tilePlacementStringA);
        char[] array2 = fixOrientation(tilePlacementStringB);


        //initialize feature placements
        //n = north
        //e = east
        //s = south
        //w = west
        char n1n = array1[0];
        char n1e = array1[1];
        char n1s = array1[2];
        char n1w = array1[3];

        char n2n = array2[0];
        char n2e = array2[1];
        char n2s = array2[2];
        char n2w = array2[3];

        //find the location of the connection of the pieces (if there is one)
        char location = connectionLocation(tilePlacementStringA, tilePlacementStringB);

        if(location == 'n') {
            //if the connection is "North" (above piece 1)
            if(n1n == n2s && n1n != 'n') {
                //if the north feature of piece 1 matches the south feature
                //of piece 2, then return true
                return true;
            } else {
                return false;
            }
        } else if (location == 'e') {
            //if the connection is "east" (right of piece 2)
            if(n1e == n2w && n1e != 'n') {
                //if the east feature of piece 1 matches the west feature
                //of piece 2, then return true
                return true;
            } else {
                return false;
            }
        } else if (location == 's') {
            //if the connection is "south" (below piece 2)
            if(n1s == n2n && n1s != 'n') {
                //if the south feature of piece 1 matches the north feature
                //of piece 2, then return true
                return true;
            } else {
                return false;
            }
        } else if (location == 'w') {
            //if the connection is "west" (left of piece 1)
            if(n1w == n2e  && n1w != 'n') {
                //if the west feature of piece 1 matches the east feature
                //of piece 2, then return true
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //Authored by Harriet
    public static char[] fixOrientation(String tilePlacementString) {
        char[] array = tilePlacementString.toCharArray();

        char[] nameArray = {array[0], array[1]};

        //find the name of the pieces
        String name = new String(nameArray);

        //initialize feature placements
        //n = north
        //e = east
        //s = south
        //w = west
        char n = 'a';
        char e = 'b';
        char s = 'c';
        char w = 'd';

        for (Pieces p : Pieces.values()) {
            //check for piece name in pieces enum
            if (p.name().equals(name)) {
                //set feature placement variables depending on piece's orientation
                if(array[4] == '0') {
                    n = p.north;
                    e = p.east;
                    s = p.south;
                    w = p.west;
                } else if(array[4] == '1') {
                    e = p.north;
                    s = p.east;
                    w = p.south;
                    n = p.west;
                } else if(array[4] == '2') {
                    s = p.north;
                    w = p.east;
                    n = p.south;
                    e = p.west;
                } else if(array[4] == '3') {
                    w = p.north;
                    n = p.east;
                    e = p.south;
                    s = p.west;
                } else if(array[4] == '4') {
                    n = p.north;
                    e = p.west;
                    s = p.south;
                    w = p.east;
                } else if(array[4] == '5') {
                    e = p.north;
                    s = p.west;
                    w = p.south;
                    n = p.east;
                } else if(array[4] == '6') {
                    s = p.north;
                    w = p.west;
                    n = p.south;
                    e = p.east;
                } else if(array[4] == '7') {
                    w = p.north;
                    n = p.west;
                    e = p.south;
                    s = p.east;
                }
            }
        }

        char[] features = {n, e, s, w};

        return features;
    }

    //Authored by Harriet
    public static char connectionLocation(String tilePlacementStringA, String tilePlacementStringB) {
        char[] p1 = tilePlacementStringA.toCharArray();
        char[] p2 = tilePlacementStringB.toCharArray();

        char[] l1 = {p1[2], p1[3]};
        char[] l2 = {p2[2], p2[3]};

        if(l2[0] == l1[0]) {
            //check same row
            if(l2[1] == l1[1] + 1) {
                //if l2 is to the right of l1
                return 'e';
            } else if(l2[1] == l1[1] - 1) {
                //if l2 is to the left of l1
                return 'w';
            } else {
                return 'f';
            }
        } else if (l2[0] == l1[0] + 1) {
            //check below
            if(l2[1] == l1[1]) {
                //if l2 is the same as l1
                return 's';
            } else {
                return 'f';
            }
        } else if (l2[0] == l1[0] - 1) {
            //check above
            if(l2[1] == l1[1]) {
                //if l2 is the same as l1
                return 'n';
            } else {
                return 'f';
            }
        } else {
            return 'f';
        }
    }

    /**
     * Given a well-formed board string representing an ordered list of placements,
     * determine whether the board string is valid.
     * A board string is valid if each tile placement is legal with respect to all previous tile
     * placements in the string, according to the rules for legal placements:
     * - A tile must be placed such that at least one edge connects to either an exit or a pre-existing route.
     *   Such a connection is called a valid connection.
     * - Tiles may not be placed such that a highway edge connects to a railway edge;
     *   this is referred to as an invalid connection.
     *   Highways and railways may only join at station tiles.
     * - A tile may have one or more edges touching a blank edge of another tile;
     *   this is referred to as disconnected, but the placement is still legal.
     *
     * @param boardString a board string representing some placement sequence
     * @return true if placement sequence is valid
     */
    public static boolean isValidPlacementSequence(String boardString) {
        // FIXME Task 6: determine whether the given placement sequence is valid
        return false;
    }

    /**
     * Generate a random dice roll as a string of eight characters.
     * Dice A should be rolled three times, dice B should be rolled once.
     * Die A has faces numbered 0-5.
     * Die B has faces numbered 0-2.
     * Each die roll is composed of a character 'A' or 'B' representing the dice,
     * followed by a digit character representing the face.
     *
     * @return a String representing the die roll e.g. A0A4A3B2
     */
    public static String generateDiceRoll() {
        // FIXME Task 7: generate a dice roll
        //generate a number between 0-5 for A or 0-2 for B
        //convert number to a char, return string.
        return "A" + (char)(rollNumber(6) + '0') + "A" + (char)(rollNumber(6) + '0')
                + "A" + (char)(rollNumber(6) + '0') + "B" + (char)(rollNumber(2) + '0');
    }

    public static int rollNumber(int max) {
        //generate a number from 0 to max - 1;
        Random rand = new Random();
        int value = rand.nextInt(max);
        return value;
    }

    /**
     * Given the current state of a game board, output an integer representing the sum of all the following factors
     * that contribute to the player's final score.
     * <p>
     * * Number of exits mapped
     * * Number of centre tiles used
     * * Number of dead ends in the network
     *
     * @param boardString a board string representing a completed game
     * @return integer (positive or negative) for score *not* considering longest rail/highway
     */
    public static int getBasicScore(String boardString) {
        // FIXME Task 8: compute the basic score
        return exitScore(boardString) + centerScore(boardString) + errorScore(boardString);
    }

    public static int exitScore(String boardString) {
        return 0;
    }

    public static int centerScore(String boardString) {
        return 0;
    }

    public static int errorScore(String boardString) {
        return 0;
    }

    /**
     * Given a valid boardString and a dice roll for the round,
     * return a String representing an ordered sequence of valid piece placements for the round.
     * @param boardString a board string representing the current state of the game as at the start of the round
     * @param diceRoll a String representing a dice roll for the round
     * @return a String representing an ordered sequence of valid piece placements for the current round
     * @see RailroadInk#generateDiceRoll()
     */
    public static String generateMove(String boardString, String diceRoll) {
        // FIXME Task 10: generate a valid move
        return null;
    }

    /**
     * Given the current state of a game board, output an integer representing the sum of all the factors contributing
     * to `getBasicScore`, as well as those attributed to:
     * <p>
     * * Longest railroad
     * * Longest highway
     *
     * @param boardString a board string representing a completed game
     * @return integer (positive or negative) for final score (not counting expansion packs)
     */
    public static int getAdvancedScore(String boardString) {
        // FIXME Task 12: compute the total score including bonus points
        return longestHighway(boardString) + longestRailway(boardString);
    }

    public static int longestHighway(String boardString) {
        return 0;
    }

    public static int longestRailway(String boardString) {
        return 0;
    }

}

