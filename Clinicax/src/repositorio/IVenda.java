package repositorio;

import entidade.Venda;
import entidade.VendaTeste;

public interface IVenda {
	
	
	public void cancelarProduto(int quantidade, String codProduto);
	
	public void adcVenda(Venda venda);
	
	public void excluirVenda(Venda venda);// trabalha com o codigo;
	
	public Venda consultarVenda(int  codigo); //trabalha com o codigo
	
	
	

}
