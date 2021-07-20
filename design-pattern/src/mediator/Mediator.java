package mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	List<IDestination> list = new ArrayList<>();
	
	public void addDestination(IDestination destination) {
		list.add(destination);
	}
	
	public void onEvent(String from, String event) {
		list.stream().forEach(l -> l.receiveEvent(from, event));
	}
}
