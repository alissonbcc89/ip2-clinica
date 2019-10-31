package repositorio;

import java.util.ArrayList;

import entidade.Produto;
import entidade.ProdutoReal;

public class RepositorioPrododutoReal implements IProdReal {

	//ControlRepProduto controlRepProd;
	ProdutoReal produto;
	ArrayList<ProdutoReal>prodReal ;
	
	private static RepositorioPrododutoReal instance;
	
	private RepositorioPrododutoReal()
	{
		this.prodReal = new ArrayList<ProdutoReal>();
	}
	
	public static RepositorioPrododutoReal getInstance()
	{
		if(instance == null)
		{
			instance = new RepositorioPrododutoReal();
		}
		return instance;
		
	}
	
	
	
	@Override
	public void adicionar(ProdutoReal prod) {
		// TODO Auto-generated method stub
		
		prodReal.add(prod);
		
		
	}

	@Override
	public void remover(ProdutoReal prod) {
		// TODO Auto-generated method stub
		prodReal.remove(prod);
	}

	@Override
	public void removeQnt(String cod, int n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produto buscar(ProdutoReal produto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionarQtn(ProdutoReal produto) {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public Produto buscar(ProdutoReal produto) {
		// TODO Auto-generated method stub
		
		return proReal.buscar(produto);
	}

	@Override
	public void adicionarQtn(ProdutoReal produto) {
		// TODO Auto-generated method stub
		//Ps.acho que devo receber  uma quantidade e um cod do medicamento
		controlRepProd.adicionarQtn(produto);
		
	}
	public void alterar(ProdutoReal p)
	{
		controlRepProd.alterar(p);
		
	}*/
}
