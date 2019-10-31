package repositorio;

import java.util.ArrayList;

import entidade.Funcionario;
import entidade.Pessoa;
import excecoes.PNEException;


//para sincontlon devemo s definir construto como privado

//OBS: Criar método equals
//get e set endereco escrito de maneira errada, atualizar


public class RepFuncionario implements IFuncionario{

	ArrayList<Funcionario>funcionarios;

	
	// Sicleton modelo de definição onde não deixa que se crie mais que uma objeto do tipo. 
	private static  RepFuncionario instance;
	
	private RepFuncionario()
	{
		this.funcionarios = new ArrayList<Funcionario>();
		
	}
	
	public static RepFuncionario getInstance()
	{
		if(instance == null)
		{
			instance = new RepFuncionario();
			
		}
		return instance;
	}
	@Override
	public void adicionar(Funcionario func) {
		// TODO Auto-generated method stub
	
				funcionarios.add(func);		
		System.out.println("Funcionario adc com sucesso");				
	}
	
	

	@Override
	public void excluir(String ctps) {
		// TODO Auto-generated method stub
		try {
		for(int i = 0; i<funcionarios.size();i++)
		{
			if(funcionarios.get(i).getCtps().equals(ctps))
			{
				funcionarios.remove(funcionarios.get(i));	
				System.out.println("\nExcluido com sucesso");
			}		
			
		}	
		}catch(NullPointerException e)
		{
			System.out.print("Entrada vazia" + e);
		}
	}
	
	@Override
	public Funcionario pesquisar(String nome) 
	{
		// TODO Auto-generated method stub
		
		for(int i = 0; i< funcionarios.size(); i ++)
		{
			if(nome.equals(funcionarios.get(i).getNome()))
			{
				return funcionarios.get(i);
			}
		}
		return null;
	}
	
	@Override
	public void atualizar(Funcionario func) {
		// TODO Auto-generated method stub
			for(int i = 0; i < funcionarios.size(); i++)			
			{
				if(func.getCtps().equals(funcionarios.get(i).getCtps()))
				{	
					funcionarios.set(i,func);
				}
					
				else
					System.out.println("Não encontramos funcionario");
				
		}
		
	}

	@Override
	public void excluir(Funcionario func) {
		// TODO Auto-generated method stub
		for(int i = 0; i<funcionarios.size(); i++)
		{
			if(funcionarios.get(i).getCtps().equals(func.getCtps()))
			{
				funcionarios.remove(func);
			}
		}
		
	}
		
}
		





