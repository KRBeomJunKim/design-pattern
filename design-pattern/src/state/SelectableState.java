package state;

public class SelectableState implements State{

	@Override
	public void increaseCoin(int coin, VendingMachine vendingMachine) {
		vendingMachine.increaseCoin(coin);
	}

	@Override
	public void buyProduct(VendingMachine vendingMachine) {
		vendingMachine.provideProduct();
		vendingMachine.decreaseCoin();
		
		if(vendingMachine.hasNoCoin()) {
			vendingMachine.changeState(new NoCoinState());
		}
	}

}
