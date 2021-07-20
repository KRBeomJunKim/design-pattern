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
		System.out.println("상품이 품절되었습니다.");
		System.out.println(coin + "원을 다시 받으시길 바랍니다.");
	}
	
	public void buyProduct() {
		state.buyProduct(this);
	}
	
	public void provideProduct() {
		System.out.println("제품을 성공적으로 구매하였습니다.");
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
