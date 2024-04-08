package hotel;

public class AlreadyExistException extends Exception {

    public AlreadyExistException() {
    super("This ID already exists in the system.");
    }


    public AlreadyExistException(String message) {
    super(message);
    }

    public String getErrorMessage() {
    return this.getMessage();
    }
}



