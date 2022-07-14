package calculator;

import exception.CalculatorException;

public class Calculator {
	
	public static final double PI = 3.141593;

	public int sum(int a, int b) {
		return a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a - b;
	}

	public double subtraction(double a, double b) {
		return a - b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public double multiplication(double a, double b) {
		return a * b;
	}

	public double division(int a, int b) {
		if (b == 0) {
			throw new CalculatorException("No division by 0 is allowed!");
		}
		return 1d * a / b;
	}

	public double division(double a, double b) {
		if (b == 0) {
			throw new CalculatorException("No division by 0 is allowed!");
		}
		return a / b;
	}

	public int pow(int a, int b) {
		return (int) Math.pow(a, b);
	}

	public double root(double a, double b) {
		return Math.pow(a, 1.0 / b);
	}

	public int fibonacci(int a) {
		int low = 0;
		int high = 1;
		int result = 0;
		if (a == 0) {
			return low;
		}
		if (a == 1) {
			return high;
		}
		for (int i=1; i<a; i++) {
			result = high + low;
			low = high;
			high = result;
		}
		return result;
	}

	public boolean checkPrimeNumber(int a) {
		if (a % 2 == 0 || a % 3 == 0) {
			return false;
		}
		for (int aux = 5; aux < a; aux+=2) {
			if (a % aux == 0) {
				return false;
			}
		}
		return true;
	}

	public double circleArea(double radiusMeters) {
		return radiusMeters * radiusMeters * PI;
	}
}
