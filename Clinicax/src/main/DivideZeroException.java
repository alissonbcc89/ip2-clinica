package main;

public class DivideZeroException extends Exception{
	
	public DivideZeroException()
	{
		super("Divisao por zero impossivel");
	}
	
	public DivideZeroException(String message)
	{
		super(message);
	}

	@Override
	public String toString() {
		return "ERRO:N�o se efetua divis�o por ZERO";
	}

}
