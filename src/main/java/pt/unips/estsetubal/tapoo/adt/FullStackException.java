package pt.unips.estsetubal.tapoo.adt;

public class FullStackException extends RuntimeException {
    public FullStackException(String message) {
        super(message);
    }

    public FullStackException() {
        super("The stack is full.");
    }
}
