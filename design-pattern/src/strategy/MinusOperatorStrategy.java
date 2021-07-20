package strategy;

public class MinusOperatorStrategy implements OperatorStrategy{

	@Override
	public double operate(double result, double number) {
		return result - number;
	}

}
