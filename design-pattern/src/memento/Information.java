package memento;

public class Information {
	private String data1;
	private int data2;
	
	public Information(String data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public Memento CreateMemento() {
		return new Memento(this.data1, this.data2);
	}
	
	public void restoreMemento(Memento memento) {
		this.data1 = memento.getData1();
		this.data2 = memento.getData2();
	}

	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}

	public int getData2() {
		return data2;
	}

	public void setData2(int data2) {
		this.data2 = data2;
	}

}
