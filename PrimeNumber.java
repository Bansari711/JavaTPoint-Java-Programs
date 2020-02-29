
public class PrimeNumber {

	public static void main(String[] args) {

		int inputNumber = 10;
		if (isPrimeNumber(inputNumber)) {
			System.out.println(inputNumber + " is a prime number.");
		} else {
			System.out.println(inputNumber + " is not a prime number.");
		}
	}

	public static boolean isPrimeNumber(int inputNumber) {

		for (int i = 2; i < inputNumber/2; i++) {
			if (inputNumber % i == 0 || inputNumber % (inputNumber + 1 - i) == 0) {
				return false;
			}
		}
		return true;
	}
}
