/**
 * NotificationMedium
 * 
 * Purpose: A simple interface that represents a way to send a notification message.
 * Diffeent services can implement this interface
 * 
 * @author Suzy Lee
 */

public interface NotificationMedium {
	
	/**
	 * Sends a notification message using this medium
	 * 
	 * @param message the message to send
	 */
	void send(String message);
}
