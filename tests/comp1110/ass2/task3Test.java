package comp1110.ass2;

import org.junit.Test;


import static org.junit.Assert.assertFalse;

//Authored by Bojie

public class task3Test {

    @Test
    public void boardStringWellFormedone() {
        for (String test : boardStringWellFormedone) {
            assertFalse("Placement sequence '" + test + "' is cover, but passed ", RailroadInk.isTilePlacementWellFormed(test));
        }
    }


    @Test

    public void boardStringWellFormedtwo() {
        for (String test : boardStringWellFormedtwo) {
            assertFalse("Placement sequence '" + test + "' is valid, but failed ", RailroadInk.isTilePlacementWellFormed(test));
        }
    }


    @Test
    public void boardStringWellFormedthree() {
        for (String test : boardStringWellFormedthree) {
            assertFalse("Placement sequence '" + test + "' is valid, but failed ", RailroadInk.isTilePlacementWellFormed(test));
        }
    }


    static final String[] boardStringWellFormedone = {
            "A1F10A2F16A3F17A4F22S1G27",
            "A3B10S3B10B2B12"
    };
    static final String[] boardStringWellFormedtwo = {

            "A3D61A3D53B0C52A0B52A2B63A4D41B0E60A0F61A3D31A3D23A2G30B0F34A3E32A1B01B2B10A0A63A1G41S2D10B2A10B0A30A4E21A3C31",
            "A4A50A1F61A0B61S5F50B1F46A1F01S1F12A2F23A1E20B2D21S0D01A1C20A0B22B1A61A4D11A4G10B1G44A2G30A3C01A3C12B0B31A1B01A4B50B0C50A2F32A0E32A0E40A4D31B1D47A1B11"
    };

    static final String[] boardStringWellFormedthree = {
            "A3A52A2B61A0C60A4A41S5B34B0D32A2C50A3D12B2B10A0G00A4D01B1A27S3B20A4C10A1D50A0F23B2G25A3E30A4E41",
            "A2A30A0A43A3A50B2B50A4C50A3B20B0G12A2B33A4E50A2B21B1G45B2F41A3F33A1E40A3E32A3E27S0E12B1D17A1B61"
    };


}
