package repositorio;

import entidade.Dependente;



public class ControlRepDependente {
	
	
	RepositorioDependente repDep;
	
	
	public Dependente consultar(Dependente dep) {
		// TODO Auto-generated method stub
		for(int i = 0; i < repDep.dependentes.size(); i ++)
		{
			if(repDep.dependentes.get(i).getCpf().equals(dep.getCpf()))
					{
						return repDep.dependentes.get(i);
					}
		}
		
			return null;
	}
	public void atualizar(Dependente dep) {
		// TODO Auto-generated method stub
			
		for(int i = 0; i < repDep.dependentes.size(); i++)
		{
			if(repDep.dependentes.get(i).getCpf().equals(dep.getCpf()))
			{
				repDep.dependentes.set(i,dep);
			}
				
		}
		
	}
	public void remover(Dependente dep) {
		// TODO Auto-generated method stub
		
		repDep.dependentes.remove(dep);
	}
	public void adicionar(Dependente dep)
	{
		repDep.adicionar(dep);
		
	}

}


	
	
	
