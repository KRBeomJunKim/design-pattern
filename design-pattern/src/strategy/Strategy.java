package strategy;
	
public class Strategy {

	public static void main(String[] args) {
		System.out.println(calculate(new PlusOperatorStrategy(), 1, 2));
		
	}
	
	static double calculate(OperatorStrategy operator, double result, double number) {
		
		return operator.operate(result, number);
	}

}
