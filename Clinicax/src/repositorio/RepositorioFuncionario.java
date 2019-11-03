package repositorio;

import java.util.ArrayList;

import entidade.Funcionario;
import excecoes.PNEException;

public class RepositorioFuncionario implements  IFuncionario{
	
	ArrayList<Funcionario> funcionarios ;
//	ControllRepFuncionario controlfunc;
	
	ControlRepFuncionario controlRepFuncionario;
	
	private static RepositorioFuncionario instance;
	
	private RepositorioFuncionario()
	{
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public static RepositorioFuncionario getInstance()
	{
		if(instance == null )
		{
			instance = new RepositorioFuncionario();
		}
		return instance;
	}

	@Override
	public void adicionar(Funcionario funcionario) 
	{
		// TODO Auto-generated method stub
		
		funcionarios.add(funcionario);
		
	}

	@Override
	public void excluir (Funcionario func) 
	{
		//chamada do metodo negocio da camada mvp
		funcionarios.remove(func);
		
		
	}

	//Como chamar o meeetodo implementado na classe control se a classe control não se comunica com o repositorio?
	@Override
	public Funcionario pesquisar(String nome) {
		// TODO Auto-generated method stub
		 return controlRepFuncionario.busca(nome);
		
	}

	@Override
	public void atualizar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		controlRepFuncionario.atualizar(funcionario);
		
	}

	/*@Override
	public void excluir(String ctps) {
		// TODO Auto-generated method stub
		
	}
	
		
	@Override
	public Funcionario pesquisar(String nome){
		
		return controlfunc.pesquisa(nome);
	}
	
	@Override
	public void atualizar(Funcionario func) {
		
		controlfunc.atualizar(func);
	}*/
			
			
			

	}


