
public class sender {
	private receiver receiver;
	// constructor
    public sender(receiver receiver) {
        this.receiver = receiver;
    }
    // function to send a message to a receiver object
    public void sendMessage(String content) {
        message message = new message(content);
        receiver.receiveMessage(message);
    }
}
