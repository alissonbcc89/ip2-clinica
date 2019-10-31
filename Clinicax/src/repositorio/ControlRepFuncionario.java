package repositorio;

import entidade.Funcionario;

//todas as definições de como alterar remover pesquisar e adicionar ficaram na classe controler e o repositorio apenas chama
// os metodos desssas respectivas classe.

public class ControlRepFuncionario {
	
	RepositorioFuncionario repFunc;
	
	public void adicionar(Funcionario func)
	{
		for(int i = 0; i< repFunc.funcionarios.size(); i ++)
		{
		//criar um metodo que retorne se o funcionario existe ou não.
		//if
		if(repFunc.funcionarios.get(i).getCpf().equals(func.getCpf()))
		{
			//lancar exceção de que funcionario a existe
		}
		
	}
		repFunc.adicionar(func);
	}
	
	public void remover(Funcionario func)
	{
		for(int i = 0; i< repFunc.funcionarios.size(); i ++)
		{
			if(repFunc.funcionarios.get(i).getCpf().equals(func.getCpf()))
			{
				repFunc.excluir(func);
			}
		}
		
		
	}
/*	public void alterar(Funcionario funcionario)
	{
		for(int i = 0; i< repFunc.funcionarios.size(); i ++)
		{
			if(repFunc.funcionarios.get(i).getCpf().equals(funcionario.getCpf()))
			{
				repFunc.funcionarios.set(i,funcionario);
			}
		}
	}*/

	public Funcionario busca(String cpf)
	{
		if(this.existe(cpf) == true )
		{
			for(int i = 0; i<repFunc.funcionarios.size(); i ++)
			{
				if(repFunc.funcionarios.get(i).getCpf().equals(cpf))
				{
					return repFunc.funcionarios.get(i);
				}
			}
				
		}
		return null;
	}
	
	public boolean existe (String cpf)
	{
		boolean aux = false;
		for(int i = 0; i< repFunc.funcionarios.size(); i ++)
		{
			if(repFunc.funcionarios.get(i).getCpf().equals(cpf))
			{
				return aux = true;
				
			}
			
		}
		return aux;
		
	}
	public void alterar(Funcionario func)
	{
		if(this.existe(func.getCpf())== true)
		{
		for(int i = 0; i< repFunc.funcionarios.size(); i ++)
		{
			if(repFunc.funcionarios.get(i).getCpf().equals(func.getCpf()))
			{
				repFunc.funcionarios.set(i, func);
				System.out.println("Alterado com sucesso");
			}
		}
		}
		else
		{
			System.out.println("Nao existe funcionario disponivel paraa alteracao!");
		}
		}
}

