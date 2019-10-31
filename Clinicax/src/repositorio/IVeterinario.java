package repositorio;

import java.util.ArrayList;

import entidade.Dependente;
import entidade.Produto;
import entidade.Veterinario;

public interface IVeterinario {
	
	public void adicionar(Veterinario vet) throws NullPointerException ;
	
	public void remover(Veterinario vet);
		
	public Veterinario buscar(Veterinario vet);
	
	public void alterar(Veterinario vet);
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	

}
