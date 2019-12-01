package repositorio;

import java.util.ArrayList;

import entidade.Endereco;

public class ControlRepEndereco {
	
	RepositorioEndereco repEnd;
	
	public ControlRepEndereco()
	{
		this.repEnd = RepositorioEndereco.getInstance();
	}
	
	//acho que esse metodo deve existir na classe pessoa e fazer a alteracao de acordo com uma busca pelo cpf
	/*public void alterar(Endereco endereco) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i< repEnd.enderecos.size(); i ++)
		{
			if(repEnd.enderecos.get(i).getPessoa().getCpf().equals( endereco.getPessoa().getCpf()))
			{
				repEnd.enderecos.set(i,endereco);
			}
		}
		
	}*/

	public ArrayList<Endereco> consultar(Endereco endereco) {
		
	ArrayList<Endereco> aux = null;
		
		for(int i = 0; i< repEnd.enderecos.size(); i ++)
		{
			if(repEnd.enderecos.get(i).getCep().equals(endereco.getCep()));
			{
				 aux.add(endereco);
				 
				 
			}
		}
		return aux;
	}

	public void remover(Endereco end)
	{
		repEnd.excluir(end);
	}
	public void adicionar(Endereco end)
	{
		repEnd.adicionar(end);
	}
	
	public boolean retirar(String cpf)
	{
		boolean aux = false;
		
		for(int i = 0; i< repEnd.enderecos.size(); i ++)
		{
			if(repEnd.enderecos.get(i).getCpf().equals(cpf))
			{
				repEnd.excluir(repEnd.enderecos.get(i));
				aux = true; 
			}
		}
		
		return aux;
	}
}
