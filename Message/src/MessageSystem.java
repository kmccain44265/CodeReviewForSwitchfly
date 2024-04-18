
public class MessageSystem {
	public static void main(String[] args) {
		//instantiate sender and receiver
        receiver receiver = new receiver();
        sender sender = new sender(receiver);
        // send some test messages
        sender.sendMessage("Test Msg 1");
        sender.sendMessage("Test Msg 2");
        //show messages that were received
        System.out.println("Message Log:");
        receiver.displayMessages();
    }
}
