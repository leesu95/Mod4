import java.util.ArrayList;

/**
 * AlertSystem
 * 
 * Purpose: A container class that uses Composition to send notifications.
 * It holds a NotificationMedium that can be swapped at runtime.
 * It also keeps a session log of all messages sent.
 * 
 * @author Suzy Lee
 */
public class AlertSystem {
	
	/**
	 * The current notification medium used (email, sms, etc.)
	 */
	private NotificationMedium medium;
	
	/**
	 * Session log of all messages sent.
	 */
	private ArrayList<String> messageLog;

	/**
	 * Constructs an AlertSystem with an empty log.
	 */
	public AlertSystem() {
		this.messageLog = new ArrayList<String>();
	}

	/**
	 * Sets (or swaps) the current notification medium.
	 * 
	 * @param medium the NotificationMedium to use 
	 */
	public void setMedium(NotificationMedium medium) {
		this.medium = medium;
	}

	/**
	 * Sends a notification using the currently active medium
	 * Also adds the message to the session log.
	 * 
	 * @param message the message to notify the user with
	 */
	public void notifyUser(String message) {
		if (medium == null) {
			System.out.println("ERROR: No notification medium set. Call setMedium(...) first.");
			return;
		}

		medium.send(message);
		messageLog.add(message);
	}

	/**
	 * Returns the session log of all messages sent.
	 * 
	 * @return an ArrayList of all messages sent during this session
	 */
	public ArrayList<String> getMessageLog() {
		return messageLog;
	}

	/**
	 * Main method to demonstrate the AlertSystem functionality.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		AlertSystem alertSystem = new AlertSystem();

		// Start with email
		alertSystem.setMedium(new EmailService());
		alertSystem.notifyUser("This is an email notification.");

		// Swap to SMS
		alertSystem.setMedium(new SMSService());
		alertSystem.notifyUser("This is an SMS notification.");

		// Print the session log
		System.out.println("Session Log:");
		ArrayList<String> log = alertSystem.getMessageLog();
		for (int i = 0; i < log.size(); i++) {
			System.out.println((i + 1) + ". " + log.get(i));
		}
	}
}
