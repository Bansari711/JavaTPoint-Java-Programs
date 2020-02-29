
public class FibonacciSeries {

	static int a = 0;
	static int b = 1;
	static int count = 10;

	public static void main(String[] args) {

		System.out.print(a + " " + b + " ");
		fibonacciSeriesWithoutRecursion(count);

		a = 0;
		b = 1;
		System.out.print("\n" + a + " " + b + " ");
		fibonacciSeriesWithtRecursion(count - 2);
	}

	public static void fibonacciSeriesWithoutRecursion(int count) {

		for (int i = 2; i < count; i++) {
			int temp = b;
			b = a + b;
			a = temp;
			System.out.print(b + " ");
		}
	}

	public static void fibonacciSeriesWithtRecursion(int count) {

		if (count > 0) {
			int temp = b;
			b = a + b;
			a = temp;
			System.out.print(b + " ");
			fibonacciSeriesWithtRecursion(count - 1);
		}
	}
}
