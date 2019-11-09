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
	
	public void cancelarProduto(int quantidade, String codProduto) 
	{
		//Esse metodo só podera ser executado com a venda finalizada!!!
		// TODO Auto-generated method stub
		
		int aux = repVenda.vendas.size();
		
		for(int i = 0; i < repVenda.vendas.get(aux).getProdReal().size(); i++)
			{
			
				if(this.repVenda.vendas.get(aux).getProdReal().get(i).getCod().equals(codProduto))
				{
					this.repVenda.vendas.get(aux).getProdReal().set(i, null);
				}
		
			}
		
		System.out.println("Produto não existe");
		
		
		/*
		for(int i = 0; i< rep)
		if(repVenda.vendas.get(aux).getProdReal().get(i).getCod().equals(codProduto))
		{
			
		}*/
		//Preciso pegar o tamanho do vetor produto que a venda recebe
		//int i = repVenda.vendas.size();
		//int j = repVenda.vendas.get(i).getProdReal().size();
		//System.out.println(j);
	}

	
	

	
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
