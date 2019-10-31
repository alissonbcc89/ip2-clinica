package repositorio;

import java.util.ArrayList;

import entidade.Consulta;
import entidade.Medicamento;
import entidade.ProdutoReal;
import entidade.Venda;
import entidade.VendaTeste;
import repositorio.RepositorioPrododutoReal;


public class RepositorioVenda implements IVenda{
	
	ArrayList<VendaTeste> vendas ;
	
	private static RepositorioVenda instance;
	
	private RepositorioVenda()
	{
		this.vendas = new ArrayList<VendaTeste>();
	}
	
	public static RepositorioVenda getInstance()
	{
		if(instance == null)
		{
			instance = new RepositorioVenda();
		}
		return instance;
		
	}
	
	

	
	@Override
	public void cancelarProduto(int quantidade, String codProduto) 
	{
		// TODO Auto-generated method stub
		for(int i = 0; i< this.vendas.size(); i++)
		{
			for(int r = 0; r < this.vendas.size(); r++)
			{
				if(this.vendas.get(i).getProdReal().get(r).getCod().equals(codProduto))
					
			{
				this.vendas.get(i).getProdReal().get(r).setQnt(this.vendas.get(i).getProdReal().get(r).getQnt() - quantidade);
			}
			}
		}
	}
	@Override
	public void adcVenda(VendaTeste venda) {
		// TODO Auto-generated method stub
		vendas.add(venda);		
	}
	@Override
	public void excluirVenda(int codigo) {
			
		
		
	}
	@Override
	public Venda consultarVenda(int codigo) {
		// TODO Auto-generated method stub
	for(int i = 0; i < vendas.size(); i++)
	{
		if(vendas.get(i).getCod() == codigo)
		{
			return vendas.get(i);
			
		}
	}
		return null;
}
}