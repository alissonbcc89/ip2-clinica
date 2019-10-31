package entidade;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cep;
	private String estado;
	private String numero;
	private String pais;
	private Pessoa pessoa;

	public Endereco(String rua, String bairro, String cep, String estado, String numero, String pais,Pessoa pessoa) {
		
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.estado = estado;
		this.numero = numero;
		this.pais = pais;
		this.pessoa = pessoa; 
	}

	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setPessoa(Pessoa p)
	{
		this.pessoa = p;
	}
	public Pessoa getPessoa()
	{
		return this.pessoa;
	}
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", cep=" + cep + ", estado=" + estado + ", numero="
				+ numero + ", pais=" + pais + "]";
	}
	
}
