package homework;

public class OutOfMaxSizeExeception extends RuntimeException {

    public OutOfMaxSizeExeception() {
        super ();
    }

    public OutOfMaxSizeExeception(String message) {
        super(message);
    }
}
