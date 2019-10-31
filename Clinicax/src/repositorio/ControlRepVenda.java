package repositorio;

import java.util.ArrayList;

import entidade.Consulta;
import entidade.Medicamento;
import entidade.ProdutoReal;
import entidade.VendaTeste;

public class ControlRepVenda {
	//trabalhar com as classe repositorio
	
	RepositorioVenda repVenda;
	

	//A ideia é cancelar o produto medicamento ou consulta no ato da venda.
	
	public void adcionar(VendaTeste venda)
	{
		repVenda.adcVenda(venda);
	}
	
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
	
	
	
	
}
