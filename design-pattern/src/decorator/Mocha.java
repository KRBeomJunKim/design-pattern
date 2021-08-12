package decorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		description = "¸ğÄ«";
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " , " + description;
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}
	
}
