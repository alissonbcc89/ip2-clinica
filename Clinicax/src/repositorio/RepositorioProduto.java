package repositorio;

import java.util.ArrayList;

import entidade.Produto;

public class RepositorioProduto implements IProduto{
	
	ArrayList<Produto>produtos =  new ArrayList<Produto>();
	
	private static RepositorioProduto instance;
	
	private RepositorioProduto()
	{
		this.produtos =  new ArrayList<Produto>();
	}
	
	public static RepositorioProduto getInstance()
	{
		if(instance == null )
		{
			instance = new RepositorioProduto();
		}
		return instance;
	}
	
	int aux = produtos.size();
	
	
	 public void adicionar(Produto prod)
	 {
		 produtos.add(prod);
	}		
	
	
	public void remover(Produto prod)
	{		
		if(prod != null)
			{
				for(int i = 0; i< aux; i++)
				{
					if(produtos.get(i).getCod()== prod.getCod() )
					{				
						produtos.remove(prod);
					}			
			}			
		}			
	}
	
	public void removeQnt(String cod,int n)
	{				
		if(cod != null && n <0)
			{
				for(int i = 0; i< aux; i++)
				{
					if(produtos.get(i).getCod().equals(cod) || produtos.get(i).getNome().equals(cod))
					{
						int total = produtos.get(i).getQnt() - n ;
						
						if(total < 0)
						{
							System.out.println("Quantidade indisponivél");
						}
						else
						{
						produtos.get(i).setQnt(total);
						}
					}
					else
					{
						System.out.println("Digite um código válido ou nome do produto válido");
					}
				}
			}
		}
	
	public Produto buscarProduto(String cod)
	{
		for(int i = 0; i < aux; i++)
		{
			if(produtos.get(i).getCod() == cod || produtos.get(i).getNome() == cod)
			{
				return produtos.get(i);
			}
			
		}
		return null;
		
	}

	@Override
	public void adicionarQtn(Produto produto) {
		// TODO Auto-generated method stub
		
	
		for(int i = 0; i<produtos.size(); i++)
		{
			if(produto.getCod() == produtos.get(i).getCod() )
			{
				produtos.get(i).setQnt(produto.getQnt());
			}
			
		}
		
		
		
		
	}

	@Override
	public Produto buscar (Produto produto)
	{
		// TODO Auto-generated method stub
		for(int i = 0; i<produtos.size(); i++)
		{
			if(produto.getCod()== produtos.get(i).getCod())
			{
				return produtos.get(i);
				
			}
			else 
				return null;
			
		}
		return null;
	}
	
	
}



