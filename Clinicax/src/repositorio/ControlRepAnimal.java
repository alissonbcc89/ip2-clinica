package repositorio;

import entidade.Animal;

public class ControlRepAnimal {
	
	public RepositorioAnimal repAnimais;
	
	
	public ControlRepAnimal()
	{
		this.repAnimais = RepositorioAnimal.getInstance();
	}
	
	public void alterar(Animal animal) 
	{
		// TODO Auto-generated method stub
	//	animais.get(i).setNome(animal);
		for(int i = 0; i< repAnimais.animais.size(); i++)
		{
			if(repAnimais.animais.get(i).getCodCliente().equals(animal.getCodCliente()))
					{
						repAnimais.animais.set(i,animal);
					}
		}
		
	}
	
	public Animal pesquisar(Animal animal) {
		// TODO Auto-generated method stub
		for(int i = 0; i < repAnimais.animais.size(); i++)
		{
			if(repAnimais.animais.get(i)== animal)
			{
				return repAnimais.animais.get(i);
			}
		}
			return null;
	}
	
	public void adicionar(Animal animal)
		{
			repAnimais.adicionar(animal);
		}
	
	public void remover(Animal animal) 
	{
		
		repAnimais.excluir(animal);
	}
	
	public boolean retirando(String cpf, String nome)
	{
		boolean aux = false;
		
		for(int i = 0; i < repAnimais.animais.size(); i++)
		{
			if(repAnimais.animais.get(i).getNome().equals(nome) && repAnimais.animais.get(i).getCodCliente().equals(cpf))
			{
				
				repAnimais.excluir(repAnimais.animais.get(i));
				aux = true; 
			}
		}
		return aux;
	}
	
	public Animal retornaId(int id)
	{
		Animal repAni =  null;
		
		for(int i = 0; i< repAnimais.animais.size(); i++)
		{
			if(repAnimais.animais.get(i).getId() == id)
			{
				repAni = repAnimais.animais.get(i);
			}
		}
		  
		   return repAni;
	}
}