package repositorio;

import entidade.Veterinario;

public class ControlRepVeterinario {
	
	RepositorioVeterinario repVet;	
	
	
	public void adicionar(Veterinario vet)throws NullPointerException 
	{
		repVet.adicionar(vet);
	}
	public void remover(Veterinario vet) {
		// TODO Auto-generated method stub
		
		
		for(int i = 0; i< repVet.veterinarios.size();i++)
		{
			if(repVet.veterinarios.get(i).getCrmv().equals(vet.getCrmv()))
			{
				repVet.veterinarios.remove(repVet.veterinarios.get(i));
				System.out.println("\n Excluido");
			}
			
		}
		
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
		 	repVet.veterinarios.set(i, vet);
	 	}
		}

}
