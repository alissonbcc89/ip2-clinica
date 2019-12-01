package repositorio;

import entidade.Dependente;



public class ControlRepDependente {
	
	
	RepositorioDependente repDep;
	
	public ControlRepDependente()
	{
		this.repDep = RepositorioDependente.getInstance();
	}
	
	
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
	
	public boolean retirar(String cpf,String nome)
	{
		boolean aux = false; 
		for(int i = 0; i < repDep.dependentes.size(); i++)
		{
			if(repDep.dependentes.get(i).getCpf().equals(cpf) && repDep.dependentes.get(i).getNome().equals(nome))
			{
				repDep.remover(repDep.dependentes.get(i));
				aux = true;
			}
		}
		return aux;
	}

}


	
	
	
