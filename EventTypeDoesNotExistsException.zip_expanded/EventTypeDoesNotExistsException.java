@SuppressWarnings("serial")
public class EventTypeDoesNotExistsException extends RuntimeException {
	String exceptionMessage = "EventTypeDoesNotExistsException: No event type available with the given id";

	public EventTypeDoesNotExistsException() {
	}

	public EventTypeDoesNotExistsException(String msg) {
		this.exceptionMessage = "EventTypeDoesNotExistsException: " + msg;
	}

	public String toString() {
		return this.exceptionMessage;
	}
}