package repositorio;

import entidade.Produto;
import entidade.ProdutoReal;

public class ControlRepProduto {

	RepositorioPrododutoReal repProd;
	
	public void remover(ProdutoReal prod) {
		// TODO Auto-generated method stub
		for(int i = 0; i < repProd.prodReal.size(); i ++)
		{
			if(repProd.prodReal.get(i).getCod().equals(prod.getCod()))
			{
				
				repProd.prodReal.remove(repProd.prodReal.get(i));
			}
		}
		
	}
	
	
	public void removeQnt(String cod, int n) {
		// TODO Auto-generated method stub
	
		for(int i = 0; i < repProd.prodReal.size(); i ++)
		{
			if(repProd.prodReal.get(i).getCod().equals(cod))
			{
				repProd.prodReal.get(i).setQnt(repProd.prodReal.get(i).getQnt() + n);
			}
		}
		
	}

	public Produto buscar(ProdutoReal produto) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < repProd.prodReal.size(); i++)
		{
			if(repProd.prodReal.get(i).getCod().equals(produto.getCod()))
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
			if(repProd.prodReal.get(i).getCod().equals(produto.getCod()) || repProd.prodReal.get(i).getNome().equals(produto.getNome()))
			{
				repProd.prodReal.get(i).setQnt(produto.getQnt() + repProd.prodReal.get(i).getQnt());
			}
		}
		
	}
	
	
	public void alterar(ProdutoReal p)
	{
		for(int i = 0; i < repProd.prodReal.size(); i++)
		{
			if(repProd.prodReal.get(i).getCod().equals(p.getCod()))
					{
					repProd.prodReal.set(i,p);
					}
			else
			{
				System.out.println("Não existe produto a ser alterado");
			}
		}
	}
	
	
	public void adicionar(ProdutoReal p)
	{
		for(int i = 0; i < repProd.prodReal.size(); i++)
		{
			if(repProd.prodReal.get(i).getCod()!=p.getCod())
			{
				repProd.adicionar(p);
				
			}
			else
			{
				this.adicionarQtn(p);
			}
		}
		
	}
	


	
}
