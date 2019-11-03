package repositorio;

import entidade.Pessoa;
import excecoes.PNEException;

public interface IPessoa {
	
	
	void adicionar(Pessoa pessoa);
	void excluir(Pessoa pessoa) ;
	Pessoa buscar(Pessoa pessoa) ;
	void alterar (Pessoa pessoa) ;

}
