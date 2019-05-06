package comp1110.ass2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

//Authored by Harriet
public class RailroadInkTests {



    //All features arrays are from data found from assets/RotationImages.png
    @Test
    public void testFixOrientation0() {
        String tileString = "A0A10";
        char[] featuresOfA00 = {'r', 'n', 'n', 'r'};
        char[] orientatedFeatures = RailroadInk.fixOrientation(tileString);
        assertArrayEquals("Incorrect orientation, expected " + new String(featuresOfA00) +
                " but got: " + new String(orientatedFeatures), featuresOfA00, orientatedFeatures);
    }

    @Test
    public void testFixOrientation1() {
        String tileString = "A0A11";
        char[] featuresOfA01 = {'r', 'r', 'n', 'n'};
        char[] orientatedFeatures = RailroadInk.fixOrientation(tileString);
        assertArrayEquals("Incorrect orientation, expected " + new String(featuresOfA01) +
                " but got: " + new String(orientatedFeatures), featuresOfA01, orientatedFeatures);
    }

    @Test
    public void testFixOrientation2() {
        String tileString = "A0A12";
        char[] featuresOfA02 = {'n', 'r', 'r', 'n'};
        char[] orientatedFeatures = RailroadInk.fixOrientation(tileString);
        assertArrayEquals("Incorrect orientation, expected " + new String(featuresOfA02) +
                " but got: " + new String(orientatedFeatures), featuresOfA02, orientatedFeatures);
    }

    @Test
    public void testFixOrientation3() {
        String tileString = "A0A13";
        char[] featuresOfA03 = {'n', 'n', 'r', 'r'};
        char[] orientatedFeatures = RailroadInk.fixOrientation(tileString);
        assertArrayEquals("Incorrect orientation, expected " + new String(featuresOfA03) +
                " but got: " + new String(orientatedFeatures), featuresOfA03, orientatedFeatures);
    }

    @Test
    public void testFixOrientation4() {
        String tileString = "A0A14";
        char[] featuresOfA04 = {'r', 'r', 'n', 'n'};
        char[] orientatedFeatures = RailroadInk.fixOrientation(tileString);
        assertArrayEquals("Incorrect orientation, expected " + new String(featuresOfA04) +
                " but got: " + new String(orientatedFeatures), featuresOfA04, orientatedFeatures);
    }

    @Test
    public void testFixOrientation5() {
        String tileString = "A0A15";
        char[] featuresOfA05 = {'n', 'r', 'r', 'n'};
        char[] orientatedFeatures = RailroadInk.fixOrientation(tileString);
        assertArrayEquals("Incorrect orientation, expected " + new String(featuresOfA05) +
                " but got: " + new String(orientatedFeatures), featuresOfA05, orientatedFeatures);
    }

    @Test
    public void testFixOrientation6() {
        String tileString = "A0A16";
        char[] featuresOfA06 = {'n', 'n', 'r', 'r'};
        char[] orientatedFeatures = RailroadInk.fixOrientation(tileString);
        assertArrayEquals("Incorrect orientation, expected " + new String(featuresOfA06) +
                " but got: " + new String(orientatedFeatures), featuresOfA06, orientatedFeatures);
    }

    @Test
    public void testFixOrientation7() {
        String tileString = "A0A17";
        char[] featuresOfA07 = {'r', 'n', 'n', 'r'};
        char[] orientatedFeatures = RailroadInk.fixOrientation(tileString);
        assertArrayEquals("Incorrect orientation, expected " + new String(featuresOfA07) +
                " but got: " + new String(orientatedFeatures), featuresOfA07, orientatedFeatures);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFixOrientationTooBig() {
        String tileString = "A0A19";
        char[] orientatedFeatures = RailroadInk.fixOrientation(tileString);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFixOrientationInvalidPlacementString() {
        String tileString = "A0A9-1";
        char[] orientatedFeatures = RailroadInk.fixOrientation(tileString);
    }

    @Test
    public void testConnectionLocationNorth() {

    }

    @Test
    public void testConnectionLocationSouth() {

    }

    @Test
    public void testConnectionLocationEast() {

    }

    @Test
    public void testConnectionLocationWest() {

    }

    @Test
    public void testConnectionLocationNone() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectionLocationInvalidPlacementStringA() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectionLocationInvalidPlacementStringB() {

    }


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

}