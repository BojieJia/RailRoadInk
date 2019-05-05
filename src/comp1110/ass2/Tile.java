package comp1110.ass2;

public enum Tile {
    // redefine the tiles with four numbers
    //the number represent the type of road on each side in a clockwise direction
    //"0" means no way
    //"1" means highway
    //"2" means railway
    S00(1,1,2,1),
    S01(1,1,1,2),
    S02(2,1,1,1),
    S03(1,2,1,1),
    S04(1,1,2,1),
    S05(1,1,1,2),
    S06(2,1,1,1),
    S07(1,2,1,1),

    S10(1,2,2,2),
    S11(2,1,2,2),
    S12(2,2,1,2),
    S13(2,2,2,1),
    S14(1,2,2,2),
    S15(2,1,2,2),
    S16(2,2,1,2),
    S17(2,2,2,1),

    S20(1,1,1,1),
    S21(1,1,1,1),
    S22(1,1,1,1),
    S23(1,1,1,1),
    S24(1,1,1,1),
    S25(1,1,1,1),
    S26(1,1,1,1),
    S27(1,1,1,1),

    S30(2,2,2,2),
    S31(2,2,2,2),
    S32(2,2,2,2),
    S33(2,2,2,2),
    S34(2,2,2,2),
    S35(2,2,2,2),
    S36(2,2,2,2),
    S37(2,2,2,2),

    S40(1,2,2,1),
    S41(1,1,2,2),
    S42(2,1,1,2),
    S43(2,2,1,1),
    S44(1,1,2,2),
    S45(2,1,1,2),
    S46(2,2,1,1),
    S47(1,2,2,1),

    S50(1,2,1,2),
    S51(2,1,2,1),
    S52(1,2,1,2),
    S53(2,1,2,1),
    S54(1,2,1,2),
    S55(2,1,2,1),
    S56(1,2,1,2),
    S57(2,1,2,1),

    A00(2,0,0,2),
    A01(2,2,0,0),
    A02(0,2,2,0),
    A03(0,0,2,2),
    A04(2,2,0,0),
    A05(0,2,2,0),
    A06(0,0,2,2),
    A07(2,0,0,2),

    A10(2,0,2,0),
    A11(0,2,0,2),
    A12(2,0,2,0),
    A13(0,2,0,2),
    A14(2,0,2,0),
    A15(0,2,0,2),
    A16(2,0,2,0),
    A17(0,2,0,2),

    A20(2,2,2,0),
    A21(0,2,2,2),
    A22(2,0,2,2),
    A23(2,2,0,2),
    A24(2,0,2,2),
    A25(2,2,0,2),
    A26(2,2,2,0),
    A27(0,2,2,2),

    A30(1,1,1,0),
    A31(0,1,1,1),
    A32(1,0,1,1),
    A33(1,1,0,1),
    A34(1,0,1,1),
    A35(1,1,0,1),
    A36(1,1,1,0),
    A37(0,1,1,1),

    A40(1,0,1,0),
    A41(0,1,0,1),
    A42(1,0,1,0),
    A43(0,1,0,1),
    A44(1,0,1,0),
    A45(0,1,0,1),
    A46(1,0,1,0),
    A47(0,1,0,1),

    A50(1,0,0,1),
    A51(1,1,0,0),
    A52(0,1,1,0),
    A53(0,0,1,1),
    A54(1,1,0,0),
    A55(0,1,1,0),
    A56(0,0,1,1),
    A57(1,0,0,1),

    B00(1,0,2,0),
    B01(0,1,0,2),
    B02(2,0,1,0),
    B03(0,2,0,1),
    B04(1,0,2,0),
    B05(0,1,0,2),
    B06(2,0,1,0),
    B07(0,2,0,1),

    B10(1,2,0,0),
    B11(0,1,2,0),
    B12(0,0,1,2),
    B13(2,0,0,1),
    B14(1,0,0,2),
    B15(2,1,0,0),
    B16(0,2,1,0),
    B17(0,0,2,1),

    B20(1,2,1,2),
    B21(2,1,2,1),
    B22(1,2,1,2),
    B23(2,1,2,1),
    B24(1,2,1,2),
    B25(2,1,2,1),
    B26(1,2,1,2),
    B27(2,1,2,1);

    int north;
    int east;
    int south;
    int west;

    Tile(int north,int east,int south,int west){
        this.north=north;
        this.east=east;
        this.south=south;
        this.west=west;
    }


}
