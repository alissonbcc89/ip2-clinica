package entidade;

public abstract class Produto {

	private String cod;
	private String nome;
	private int qnt;
	private double valorVenda;
	private double valorCompra;

	
	public Produto(String cod, String nome, int qnt, double vv, double vc) {
		this.cod = cod;
		this.nome = nome;
		this.qnt = qnt;
		this.valorVenda = vv;
		this.valorCompra = vc;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		//Deve verificar se o produto realmente existe
		this.qnt = qnt;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

}
