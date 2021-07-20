package observer;

import observer.Coach.Crew;

public class Tiber implements Crew{

	@Override
	public void update(String msg) {
		System.out.println("Tiber ¼ö½Å : " + msg);
	}

}
