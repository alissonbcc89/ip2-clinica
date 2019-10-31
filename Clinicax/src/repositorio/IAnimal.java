package repositorio;

import entidade.Animal;

public interface IAnimal {
	
	void adicionar(Animal animal);
	void excluir(Animal animal);
	Animal pesquisar(Animal animal);
	void alterar (Animal animal);

}
