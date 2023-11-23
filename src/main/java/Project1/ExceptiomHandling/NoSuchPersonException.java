package Project1.ExceptiomHandling;

public class NoSuchPersonException extends RuntimeException{
    public NoSuchPersonException(String message) {
        super(message);
    }
}
