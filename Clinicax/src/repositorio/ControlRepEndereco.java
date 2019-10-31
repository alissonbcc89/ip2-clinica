package repositorio;

import entidade.Endereco;

public class ControlRepEndereco {
	
	RepositorioEndereco repEnd;
	
	public void alterar(Endereco endereco) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i< repEnd.enderecos.size(); i ++)
		{
			if(repEnd.enderecos.get(i).getPessoa().getCpf().equals( endereco.getPessoa().getCpf()))
			{
				repEnd.enderecos.set(i,endereco);
			}
		}
		
	}

	public Endereco consultar(Endereco endereco) {
		
		for(int i = 0; i< repEnd.enderecos.size(); i ++)
		{
			if(repEnd.enderecos.get(i).getCep().equals(endereco.getCep()));
			{
				return repEnd.enderecos.get(i);
			}
		}
		return null;
	}

	public void remover(Endereco end)
	{
		repEnd.excluir(end);
	}
	public void adicionar(Endereco end)
	{
		repEnd.adicionar(end);
	}
}
