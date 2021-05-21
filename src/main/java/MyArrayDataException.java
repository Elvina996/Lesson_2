public class MyArrayDataException extends Exception {
    private int Coordinate, Coordinates;

    public String getCoordinates() {
        return "[" + Coordinate + "][" + Coordinates + "]";
    }

    public MyArrayDataException(int Coordinate, int Coordinates) {
        this.Coordinate = Coordinate;
        this.Coordinates = Coordinates;
    }

    public MyArrayDataException(String s, int Coordinate, int Coordinates) {
        super(s);
        this.Coordinate = Coordinate;
        this.Coordinates = Coordinates;
    }
}
