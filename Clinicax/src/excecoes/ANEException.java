package excecoes;

public class ANEException extends Exception{
	
	private String cod;
	
	public ANEException(String cod)
	{
		super("Animal não existe");
		this.cod = cod;
	}
	
	public void setCod(String cod)
	{
		this.cod = cod;
	}
	
	public String getCod()
	{
		return this.cod;
	}
	

}
