package strategy;

public class MultiplyOperatorStrategy implements OperatorStrategy{

	@Override
	public double operate(double result, double number) {
		return result * number;
	}

}
