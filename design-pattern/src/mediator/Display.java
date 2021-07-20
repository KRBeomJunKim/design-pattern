package mediator;

public class Display implements IDestination{

	@Override
	public void receiveEvent(String from, String event) {
		System.out.println("Display: form" + from + " event : " + event);
	}

	
}
