/**
 * WhatsAppService
 * 
 * Purpose: A concrete notification servie that 'sends' messages via WhatsApp.
 * 
 * @author Suzy Lee
 */
public class WhatsAppService implements NotificationMedium {
	/**
	 * Sends the message via WhatsApp.
	 * 
	 * @param message The message to send
	 */
	@Override
	public void send(String message) {
		System.out.println("[WhatsApp] Sending message: " + message);
	}
}
