package gov.irs;

public class IllegalWageException extends Exception{

  // why does this not have more lines. it does it automatically, but it is hidden
  public IllegalWageException() {
  }

  public IllegalWageException(String message) {
    super(message);
  }

  public IllegalWageException(String message, Throwable cause) {
    super(message, cause);
  }

  public IllegalWageException(Throwable cause) {
    super(cause);
  }
}
