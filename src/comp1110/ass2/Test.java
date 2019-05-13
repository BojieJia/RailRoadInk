package comp1110.ass2;

public class Test {
    public static void main(String[] args) {
        String s="A3A10A3A52A3G10B2F10S1B50A2B61A0C60A1B41B1A35A4A41A2B31A1C30B0D32A2C50A4E10A3D12B2B10A2F01A0G00A4D01B1A27S3B20A4C10A1D50A0F23B2G25A3E30A4E41";

       int i=RailroadInk.missEdges(s);
        System.out.println(i);
        System.out.println(RailroadInk.centreGridNum(s));
        System.out.println(RailroadInk.getBasicScore(s));

    }
}
