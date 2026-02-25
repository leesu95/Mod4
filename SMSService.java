/**
 * SMSService
 * 
 * Purpose: A concrete notification service that "sends" messages via SMS/text.
 * 
 * @author Suzy Lee
 */
public class SMSService implements NotificationMedium {
	@Override
	public void send(String message) {
		System.out.println("Sending SMS notification: " + message);
	}
}
