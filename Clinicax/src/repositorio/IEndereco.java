package repositorio;

import java.util.ArrayList;

import entidade.Endereco;

public interface IEndereco {
	
	void adicionar(Endereco endereco);
	void excluir(Endereco endereco);
	//void alterar(Endereco endereco);
	ArrayList<Endereco> consultar(Endereco endereco);

}
