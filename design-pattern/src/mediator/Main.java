package mediator;

public class Main {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		ISource tcp = new TcpComm();
		tcp.setMediator(mediator);
		
		mediator.addDestination(new Display());
		
		tcp.eventOccured("connected");
	}
}
