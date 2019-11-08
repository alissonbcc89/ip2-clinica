package repositorio;

import entidade.Veterinario;

public class ControlRepVeterinario {
	
	RepositorioVeterinario repVet;	
	
	
	public ControlRepVeterinario()
	{
	this.repVet = RepositorioVeterinario.getInstance();
	}
	
	public void adicionar(Veterinario vet) 
	{
		repVet.adicionar(vet);
	}
	public void remover(Veterinario vet) {
		// TODO Auto-generated method stub
		//os dois fazem a mesma coisa?
		repVet.veterinarios.remove(vet);
		repVet.remover(vet);
		
	}

	public Veterinario buscar(Veterinario vet) {
		// TODO Auto-generated method stub
		for(int i = 0; i< repVet.veterinarios.size(); i++)
		{
			if(repVet.veterinarios.get(i).getCrmv().equals(vet.getCrmv()))
			{
				return repVet.veterinarios.get(i);
			}
		}
		
		return null;
	}

	
	public void alterar(Veterinario vet)
	{
		  
		for(int i = 0; i< repVet.veterinarios.size() ; i++ )
	 	{	
			if(repVet.veterinarios.get(i).getCrmv().equals(vet.getCrmv()))
			{
				repVet.veterinarios.set(i, vet);
			}
	 	}
		
	}

}
