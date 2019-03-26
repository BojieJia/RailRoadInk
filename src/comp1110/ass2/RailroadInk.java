package comp1110.ass2;

import java.sql.SQLOutput;

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
        return false;
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
        char number = (char)rollNumber();
        return "" + number;
    }

    public static int rollNumber() {
        //randomly generate number 1-6
        return 1;
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

    public static void main(String[] args) {
        isTilePlacementWellFormed("B2C03");
    }
}

