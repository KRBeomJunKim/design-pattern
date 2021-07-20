package state;

public class VendingMachine {
	
	private State state;
	private int coin;
	
	public VendingMachine() {
		this.state = new NoCoinState();
		this.coin=0;
	}
	
	public void insertCoin(final int coin) {
		state.increaseCoin(coin, this);
	}
	
	public void increaseCoin(final int coin) {
		this.coin += coin;
	}
	
	public void changeState(final State state) {
		this.state = state;
	}
	
	public void returnCoin(final int coin) {
		System.out.println("��ǰ�� ǰ���Ǿ����ϴ�.");
		System.out.println(coin + "���� �ٽ� �����ñ� �ٶ��ϴ�.");
	}
	
	public void buyProduct() {
		state.buyProduct(this);
	}
	
	public void provideProduct() {
		System.out.println("��ǰ�� ���������� �����Ͽ����ϴ�.");
	}
	
	public void decreaseCoin() {
		coin--;
	}
	
	public boolean hasNoCoin() {
		return coin == 0;
	}
	
	public State getState() {
		return state;
	}
	
	public int getCoin() {
		return coin;
	}
}
