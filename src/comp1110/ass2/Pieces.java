package comp1110.ass2;

public enum Pieces {

    S0("S0", 'h', 'h', 'r', 'h'),
    S1("S1", 'h', 'r', 'r', 'r'),
    S2("S2", 'h', 'h', 'h', 'h'),
    S3("S3", 'r', 'r', 'r', 'r'),
    S4("S4", 'h', 'r', 'r', 'h'),
    S5("S5", 'h', 'r', 'h', 'r'),

    A0("A0", 'r', 'n', 'n', 'r'),
    A1("A1", 'r', 'n', 'r', 'n'),
    A2("A2", 'r', 'r', 'r', 'n'),
    A3("A3", 'h', 'h', 'h', 'n'),
    A4("A4", 'h', 'n', 'h', 'n'),
    A5("A5", 'h', 'n', 'n', 'h'),

    B0("B0", 'h', 'n', 'r', 'n'),
    B1("B1", 'h', 'r', 'n', 'n'),
    B2("B2", 'h', 'r', 'h', 'r');


    public String name;
    public char north;
    public char south;
    public char east;
    public char west;

    Pieces(String name, char north, char east, char south, char west) {
        this.name = name;
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

}