package strategy;

public class DivideOperatorStrategy implements OperatorStrategy{

	@Override
	public double operate(double result, double number) {
		return result / number;
	}

}
