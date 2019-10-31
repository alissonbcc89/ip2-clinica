package repositorio;

import entidade.Cliente;



public interface ICliente {
	
	void adicionar(Cliente cliente); 
	
	void remover (Cliente cliente);
	
	Cliente buscar(Cliente cliente); 
	
	void atualizar(Cliente cliente);
	
	

}
