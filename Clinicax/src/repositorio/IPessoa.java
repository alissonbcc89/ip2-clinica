package repositorio;

import entidade.Pessoa;
import excecoes.PNEException;

public interface IPessoa {
	
	
	void adicionar(Pessoa pessoa) throws NullPointerException;
	void excluir(Pessoa pessoa) throws PNEException, NullPointerException;
	Pessoa buscar(Pessoa pessoa) throws PNEException, NullPointerException;
	void alterar (Pessoa pessoa) throws PNEException, NullPointerException;

}
