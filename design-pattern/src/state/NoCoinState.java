package state;

public class NoCoinState implements State{

	@Override
	public void increaseCoin(int coin, VendingMachine vendingMachine) {
		vendingMachine.increaseCoin(coin);
		vendingMachine.changeState(new SelectableState());
	}

	@Override
	public void buyProduct(VendingMachine vendingMachine) {
		System.out.println("동전을 투입한 후 제품을 구매해 주세요.");
	}

}
