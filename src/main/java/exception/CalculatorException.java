package exception;

public class CalculatorException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public CalculatorException(String msg) {
		super(msg);
	}

}
