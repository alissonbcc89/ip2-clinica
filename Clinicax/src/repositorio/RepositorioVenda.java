package repositorio;

import java.util.ArrayList;

import entidade.Consulta;
import entidade.Medicamento;
import entidade.ProdutoReal;
import entidade.Venda;
import entidade.VendaTeste;
import repositorio.RepositorioPrododutoReal;


public class RepositorioVenda implements IVenda{
	
	ArrayList<Venda> vendas ;
	ControlRepVenda controlRepVendas;
	
	private static RepositorioVenda instance;
	
	private RepositorioVenda()
	{
		this.vendas = new ArrayList<Venda>();
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
	public void cancelarProduto(int quantidade, String codProduto) {
		// TODO Auto-generated method stub
		//terminando metodo
		controlRepVenda,cancelarProduto(quantidade,codProduto);
		
	}

	@Override
	public void adcVenda(Venda venda) {
		
		// TODO Auto-generated method stub
		vendas.add(venda);
		
	}

	@Override
	public void excluirVenda(Venda venda) {
		// TODO Auto-generated method stub
		
		vendas.remove(venda);
		
	}

	@Override
	public Venda consultarVenda(int codigo) {
		// TODO Auto-generated method stub

		
		return 	controlRepVendas.consultarVenda(codigo); 
	}
	
}