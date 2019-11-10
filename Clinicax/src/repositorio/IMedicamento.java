package repositorio;

import entidade.Medicamento;
import entidade.Produto;

public interface IMedicamento {
	
		void adicionar(Medicamento med);
		
		void remover(Medicamento med);
			
		void removeQnt(int cod,int n);
			
		public Medicamento buscar(int codigo);
			
		public void adicionarQtn(int codigo, int qnt);
		
		
	

}
