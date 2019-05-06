package comp1110.ass2;

import org.junit.Test;

import static org.junit.Assert.*;

//Authored by Harriet
public class RailroadInkTests {
    @Test
    public void testFixOrientation0() {

    }

    @Test
    public void testFixOrientation1() {

    }

    @Test
    public void testFixOrientation2() {

    }

    @Test
    public void testFixOrientation3() {

    }

    @Test
    public void testFixOrientation4() {

    }

    @Test
    public void testFixOrientation5() {

    }

    @Test
    public void testFixOrientation6() {

    }

    @Test
    public void testFixOrientation7() {

    }

    @Test
    public void testFixOrientationTooBig() {

    }

    @Test
    public void testFixOrientationInvalid() {

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
    public void testRollNumberMaxEqualsMin() {
        RailroadInk.rollNumber(0, 0);
    }

}