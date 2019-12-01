package repositorio;

import entidade.Produto;
import entidade.ProdutoReal;

public class ControlRepProduto {

	RepositorioPrododutoReal repProd;
	
	public ControlRepProduto()
	{
		this.repProd = RepositorioPrododutoReal.getInstance();
	}
	
	public void remover(ProdutoReal prod) {
		// TODO Auto-generated method stub
		for(int i = 0; i < repProd.prodReal.size(); i ++)
		{
			if(repProd.prodReal.get(i).getCod() == prod.getCod() )
			{
				
				repProd.prodReal.remove(repProd.prodReal.get(i));
			}
		}
		
	}
	
	
	public void removeQnt(int cod, int n) {
		// TODO Auto-generated method stub
	
		for(int i = 0; i < repProd.prodReal.size(); i ++)
		{
			if(repProd.prodReal.get(i).getCod() == cod )
			{
				repProd.prodReal.get(i).setQnt(repProd.prodReal.get(i).getQnt() + n);
			}
		}
		
	}

	public ProdutoReal buscar(int codigo) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < repProd.prodReal.size(); i++)
		{
			if(repProd.prodReal.get(i).getCod() == codigo)
			{
				return repProd.prodReal.get(i); 
			}
		}
		return null;
	}

	public void adicionarQtn(ProdutoReal produto) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < repProd.prodReal.size(); i++)
		{
			if(repProd.prodReal.get(i).getCod()== produto.getCod() || repProd.prodReal.get(i).getNome().equals(produto.getNome()))
			{
				repProd.prodReal.get(i).setQnt(produto.getQnt() + repProd.prodReal.get(i).getQnt());
			}
		}
		
	}
	
	
	public void alterar(ProdutoReal prod)
	{
		for(int i = 0; i < repProd.prodReal.size(); i++)
		{
			if(repProd.prodReal.get(i).getCod()== prod.getCod())
			{
				repProd.prodReal.set(i,prod);
			}
		}
	}
	
		
	
	public void adicionar(ProdutoReal p)
	{
		for(int i = 0; i < repProd.prodReal.size(); i++)
		{
			if(repProd.prodReal.get(i).getCod() == p.getCod())
			{
				
				this.adicionarQtn(p);
				
			}
			else
			{
				repProd.adicionar(p);
			}
		}
		
	}
	
	public boolean retirar(int cod)
	{
		boolean aux = false;
		
		for(int i = 0; i < repProd.prodReal.size(); i++)
		{
			if(repProd.prodReal.get(i).getCod() == cod)
			{
				repProd.remover(repProd.prodReal.get(i));
				aux = true; 
			}
		}
		return aux;
	}

	
}
