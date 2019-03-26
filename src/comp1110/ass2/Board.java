package comp1110.ass2;

public enum Board {
    A0("NULL", "NULL", 100, 100),
    A1("NULL", "NULL", 200, 100),
    A2("NULL", "NULL", 300, 100),
    A3("NULL", "NULL", 400, 100),
    A4("NULL", "NULL", 500, 100),
    A5("NULL", "NULL", 600, 100),
    A6("NULL", "NULL", 700, 100),

    B0("NULL", "NULL", 100, 200),
    B1("NULL", "NULL", 200, 200),
    B2("NULL", "NULL", 300, 200),
    B3("NULL", "NULL", 400, 200),
    B4("NULL", "NULL", 500, 200),
    B5("NULL", "NULL", 600, 200),
    B6("NULL", "NULL", 700, 200),

    C0("NULL", "NULL", 100, 300),
    C1("NULL", "NULL", 200, 300),
    C2("NULL", "NULL", 300, 300),
    C3("NULL", "NULL", 400, 300),
    C4("NULL", "NULL", 500, 300),
    C5("NULL", "NULL", 600, 300),
    C6("NULL", "NULL", 700, 300),

    D0("NULL", "NULL", 100, 400),
    D1("NULL", "NULL", 200, 400),
    D2("NULL", "NULL", 300, 400),
    D3("NULL", "NULL", 400, 400),
    D4("NULL", "NULL", 500, 400),
    D5("NULL", "NULL", 600, 400),
    D6("NULL", "NULL", 700, 400),

    E0("NULL", "NULL", 100, 500),
    E1("NULL", "NULL", 200, 500),
    E2("NULL", "NULL", 300, 500),
    E3("NULL", "NULL", 400, 500),
    E4("NULL", "NULL", 500, 500),
    E5("NULL", "NULL", 600, 500),
    E6("NULL", "NULL", 700, 500),

    F0("NULL", "NULL", 100, 600),
    F1("NULL", "NULL", 200, 600),
    F2("NULL", "NULL", 300, 600),
    F3("NULL", "NULL", 400, 600),
    F4("NULL", "NULL", 500, 600),
    F5("NULL", "NULL", 600, 600),
    F6("NULL", "NULL", 700, 600),

    G0("NULL", "NULL", 100, 700),
    G1("NULL", "NULL", 200, 700),
    G2("NULL", "NULL", 300, 700),
    G3("NULL", "NULL", 400, 700),
    G4("NULL", "NULL", 500, 700),
    G5("NULL", "NULL", 600, 700),
    G6("NULL", "NULL", 700, 700);

    public String piece;
    public String features;
    public int x;
    public int y;

    Board(String piece, String features, int x, int y) {
        this.piece = piece;
        this.features = features;
        this.x = x;
        this.y = y;
    }
}