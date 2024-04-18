import java.util.ArrayList;
import java.util.List;
public class receiver {
	// List of received messages
	private List<message> messages;
	//constructor
	public receiver() {
		this.messages = new ArrayList<>();
	}
	//function to receive a message from a sender object
	public void receiveMessage(message message) {
	    messages.add(message);
	}
	// function to show all messages received by reeiver from sender
	public void displayMessages() {
	    for (message message : messages) {
	    	System.out.println(message.getContent());
	    }
	}
	
}
