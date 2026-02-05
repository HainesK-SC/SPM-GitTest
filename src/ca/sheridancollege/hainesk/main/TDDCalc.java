package ca.sheridancollege.hainesk.main;

public class TDDCalc {
	public double divideTwoNumbers(int num1, int num2)
	{
//		double result = num1 / num2;
//		return result;
		double result;
		
		if(num2 != 0) {
			result = num1 / num2;
		}
		else {
			throw new ArithmeticException("Cannot divide by 0");
		}
		return num1 / num2;
	}
}

