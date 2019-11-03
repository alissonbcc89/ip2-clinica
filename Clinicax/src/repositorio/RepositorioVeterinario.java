package repositorio;

import java.util.ArrayList;
import entidade.Veterinario;

//A d�vida trata se devo por o array de dependentes na classe funcionarioReal e Veterinario
//Ou se fa�o um repositorio apenas para ela.


public class RepositorioVeterinario implements IVeterinario{
	
	ControlRepVeterinario controlRepVet;
	Veterinario veterinario;
	ArrayList<Veterinario> veterinarios ;
	
	private static RepositorioVeterinario instance;
	
	private RepositorioVeterinario()
	{
		this.veterinarios = new ArrayList<Veterinario>();
	}
	
	public static RepositorioVeterinario getInstance()
	{
		if(instance == null )
		{
			instance = new RepositorioVeterinario();
		}
		return instance;
	}
	
	@Override
	public void adicionar(Veterinario vet) throws NullPointerException 
	{
		// TODO Auto-generated method stub
		
		
				veterinarios.add(vet);
				System.out.println("\nInserido!");
	}

	@Override
	public void remover(Veterinario vet) {
		// TODO Auto-generated method stub
		
		
		veterinarios.remove(vet);
	}

	@Override
	public Veterinario buscar(Veterinario vet) {
		// TODO Auto-generated method stub
		return controlRepVet.buscar(vet);
	}

	//M�todo funcionando, devendo ser finalizada sua implementa��o.
	@Override
	public void alterar(Veterinario vet)
	{
		  
		controlRepVet.alterar(vet);
	}
	
}
//chave fecha a classe n�o pode existir chave depois dessa.

