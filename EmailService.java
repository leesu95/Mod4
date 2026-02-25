/**
 * EmailService
 * 
 * Purpose: A concrete notification service that sends messages via email
 * 
 * @author Suzy Lee
 */
public class EmailService implements NotificationMedium {
	
	/**
	 * Sends a message via email (simulated with console output)
	 * 
	 * @param message the message to send
	 */
	@Override
	public void send(String message) {
		System.out.println("Sending email: " + message);
	}
}
