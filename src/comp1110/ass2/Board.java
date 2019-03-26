package comp1110.ass2;

public enum Board {
    A0("NULL", "NULL");

    public String piece;
    public String featues;

    Board(String piece, String featues) {
        this.piece = piece;
        this.featues = featues;
    }
}