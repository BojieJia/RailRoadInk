package comp1110.ass2;

public enum Pieces {

    S0("S0", "0", '0', 'h', 'h', 'r', 'h');

    public String name;
    public String location;
    public char orientation;
    public char north;
    public char south;
    public char east;
    public char west;

    Pieces(String name, String location, char orientation, char north, char south, char east, char west) {
        this.name = name;
        this.location = location;
        this.orientation = orientation;
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

    @Override
    public String toString() {
        return name + location + orientation + north + south + east + west;
    }
}