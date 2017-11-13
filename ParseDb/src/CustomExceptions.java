
public class CustomExceptions extends Exception {

    public CustomExceptions (Throwable error) {
        initCause(error);
    }

}
