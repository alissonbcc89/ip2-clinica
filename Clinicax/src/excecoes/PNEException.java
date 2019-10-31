package excecoes;

public class PNEException extends Exception {
	
	private String ctps;
	
	public PNEException(String ctps)
	{
		super("Pessoa n�o existe em nosso banco de dado");
		this.ctps =ctps;
	}

	public String getCpf() {
		return ctps;
	}

	public void setCpf(String ctps) 
	{
		this.ctps = ctps;
	}	

}
