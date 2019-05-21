package comp1110.ass2;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

//Authored by Harriet
public class RailroadInkTests {

    //Tests for RailroadInk.fixOrientation()
    //All features arrays are from data found from assets/RotationImages.png
    static final String[][] fixOrientationTesters = {
            {"A4A50", "hnhn"},
            {"B2G51", "rhrh"},
            {"S1B37", "rrrh"},
            {"B0D34", "hnrn"},
            {"A2B43", "rrnr"},
            {"A1A45", "nrnr"},
            {"S3B32", "rrrr"},
            {"S1B35", "rhrr"},

            {"A0A10", "rnnr"},
            {"A0A11", "rrnn"},
            {"A0A12", "nrrn"},
            {"A0A13", "nnrr"},

            {"A0A14", "rrnn"},
            {"A0A15", "nrrn"},
            {"A0A16", "nnrr"},
            {"A0A17", "rnnr"}
    };

    static final String[] invalidOrientation = {
            "A4A58",
            "B2G59",
            "S1B38",
            "B0D34"
    };

    static final String[] orientationStringTooLong = {
            "A4AA58",
            "B245G59",
            "S12B38",
            "B0D3-1"
    };

    @Test
    public void testFixOrientationDifferent() {
        for (String[] str : fixOrientationTesters) {
            char[] orientatedFeatures = RailroadInk.fixOrientation(str[0]);
            assertArrayEquals("Not valid", orientatedFeatures, str[1].toCharArray());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFixOrientationTooBig() {
        for (String str : invalidOrientation) {
            RailroadInk.fixOrientation(str);
        }
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFixOrientationPlacementStringTooLong() {
        for (String str : orientationStringTooLong) {
            RailroadInk.fixOrientation(str);
        }
    }

    //Tests for RailroadInk.connectionLocation()
    //All features arrays are from data found from assets/RotationImages.png
    static final String[][] connectionNorth = {
            {"A4B50", "A3A53"},
            {"B2G51", "S3F51"},
            {"S1B37", "A2A32"}
    };

    static final String[][] connectionEast = {
            {"B2A50", "A5A60"},
            {"A2D13", "A1D21"},
            {"S4C20", "S5C33"}
    };

    static final String[][] connectionSouth = {
            {"A4A50", "S2B50"},
            {"A5D45", "B2E42"},
            {"S1B37", "S2C31"}
    };

    static final String[][] connectionWest = {
            {"A4A51", "B0A41"},
            {"B2G51", "S5G42"},
            {"S1B37", "A3B21"}
    };

    static final String[][] connectionNone = {
            {"A4A50", "S2G11"},
            {"B2G51", "A4A27"},
            {"S1B37", "B2D61"}
    };

    static final String[][] invalidA = {
            {"A4A59", "S2G11"},
            {"B2S51", "A4A27"},
            {"P1B37", "B2D61"}
    };

    static final String[][] invalidB = {
            {"A4A50", "S2G111"},
            {"B2G51", "A4A29"},
            {"S1B37", "B1A97"}
    };

    @Test
    public void testConnectionLocationNorth() {
        for (String[] str : connectionNorth) {
            char i = RailroadInk.connectionLocation(str[0], str[1]);
            assertEquals("Got " + i + " but expected " + "n", i, 'n');
        }
    }

    @Test
    public void testConnectionLocationSouth() {
        for (String[] str : connectionSouth) {
            char i = RailroadInk.connectionLocation(str[0], str[1]);
            assertEquals("Got " + i + " but expected " + "n", i, 's');
        }
    }

    @Test
    public void testConnectionLocationEast() {
        for (String[] str : connectionEast) {
            char i = RailroadInk.connectionLocation(str[0], str[1]);
            assertEquals("Got " + i + " but expected " + "n", i, 'e');
        }
    }

    @Test
    public void testConnectionLocationWest() {
        for (String[] str : connectionWest) {
            char i = RailroadInk.connectionLocation(str[0], str[1]);
            assertEquals("Got " + i + " but expected " + "n", i, 'w');
        }
    }

    @Test
    public void testConnectionLocationNone() {
        for (String[] str : connectionNone) {
            char i = RailroadInk.connectionLocation(str[0], str[1]);
            assertEquals("Got " + i + " but expected " + "f", i, 'f');
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectionLocationInvalidPlacementStringA() {
        for (String[] str : invalidA) {
            RailroadInk.connectionLocation(str[0], str[1]);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectionLocationInvalidPlacementStringB() {
        for (String[] str : invalidB) {
            RailroadInk.connectionLocation(str[0], str[1]);
        }
    }





    //Tests for RailroadInt.rollNumber
    @Test
    public void testRollNumber() {
        int number = RailroadInk.rollNumber(10, 1);
        assertFalse("Generated a number greater than max", number > 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRollNumberNegativeMax() {
        RailroadInk.rollNumber(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRollNumberMaxLessThanMin() {
        RailroadInk.rollNumber(1, 14);
    }

    @Test()
    public void testRollNumberMaxEqualsMin() {
        int max = 0;
        int min = 0;
        int number = RailroadInk.rollNumber(max, min);
        assertEquals("Got " + number + " but expected " + max, number, 0);
    }


    //Test for RailroadInk.boardListToBoardString
    @Test()
    public void testBoardListToBoardStringThreeStrings() {
        HashMap<String, String> board = new HashMap<>();
        board.put("A5", "A4A59");
        board.put("G1", "S2G11");
        board.put("G4", "S5G42");
        String list = RailroadInk.boardListToBoardString(board);
        assertEquals("Got " + list + " but expected " + "A4A59S2G11S5G42", list, "A4A59S2G11S5G42");
    }

}