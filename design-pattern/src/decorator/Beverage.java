package decorator;

public abstract class Beverage {
	String description = "���� ����";
	
	public String getDescription() {return description;}
	public abstract double cost();
	
	@Override
	public String toString() {
		return getDescription() + ": $" + cost();
	}
}
