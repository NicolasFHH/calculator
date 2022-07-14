package calculator;

import exception.CalculatorException;

public class Calculator {
	
	public int soma(int a, int b) {
		return a + b;
	}
	
	public double soma(double a, double b) {
		return a + b;
	}
	
	public int subtracao(int a, int b) {
		return a - b;
	}
	
	public double subtracao(double a, double b) {
		return a - b;
	}
	
	public int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public double multiplicacao(double a, double b) {
		return a * b;
	}
	
	public double divisao(int a, int b) {
		if (b == 0) {
			throw new CalculatorException("Não é permitido fazer uma divisão por 0!");
		}
		else {
			return a / b;
		}
	}
	
	public double divisao(double a, double b) {
		if (b == 0) {
			throw new CalculatorException("Não é permitido fazer uma divisão por 0!");
		}
		else {
			return a / b;
		}
	}
	
	public int potencia(int a, int b) {
		return (int) Math.pow(a, b);
	}
	
	public double raiz(double a, double b) {
		return Math.pow(a, 1.0/b);
	}
	
	public int fibonacci(int a) {
		if (a == 0) {
			return 0;
		}
		else {
			if (a == 1) {
				return 1;
			}
			else {
				return fibonacci(a - 1) + fibonacci(a - 2);
			}
		}
	}
	
	public boolean checadorDePrimos(int a) {
		int aux;
		for (aux=2; aux<a; aux++) {
			if (a % aux == 0) {
				return false;
			}
		}
		return true;
	}
	
	public double areaDoCirculo (double raioEmMetros) {
		double pi = 3.141593;
		return raioEmMetros * raioEmMetros * pi;
	}
}
