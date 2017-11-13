
public class CustomExceptions extends Exception {

    public CustomExceptions (Throwable ex) {
        initCause(ex);
    }

}
