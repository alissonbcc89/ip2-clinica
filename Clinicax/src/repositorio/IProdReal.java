package repositorio;

import entidade.Produto;
import entidade.ProdutoReal;

public interface IProdReal {

void adicionar(ProdutoReal prod);
	
	void remover(ProdutoReal prod);
	
	void removeQnt(String cod,int n);
	
	public ProdutoReal buscar(ProdutoReal produto);
	
	public void adicionarQtn(ProdutoReal produto);
	
}
