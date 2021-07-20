package strategy;

public class PlusOperatorStrategy implements OperatorStrategy{

	@Override
	public double operate(double result, double number) {
		return result + number;
	}

}
