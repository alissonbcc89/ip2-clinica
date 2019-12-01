package repositorio;

import java.util.ArrayList;

import com.sun.glass.ui.Size;
import com.sun.javafx.iio.ios.IosDescriptor;

import entidade.Funcionario;

//todas as definições de como alterar remover pesquisar e adicionar ficaram na classe controler e o repositorio apenas chama
// os metodos desssas respectivas classe.

public class ControlRepFuncionario {
	
	RepositorioFuncionario repFunc;
	
	public ControlRepFuncionario()
	{
		this.repFunc = RepositorioFuncionario.getInstance();
	}	
	public void adicionar(Funcionario func)
	{
		repFunc.funcionarios.add(func);
		
		
		
		/*for(int i = 0; i< repFunc.funcionarios.size(); i ++)
		{
		//criar um metodo que retorne se o funcionario existe ou não.
		//if
		if(repFunc.funcionarios.get(i).getCpf().equals(func.getCpf()))
		{
			//lancar exceção de que funcionario a existe
		}
		
	}
		repFunc.adicionar(func);*/
}
	
	public void remover(Funcionario func)
	{
		for(int i = 0; i<repFunc.funcionarios.size(); i++)
		{
			if(repFunc.funcionarios.get(i).getCpf().equals((func.getCpf())))
				{
				
				repFunc.funcionarios.remove(func);		
				
				}
			
		}
		
	
		
		/*
		for(int i = 0; i< repFunc.funcionarios.size(); i ++)
		{
			if(repFunc.funcionarios.get(i).getCpf().equals(func.getCpf()))
			{
				repFunc.excluir(func);
			}
		}
		
		*/
	}
	
	public void alterar (Funcionario funcionario)
	{
		for(int i = 0; i < repFunc.funcionarios.size(); i++)
		{
			if(repFunc.funcionarios.get(i).getCpf().equals(funcionario.getCpf()))
			{
				repFunc.funcionarios.set(i,funcionario);
			}
			
		}
		
		/*for(int i = 0; i< repFunc.funcionarios.size(); i ++)
		{
			if(repFunc.funcionarios.get(i).getCpf().equals(funcionario.getCpf()))
			{
				repFunc.funcionarios.set(i,funcionario);
			}
		}*/
	}
	
	public Funcionario busca(String nome)
	{
		if(this.existeNome(nome) == true )
		{
			for(int i = 0; i<repFunc.funcionarios.size(); i ++)
			{
				if(repFunc.funcionarios.get(i).getNome().equals(nome))
				{
					return repFunc.funcionarios.get(i);
				}
			}
				
		}
		return null;
	}
	
	public Funcionario buscarCpf(String cpf)
	{
		for(int i = 0; i < repFunc.funcionarios.size(); i ++ )
		{
			if(repFunc.funcionarios.get(i).getCpf().equals(cpf))
			{
				return repFunc.funcionarios.get(i);
			}
		}
		
		return null;
			
	}
	
	public ArrayList<Funcionario> buscarNome(String nome)
	{
		
		ArrayList<Funcionario> aux;
		aux = new ArrayList<Funcionario>();
		
		
		for(int i = 0; i < repFunc.funcionarios.size(); i ++ )
		{
			if(repFunc.funcionarios.get(i).getNome().equals(nome))
			{
				aux.add( repFunc.funcionarios.get(i));
				
			}
		}
		return aux;
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
	
	public boolean existeNome(String nome)
	{
		boolean aux = false;
		ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
		
		for(int i = 0; i<repFunc.funcionarios.size(); i ++)
		{
			if(repFunc.funcionarios.get(i).getNome().equals(nome))
			{
				aux =  true;
				
				funcionario.add(repFunc.funcionarios.get(i));		
						
			}
		}
		return aux;
	}

	public void atualizar(Funcionario funk)
	{
		for(int i = 0; i<repFunc.funcionarios.size(); i ++ )
		{
			if(this.existe(funk.getCpf()) == true)
			{
				repFunc.funcionarios.set(i,funk);
				
			}
		}
	}
	
	public boolean retirar(String cpf)
	{
		boolean aux = false;
		for(int i = 0; i<repFunc.funcionarios.size(); i ++ )
		{
			if(repFunc.funcionarios.get(i).getCpf().equals(cpf))
			{
				repFunc.excluir(repFunc.funcionarios.get(i));
				aux = true;
			}
			
		}
		return aux;
	}
	
}


