package strategy;

@FunctionalInterface
public interface OperatorStrategy {
	double operate(double result, double number);
}
