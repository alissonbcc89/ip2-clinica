package repositorio;

import entidade.Funcionario;
import excecoes.PNEException;

public interface IFuncionario {
	
	void adicionar (Funcionario funcionario);
	
	void excluir (Funcionario func) ;
	
	Funcionario pesquisar(String nome);
	
	void atualizar(Funcionario funcionario);

	//void excluir(String ctps);
	
}
