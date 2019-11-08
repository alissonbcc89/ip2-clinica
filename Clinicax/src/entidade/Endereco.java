package entidade;

public class Endereco {
	//implementar cod do cliente ou id do endereco?
	private String codigo;
	private String rua;
	private String bairro;
	private String cep;
	private String estado;
	private String numero;
	private String pais;
	private Pessoa pessoa;

	public Endereco(String rua, String bairro, String cep, String estado, String numero, String pais, String codigo) {
		
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.estado = estado;
		this.numero = numero;
		this.pais = pais;
		this.codigo = codigo;
		
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
	
	public void setCodigo()
	{
		this.codigo = pessoa.getCpf();
	}
	
	public String getId()
	{
		return this.codigo;
	}

	
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", cep=" + cep + ", estado=" + estado + ", numero="
				+ numero + ", pais=" + pais + "]";
	}
	
}
