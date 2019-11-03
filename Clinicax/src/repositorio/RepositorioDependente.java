package repositorio;

import java.util.ArrayList;

import entidade.Dependente;
import entidade.Veterinario;

public class RepositorioDependente implements IDependente{
	
	ControlRepDependente controlRepDep;
	
	ArrayList<Dependente> dependentes ;
	
	private static RepositorioDependente instance;
	
	private RepositorioDependente()
	{
		this.dependentes = new ArrayList<Dependente>();
	}
	
	public static RepositorioDependente getInstance()
	{
		if(instance == null)
		{
			instance = new RepositorioDependente();
		}
		return instance;
	}

	@Override
	public void adicionar(Dependente dep){
		dependentes.add(dep);
	}

	@Override
	public void remover(Dependente dep) {
		// TODO Auto-generated method stub
		dependentes.remove(dep);	
	}

	@Override
	public Dependente consultar(Dependente dep) {
		// TODO Auto-generated method stub
		 return controlRepDep.consultar(dep);
	}

	@Override
	public void atualizar(Dependente dep) {
		// TODO Auto-generated method stub
			
		controlRepDep.atualizar(dep);
		
	}

	
}
