package entidade;

public class ProdutoReal extends Produto{

	private String descricao;
	
	public ProdutoReal(String cod, String nome, int qnt, double valorVenda, double valorCompra)
	{
		super(cod,nome,qnt,valorVenda,valorCompra);
	}
	@Override
	public int getQnt() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setQnt(int qnt) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getCod() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setCod(String cod) {
		// TODO Auto-generated method stub
		}
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub	
	}
	@Override
	public double getValorVenda() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setValorVenda(double valorVenda) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getValorCompra() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setValorCompra(double valorCompra) {
		// TODO Auto-generated method stub
		
	}
	
}