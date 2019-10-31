package repositorio;

import java.util.ArrayList;

import entidade.Funcionario;
import excecoes.PNEException;


public class ControllRepFuncionario {
	
	RepositorioFuncionario repFuncionarios;
//	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public ControllRepFuncionario(RepositorioFuncionario funcionarios)
	{
		this.repFuncionarios = funcionarios;
		
	}
	
	public void  adicionar(Funcionario func)
	{
		for(int i = 0; i < repFuncionarios.funcionarios.size();i++)
		{
			if(repFuncionarios.funcionarios.get(i).getCpf().equals(func.getCpf()))
			{
				//lançar exceção de que cpf ja existe e fucionarios nao pode ser adicionado
			}
			else
				repFuncionarios.adicionar(func);
		}
	}
	
	public void exclusao(String cpf) throws PNEException, NullPointerException
	{
		if(cpf != null)
		{
			
			for(int i = 0; i < repFuncionarios.funcionarios.size();i++)
			{
				if(repFuncionarios.funcionarios.get(i).getCtps().equals(cpf))
				{
					repFuncionarios.excluir(repFuncionarios.funcionarios.get(i));
				}
			}
		}
		else
		{
			//Deve se lançado exceção informando que deve ser digitado um cpf valido
			NullPointerException nullpointerException = new NullPointerException();
			throw nullpointerException;
		}
		
		
	
	}
	
	public Funcionario pesquisa(String nome)  {
		// TODO Auto-generated method stub
		for(int i = 0; i< repFuncionarios.funcionarios.size(); i ++)
		{
			if(nome.equals(repFuncionarios.funcionarios.get(i).getNome()))
			{
				return repFuncionarios.funcionarios.get(i);
			}
		}
		return null;
	}
	
	public void atualizar(Funcionario func) {
		// TODO Auto-generated method stub
		for(int i = 0; i< repFuncionarios.funcionarios.size(); i ++)
		{
			repFuncionarios.funcionarios.set(i,func);
		}
		
	}

}
