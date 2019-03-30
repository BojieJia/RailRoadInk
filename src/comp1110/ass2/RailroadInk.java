package comp1110.ass2;

import java.sql.SQLOutput;
import java.util.Random;

public class RailroadInk {

    public static void fixOrientation(Pieces e, char orientation) {
        char north = e.north;
        char east = e.east;
        char south = e.south;
        char west = e.west;

        int o = (int) orientation;

        if(orientation < 4) {
            //rotate/cycle features right amount
        } else {
            //flip features then rotate/cycle
        }
    }

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
    public static boolean isTilePlacementWellFormed(String tilePlacementString) {
        boolean firstSecond = false;
        boolean third = false;
        boolean fourth = false;
        boolean fifth = false;

        char[] array = tilePlacementString.toCharArray();


        //check if string is the right length
        if(tilePlacementString.length() == 5) {
            System.out.println("Length");
            if(array[0] == 'A' || array[0] == 'S') {
                //If the first array element is A or S
                if(array[1] <= '5') {
                    //Check that the second element has a number 0 - 5
                    //Set firstSecond to true
                    firstSecond = true;
                } else {
                    //If not return false, save memory
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
    public static boolean isBoardStringWellFormed(String boardString) {
        // FIXME Task 3: determine whether a board string is well-formed

        if(isTilePlacementWellFormed(boardString) && correctTilePlacements(boardString)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean correctTilePlacements(String boardString) {
        //check for N five character tile placements, no more than 3 S

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
    public static boolean areConnectedNeighbours(String tilePlacementStringA, String tilePlacementStringB) {
        // FIXME Task 5: determine whether neighbouring placements are connected

        char[] p1 = tilePlacementStringA.toCharArray();
        char[] p2 = tilePlacementStringB.toCharArray();

        char[] n1 = {p1[0], p1[1]};
        char[] n2 = {p2[0], p2[1]};

        //find the name of the pieces
        String name1 = new String(n1);
        String name2 = new String(n2);

        //initialize feature placements
        //n = north
        //e = east
        //s = south
        //w = west
        char n1n = 'a';
        char n1e = 'b';
        char n1s = 'c';
        char n1w = 'c';

        char n2n = 'e';
        char n2e = 'f';
        char n2s = 'g';
        char n2w = 'h';


        for (Pieces p : Pieces.values()) {
            //check for piece name in pieces enum
            if (p.name().equals(name1)) {
                //set feature placement variables depending on piece's orientation
                if(p1[4] == '0') {
                    n1n = p.north;
                    n1e = p.east;
                    n1s = p.south;
                    n1w = p.west;
                } else if(p1[4] == '1') {
                    n1e = p.north;
                    n1s = p.east;
                    n1w = p.south;
                    n1n = p.west;
                } else if(p1[4] == '2') {
                    n1s = p.north;
                    n1w = p.east;
                    n1n = p.south;
                    n1e = p.west;
                } else if(p1[4] == '3') {
                    n1w = p.north;
                    n1n = p.east;
                    n1e = p.south;
                    n1s = p.west;
                } else if(p1[4] == '4') {
                    n1n = p.north;
                    n1e = p.west;
                    n1s = p.south;
                    n1w = p.east;
                } else if(p1[4] == '5') {
                    n1e = p.north;
                    n1s = p.west;
                    n1w = p.south;
                    n1n = p.east;
                } else if(p1[4] == '6') {
                    n1s = p.north;
                    n1w = p.west;
                    n1n = p.south;
                    n1e = p.east;
                } else if(p1[4] == '7') {
                    n1w = p.north;
                    n1n = p.west;
                    n1e = p.south;
                    n1s = p.east;
                }
            }
        }

        for (Pieces p : Pieces.values()) {
            if (p.name().equals(name2)) {
                if(p2[4] == '0') {
                    n2n = p.north;
                    n2e = p.east;
                    n2s = p.south;
                    n2w = p.west;
                } else if(p2[4] == '1') {
                    n2e = p.north;
                    n2s = p.east;
                    n2w = p.south;
                    n2n = p.west;
                } else if(p2[4] == '2') {
                    n2s = p.north;
                    n2w = p.east;
                    n2n = p.south;
                    n2e = p.west;
                } else if(p2[4] == '3') {
                    n2w = p.north;
                    n2n = p.east;
                    n2e = p.south;
                    n2s = p.west;
                } else if(p2[4] == '4') {
                    n2n = p.north;
                    n2e = p.west;
                    n2s = p.south;
                    n2w = p.east;
                } else if(p2[4] == '5') {
                    n2e = p.north;
                    n2s = p.west;
                    n2w = p.south;
                    n2n = p.east;
                } else if(p2[4] == '6') {
                    n2s = p.north;
                    n2w = p.west;
                    n2n = p.south;
                    n2e = p.east;
                } else if(p2[4] == '7') {
                    n2w = p.north;
                    n2n = p.west;
                    n2e = p.south;
                    n2s = p.east;
                }
            }
        }

        char location = connectionLocation(tilePlacementStringA, tilePlacementStringB);

        if(location == 'n') {
            if(n1n == n2s && n1n != 'n') {
                return true;
            } else {
                return false;
            }
        } else if (location == 'e') {
            if(n1e == n2w && n1e != 'n') {
                return true;
            } else {
                return false;
            }
        } else if (location == 's') {
            if(n1s == n2n && n1s != 'n') {
                return true;
            } else {
                return false;
            }
        } else if (location == 'w') {
            if(n1w == n2e  && n1w != 'n') {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

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

