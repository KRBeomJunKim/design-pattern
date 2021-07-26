package memento;

public class Memento {
	
	private String data1;
	private int data2;
	
	protected Memento(String data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	protected String getData1() {
		return data1;
	}

	protected int getData2() {
		return data2;
	}
}
