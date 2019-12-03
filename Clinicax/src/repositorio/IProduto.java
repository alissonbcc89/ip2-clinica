package repositorio;

import entidade.Produto;

public interface IProduto {
	
	void adicionar(Produto prod);
	
	void remover(Produto prod);
	
	void removeQnt(int cod,int n);
	
	public Produto buscar(Produto produto);
	
	public void adicionarQtn(Produto produto);
	
	
	
		
	

}
