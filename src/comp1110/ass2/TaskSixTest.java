package comp1110.ass2;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//@Test
//public void testGood() {
  //      Random r = new Random();

    //    for (int i = 0; i < SampleGames.COMPLETED_GAMES.length; i++) {
      //  String p = SampleGames.COMPLETED_GAMES[i];
       // for (int j = 5; j < p.length(); j += 5) {
       // String test = p.substring(0, j);
       // assertTrue("Placement sequence '" + test + "' is valid, but failed ", RailroadInk.isValidPlacementSequence(test));
        //}
       // }
        //}
public class TaskSixTest {

    @Test
    public void ifIsNotCover(){
        for(String test:notCoverPlacement){
            assertTrue("Placement sequence '" + test + "' is cover, but passed ", RailroadInk.notCover(test));
        }
    }


    @Test

    public void ifIsValidExit(){
        for(String test:notValidExit){
            assertTrue("Placement sequence '" + test + "' is valid, but failed ", RailroadInk.isExit(test));
        }
    }

    @Test
    public void ifIsValidNeighbor(){
        for(String test:inValidNeighbor){
            assertTrue("Placement sequence '" + test + "' is valid, but failed ", RailroadInk.isNeighbor(test));
        }
    }



    static final String[] notCoverPlacement={
            "A3B10A2B20A3B30A4B40S1C10S2C26",
            "B1D02B1D32B1F22B0G00",
            "A3B10S3B10B2B12"
        };
    static final String[] notValidExit={

            "A3D61A3D53B0C52A0B52A2B63A4D41B0E60A0F61A3D31A3D23A2G30B0F34A3E32A1B01B2B10A0A63A1G41S2D10B2A10B0A30A4E21A3C31",
            "A4A50A1F61A0B61S5F50B1F46A1F01S1F12A2F23A1E20B2D21S0D01A1C20A0B22B1A61A4D11A4G10B1G44A2G30A3C01A3C12B0B31A1B01A4B50B0C50A2F32A0E32A0E40A4D31B1D47A1B11"
    };

    static final String[] inValidNeighbor={
            "A3A52A2B61A0C60A4A41S5B34B0D32A2C50A3D12B2B10A0G00A4D01B1A27S3B20A4C10A1D50A0F23B2G25A3E30A4E41",
            "A2A30A0A43A3A50B2B50A4C50A3B20B0G12A2B33A4E50A2B21B1G45B2F41A3F33A1E40A3E32A3E27S0E12B1D17A1B61"
    }

}
