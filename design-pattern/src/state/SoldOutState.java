package state;

public class SoldOutState implements State{

	@Override
	public void increaseCoin(int coin, VendingMachine vendingMachine) {
		vendingMachine.returnCoin(coin);
	}

	@Override
	public void buyProduct(VendingMachine vendingMachine) {
		System.out.println("��ǰ�� ǰ���Ǿ����ϴ�.");
	}

}
