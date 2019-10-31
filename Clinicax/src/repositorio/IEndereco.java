package repositorio;

import entidade.Endereco;

public interface IEndereco {
	
	void adicionar(Endereco endereco);
	void excluir(Endereco endereco);
	void alterar(Endereco endereco);
	Endereco consultar(Endereco endereco);

}
