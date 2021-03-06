public class MyArraySizeException extends Exception {
    private int size;

    public int getSize() {
        return size;
    }

    public MyArraySizeException(int size) {
        this.size = size;
    }

    public MyArraySizeException(String s, int size) {
        super(s);
        this.size = size;
    }
}