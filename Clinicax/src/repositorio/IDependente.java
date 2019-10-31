package repositorio;

import entidade.Dependente;
import entidade.Veterinario;

public interface IDependente {
	
	public void adicionar(Dependente dep);
	public void remover(Dependente dep);
	public Dependente consultar(Dependente dep );
	public void atualizar(Dependente dependete);
	
	
	

}
