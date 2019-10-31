package entidade;

import java.util.ArrayList;

public class Estoque {
	
	ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
	ArrayList<ProdutoReal> produtos = new ArrayList<ProdutoReal>();
	
	public Estoque(ArrayList<Medicamento> m, ArrayList<ProdutoReal> pr)
	{
		this.medicamentos = m;
		this.produtos = pr;
	}
	
	public void DiminuirEstoqueM(String cod, int qnt)
	{
				
	}
}
