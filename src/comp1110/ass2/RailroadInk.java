package comp1110.ass2;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Random;

public class RailroadInk {



    public HashMap<String, String> board = new HashMap<>();

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

        if(tilePlacementString.length()!= 5) {
            throw new IllegalArgumentException("Invalid placement String: String too long");
        } else if (!isTilePlacementWellFormed(tilePlacementString)){
            throw new IllegalArgumentException("Invalid placement String");
        }

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
                } else {
                    throw new IndexOutOfBoundsException("Tried to pass an invalid orientation");
                }
            }
        }

        char[] features = {n, e, s, w};

        return features;
    }

    //Authored by Harriet
    public static char connectionLocation(String tilePlacementStringA, String tilePlacementStringB) {

        if (!isTilePlacementWellFormed(tilePlacementStringA)){
            throw new IllegalArgumentException("Invalid placement String: tilePlacementStringA");
        } else if (!isTilePlacementWellFormed(tilePlacementStringB)){
            throw new IllegalArgumentException("Invalid placement String: tilePlacementStringB");
        }

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

    //Authored by Bojie
    public static boolean notCover(String boardString) {
        for (int i = 0; i < boardString.length(); i += 5) {
            for (int j = 0; j < boardString.length(); j += 5) {
                String s1 = boardString.substring(i, i + 5);
                String s2 = boardString.substring(j, j + 5);
                if (i != j && s1.charAt(2) == s2.charAt(2) && s1.charAt(3) == s2.charAt(3)) {
                    return false;
                }
            }
        }
        return true;
    }

    //Authored by Bojie
    public static boolean isExit(String boardString) {

        boolean haveExit = false;
        for (int i = 0; i < boardString.length(); i +=5) {
            String s = boardString.substring(i, i + 5);
            String t = s.substring(0, 2) + s.charAt(4);
            Tile tile = Tile.valueOf(t);

            if (s.charAt(2) == 'A' && (s.charAt(3) == '1' || s.charAt(3) == '5')) {
                if (tile.north == 1) {
                    haveExit = true;
                } else if (tile.north == 2) {
                    return false;
                }
            }
            if (s.charAt(2) == 'A' && s.charAt(3) == '3') {
                if (tile.north == 2) {
                    haveExit = true;
                } else if (tile.north == 1) {
                    return false;
                }
            }
            if (s.charAt(2) == 'B' && s.charAt(3) == '0') {
                if (tile.west == 2) {
                    haveExit = true;
                } else if (tile.west == 1) {
                    return false;
                }
            }
            if (s.charAt(2) == 'B' && s.charAt(3) == '6') {
                if (tile.east == 2) {
                    haveExit = true;
                } else if (tile.east == 1) {
                    return false;
                }
            }
            if (s.charAt(2) == 'D' && s.charAt(3) == '0') {
                if (tile.west == 1) {
                    haveExit = true;
                } else if (tile.west == 2) {
                    return false;
                }
            }
            if (s.charAt(2) == 'D' && s.charAt(3) == '6') {
                if (tile.east == 1) {
                    haveExit = true;
                } else if (tile.east == 2) {
                    return false;
                }
            }
            if (s.charAt(2) == 'F' && s.charAt(3) == '0') {
                if (tile.west == 2) {
                    haveExit = true;
                } else if (tile.west == 1) {
                    return false;
                }
            }
            if (s.charAt(2) == 'F' && s.charAt(3) == '6') {
                if (tile.east == 2) {
                    haveExit = true;
                } else if (tile.east == 1) {
                    return false;
                }
            }
            if (s.charAt(2) == 'G' && (s.charAt(3) == '1' || s.charAt(3) == '5')) {
                if (tile.south == 1) {
                    haveExit = true;
                } else if (tile.south == 2) {
                    return false;
                }
            }
            if (s.charAt(2) == 'G' && s.charAt(3) == '3') {
                if (tile.south == 2) {
                    haveExit = true;
                } else if (tile.south == 1) {
                    return false;
                }
            }

        }

        return haveExit;
    }

    //Authored by Bojie
    public static boolean isNeighbor(String boardString){

        boolean connect[] = new boolean[boardString.length()];
        for(int i=0;i<boardString.length();i+=5){
            for(int j=0;j<boardString.length();j+=5){
                String s1=boardString.substring(i,i+5);
                String s2=boardString.substring(j,j+5);
                String t1=s1.substring(0,2)+s1.charAt(4);
                String t2=s2.substring(0,2)+s2.charAt(4);
                Tile tile1=Tile.valueOf(t1);
                Tile tile2=Tile.valueOf(t2);
                char row1=s1.charAt(2);
                char row2=s2.charAt(2);
                char column1=s1.charAt(3);
                char column2=s2.charAt(3);
                if(row1==row2&&(column1-column2)==1){
                    if(tile1.west!=0&&tile1.west==tile2.east) {
                        connect[i] = true;
                    }
                    if (tile1.west!=0&&tile2.east!=0&&tile1.west!=tile2.east){
                        return false;
                    }
                }
                else if (row1==row2&&(column2-column1)==1){
                    if(tile1.east!=0&&tile1.east==tile2.west){
                        connect[i]=true;
                    }

                    if (tile1.east!=0&&tile2.west!=0&&tile1.east!=tile2.west){
                        return false;
                    }
                }
                else if (column1==column2&&(row1-row2)==1){
                    if (tile1.north!=0&&tile1.north==tile2.south){
                        connect[i]=true;
                    }
                    if (tile1.north!=0&&tile2.south!=0&&tile1.north!=tile2.south){
                        return false;
                    }
                }
                else if (column1==column2&&(row2-row1)==1){
                    if (tile1.south!=0&&tile1.south==tile2.north){
                        connect[i]= true;
                    }

                    if (tile1.south!=0 &&tile2.north!=0&&tile1.south!=tile2. north){
                        return false;
                    }
                }
            }
        }//check weather the neighbors are valid

        for(int i=0;i<boardString.length();i+=5) {
            String s=boardString.substring(i,i+5);

            if (!connect[i]&&!isExit(s))  {
                return false;
            }
        }//check if any piece have neighbor
        return true;

    }

    //Authored by Bojie
    public static boolean  isValidPlacementSequence (String boardString)  {
        if(notCover(boardString)&&isExit(boardString)&&isNeighbor(boardString)){
            return true;
        }
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

    //Authored by Harriet
    public static String generateDiceRoll() {
        //generate a number between 0-5 for A or 0-2 for B
        //convert number to a char, return string.
        return "A" + (char)(rollNumber(5, 0) + '0') + "A" + (char)(rollNumber(5, 0) + '0')
                + "A" + (char)(rollNumber(5, 0) + '0') + "B" + (char)(rollNumber(2, 0) + '0');
    }

    //Authored by Harriet
    public static int rollNumber(int max, int min) {
        //generate a number from 0 to max - 1;
        Random rand = new Random();
        int value = rand.nextInt((max - min) + 1) + min;
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
    public static boolean touchExit[] =new boolean[12];
    public static boolean TouchPile []=new boolean[50];
    public static String exits[]=new String[]{"A1","A3","A5","B0","B6","D0","D6","F0","F6","G1","G3","G5"};

    public static int getBasicScore(String boardString) {
        // FIXME Task 8: compute the basic score

        int num=boardString.length()/5;
        int score=0;

        String exitP = "";
        for(int i=0;i<12;i++){
            int exitNum=1;
            int k=0;
            int points=0;
            for(int j=0;j<boardString.length();j+=5){
                String s=boardString.substring(j,j+5);
                String t=s.substring(2,4);
                if(t==exits[i]){
                     exitP=s;
                     k=j/5;
                }
            }
            //find pieces connected with exits
            if(!touchExit[i]){
                touchExit[i] = true;
                int direction[]=new int[]{0,1,2,3};
                for(int j=0;j<4;j++){
                    exitNum+=exitNumber(exitP,k,j,exits[i],boardString);
                }
            }//calculate the total number of exits
            if(exitNum==0){
                points+=0;
            }
            if(exitNum==2){
                points+=4;
            }
            if(exitNum==3){
                points+=8;
            }
            if(exitNum==4){
                points+=12;
            }
            if(exitNum==5){
                points+=16;
            }
            if(exitNum==6){
                points+=20;
            }
            if(exitNum==7){
                points+=24;
            }
            if(exitNum==8){
                points+=28;
            }
            if(exitNum==9){
                points+=32;
            }
            if(exitNum==10){
                points+=36;
            }
            if(exitNum==11){
                points+=40;
            }
            if(exitNum==12){
                points+=45;
            }
            score=points;
        }
        score=score+centreGridNum(boardString)-missEdges(boardString);
       return score;
    }


     public static int whichExit(String piece){
        for(int i=0;i<exits.length;i++){
            String location=piece.substring(2,4);
            if(exits[i]==location){
                return i;
            }
        }
         return -1;
     }

     public static boolean isValidDirection(String string1, String string2, int direction){
        char row1 = string1.charAt(2);
        char row2 = string2.charAt(2);
        char column1 = string1.charAt(3);
        char column2 = string2.charAt(3);
        if(direction==0&&column1==column2&&row1-row2==1){
            return true;
        }
         if(direction==1&&row1==row2&&column2-column1==1){
             return true;
         }
         if(direction==2&&column1==column2&&row2-row1==1){
             return true;
         }
         if(direction==3&&row1==row2&&column1-column2==1){
             return true;
         }
         else
             return false;
        //if direction=0； s2在s1上面；
         // if direction=1: s2 is on the east of s1
         // if direction=2: s2 is on the south of s1
         // if direction=3: s2 is on the west of s1.
     }



    public static int exitNumber(String pieces, int orderOfPieces, int direction, String firstexit,String boardString){
        String location=pieces.substring(2,4);
        if(pieces.charAt(2)=='A'&&direction==0){
            if((pieces.charAt(3)=='1'||pieces.charAt(3)=='3'||pieces.charAt(3)=='5')&&!touchExit[whichExit(pieces)]){
                touchExit[whichExit(pieces)]=true;
                return 1;
            }
            else {
                return 0;
            }
        }
        if(pieces.charAt(2)=='B'&&direction==3){
            if(pieces.charAt(3)=='0'&&!touchExit[whichExit(pieces)]){
                touchExit[whichExit(pieces)]=true;
                return 1;
            }
            else {
                return 0;
            }
        }
        if(pieces.charAt(2)=='B'&&direction==1){
            if(pieces.charAt(3)=='6'&&!touchExit[whichExit(pieces)]){
                touchExit[whichExit(pieces)]=true;
                return 1;
            }
            else {
                return 0;
            }
        }
        if(pieces.charAt(2)=='D'&&direction==3){
            if(pieces.charAt(3)=='0'&&!touchExit[whichExit(pieces)]){
                touchExit[whichExit(pieces)]=true;
                return 1;
            }
            else {
                return 0;
            }
        }
        if(pieces.charAt(2)=='D'&&direction==1){
            if(pieces.charAt(3)=='6'&&!touchExit[whichExit(pieces)]){
                touchExit[whichExit(pieces)]=true;
                return 1;
            }
            else {
                return 0;
            }
        }
        if(pieces.charAt(2)=='F'&&direction==3){
            if(pieces.charAt(3)=='0'&&!touchExit[whichExit(pieces)]){
                touchExit[whichExit(pieces)]=true;
                return 1;
            }
            else {
                return 0;
            }
        }
        if(pieces.charAt(2)=='F'&&direction==1){
            if(pieces.charAt(3)=='6'&&!touchExit[whichExit(pieces)]){
                touchExit[whichExit(pieces)]=true;
                return 1;
            }
            else {
                return 0;
            }
        }
        if(pieces.charAt(2)=='G'&&direction==2){
            if((pieces.charAt(3)=='1'||pieces.charAt(3)=='3'||pieces.charAt(3)=='5')&&!touchExit[whichExit(pieces)]){
                touchExit[whichExit(pieces)]=true;
                return 1;
            }
            else {
                return 0;
            }
        }
        //judge the number of exits on the edge
        int total=0;
        for(int i=0;i<boardString.length();i+=5){
            String s=boardString.substring(i,i+5);
            if(areConnectedNeighbours(s,pieces)&&isValidDirection(pieces,s,direction)&&!touchExit[i/5]) {
                String next=s;
                touchExit[whichExit(pieces)]=true;// 把走过的路标记为true
                if(next.substring(0,2)=="B2"){
                    total +=exitNumber(next,i/5,direction,firstexit,boardString);
                }
                else {
                    total += exitNumber(next, i / 5, 0, firstexit, boardString);
                    total += exitNumber(next, i / 5, 1, firstexit, boardString);
                    total += exitNumber(next, i / 5, 2, firstexit, boardString);
                    total += exitNumber(next, i / 5, 3, firstexit, boardString);
                }
                touchExit[whichExit(pieces)] = false;
            }
        }
        return total;
    }
    public static int centreGridNum(String boardString){
        int num=0;
        for(int i=0;i<boardString.length();i++){
            String location=boardString.substring(i+2,i+4);

            if(location=="C2"||location=="C3"||location=="C4"
            ||location=="D2"||location=="D3"||location=="D4"
                    ||location=="E2"||location=="E3"||location=="E4"){
                num++;
            }
        }
        return num;
    }
    public  static int missEdges(String boardString){
        int num=0;
        for(int i=0;i<boardString.length();i++){
            String str1=boardString.charAt(i)+""+boardString.charAt(i+1)+boardString.charAt(i+4);
            char row1=boardString.charAt(i+2);
            char volumn1=boardString.charAt(i+3);
            Tile tile1=Tile.valueOf(str1);
            //check the north
            for(int j=0;j<boardString.length();j++){
                String str2=boardString.charAt(j)+""+boardString.charAt(j+1)+boardString.charAt(j+4);
                char row2=boardString.charAt(j+2);
                char volumn2=boardString.charAt(j+3);
                Tile tile2=Tile.valueOf(str2);
                if(j!=i&&volumn1==volumn2&&row1-row2==1){
                    if(tile1.north!=0&&tile2.south==0){
                        num++;
                    }
                }//check the north
                if(j!=i&&volumn1==volumn2&&row2-row1==1){
                    if(tile1.south!=0&&tile2.north==0){
                        num++;
                    }
                }//check the south
                if(j!=i&&row1==row2&&volumn1-volumn2==1){
                    if(tile1.west!=0&&tile2.east==1){
                        num++;
                    }
                }//check the west
                if(j!=i&&row1==row2&&volumn2-volumn1==1){
                    if(tile1.east!=0&&tile2.west==1){
                        num++;
                    }
                }

            }

        }
        return num;

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

    public static String boardListToBoardString(HashMap<String, String> boardList) {
        String boardString = "";
        for(String str : boardList.keySet()) {
            char[] tileNameOrientationArray = boardList.get(str).toCharArray();
            boardString = boardString + tileNameOrientationArray[0] + tileNameOrientationArray[1] + str + tileNameOrientationArray[2];
        }

        return boardString;
    }

    public static void main(String[] args) {
        /*{"A4A50", "hnhn"},
        {"B2G51", "rhrh"},
        {"S1B37", "rrrh"},
        {"B0D34", "hnrn"},
        {"A2B43", "rrnr"},
        {"A1A45", "nrnr"},
        {"S3B32", "rrrr"},
        {"S1B35", "rhrr"}*/

        System.out.println(new String(fixOrientation("A4A50")));
        System.out.println(new String(fixOrientation("B2G51")));
        System.out.println(new String(fixOrientation("S1B37")));
        System.out.println(new String(fixOrientation("B0D34")));
        System.out.println(new String(fixOrientation("A2B43")));
        System.out.println(new String(fixOrientation("A1A45")));
        System.out.println(new String(fixOrientation("S3B32")));
        System.out.println(new String(fixOrientation("S1B35")));
    }

}

