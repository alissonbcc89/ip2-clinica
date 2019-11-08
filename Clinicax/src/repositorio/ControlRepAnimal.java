package repositorio;

import entidade.Animal;

public class ControlRepAnimal {
	
	RepositorioAnimal repAnimais;
	
	
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
			if(repAnimais.animais.get(i).getCliente().getCpf().equals(animal.getCliente().getCpf()))
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
	
	
}