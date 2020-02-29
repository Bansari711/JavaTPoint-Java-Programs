
public class PalindromeNumber {

	public static void main(String[] args) {

		int inputNumber = 1821;
		
		System.out.println("Output using String class:");
		if (isPalindromeUsingString(inputNumber)) {
			System.out.println(inputNumber + " is a palindrome number.");
		} else {
			System.out.println(inputNumber + " is not a palindrome number.");
		}

		System.out.println("\nOutput without using String class:");
		if (isPalindromeWithoutUsingString(inputNumber)) {
			System.out.println(inputNumber + " is a palindrome number.");
		} else {
			System.out.println(inputNumber + " is not a palindrome number.");
		}
	}

	public static boolean isPalindromeUsingString(int inputNumber) {

		String strInput = String.valueOf(inputNumber);
		String strReverse = "";

		for (int i = strInput.length() - 1; i >= 0; i--) {
			strReverse += strInput.charAt(i);
		}

		if (strInput.equals(strReverse)) {
			return true;
		}
		return false;
	}

	public static boolean isPalindromeWithoutUsingString(int inputNumber) {

		int sum = 0;
		int n = inputNumber;

		while (n > 0) {
			int remainder = n % 10;
			sum = (sum * 10) + remainder;
			n = n / 10;
		}

		if (sum == inputNumber) {
			return true;
		}
		return false;
	}
}
