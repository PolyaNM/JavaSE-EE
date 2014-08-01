package lesson1.lecture;

public class OperationsExample {

	public static void main(String[] args) {
		int firstNum = 5;
		short secondNum = 6;
		double doubleNum = 5.0;
		float floatNum = 5.0F;
		
		boolean firstNumIsGreaterThanSecondNum = firstNum > secondNum;
		boolean realNumbersAreEqual = doubleNum == floatNum;
		
		System.out.println("The first number is greater than the second - " + firstNumIsGreaterThanSecondNum);
		System.out.println("The two real numbers are equal - " + realNumbersAreEqual);

	}

}
