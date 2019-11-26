package repositorio;

import java.util.ArrayList;

import entidade.Consulta;
import entidade.Medicamento;
import entidade.ProdutoReal;
import entidade.Venda;
import entidade.VendaTeste;

public class ControlRepVenda implements IVenda {
	//trabalhar com as classe repositorio
	
	RepositorioVenda repVenda;
	

	//A ideia é cancelar o produto medicamento ou consulta no ato da venda.
	
	
	
	
	public void adcVenda(Venda venda)
	{
		repVenda.adcVenda(venda);
	}
	
	//trabalhar nesse metodo quando voltar do jogo.
	//não consigo enxegar a definição do metodo
	
	
	
	

	
	public void excluirVenda(Venda venda) {
		// TODO Auto-generated method stub
		repVenda.excluirVenda(venda);
		
	}

	
	public Venda consultarVenda(int codigo) {
		// TODO Auto-generated method stub
		for(int i = 0; i < repVenda.vendas.size(); i++)
		{
			
			if(repVenda.vendas.get(i).getCod() == (codigo))
			{
				
				
				return repVenda.vendas.get(i); 
						
			}
		}
		
		return null;
	}
	
}
