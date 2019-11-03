package repositorio;

import entidade.Medicamento;
import entidade.Produto;

public interface IMedicamento {
	
		void adicionar(Medicamento med);
		
		void remover(Medicamento med);
			
		void removeQnt(String cod,int n);
			
		public Produto buscar(Medicamento med);
			
		public void adicionarQtn(String nome, int qnt);
		
		
	

}
