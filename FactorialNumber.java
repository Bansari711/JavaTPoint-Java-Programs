
public class FactorialNumber {

	public static void main(String[] args) {

		int inputNumber = 5;

		System.out.println("Without using recursion:\nFactorial of " + inputNumber + " is " + factorialNumber(inputNumber));

		System.out.println(
				"\nUsing recursion:\nFactorial of " + inputNumber + " is " + factorialWithRecursion(inputNumber));
	}

	public static int factorialNumber(int inputNumber) {

		int result = 1;

		for (int i = 1; i <= inputNumber; i++) {
			result = result * i;
		}

		return result;
	}

	public static int factorialWithRecursion(int inputNumber) {

		if (inputNumber == 1) {
			return 1;
		} else {
			return inputNumber * factorialWithRecursion(inputNumber - 1);
		}
	}
}
