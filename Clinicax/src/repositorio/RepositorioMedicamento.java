package repositorio;

import java.util.ArrayList;

import entidade.Medicamento;
import entidade.Produto;

public class RepositorioMedicamento implements IMedicamento{

	ArrayList<Medicamento> medicamentos ;
	ControlRepMedicamento controlRepMed;
	
	
	private static RepositorioMedicamento instance;
	
	private RepositorioMedicamento ()
	{
		this.medicamentos = new ArrayList<Medicamento>();
	}
	
	public static RepositorioMedicamento getInstance()
	{
		if(instance == null)
		{
			instance = new RepositorioMedicamento();
		}
		return instance;
	}
	@Override
	public void adicionar(Medicamento med) {
		// TODO Auto-generated method stub
		
		medicamentos.add(med);
		System.out.println("\n Medicamento Inserido com sucesso");
		
		
	}
	
	public void alterar(Medicamento med)
	{
		controlRepMed.alterar(med);
	}

	@Override
	public void remover(Medicamento med) {
		// TODO Auto-generated method stub
		controlRepMed.remover(med);
	
	}

	@Override
	public void removeQnt(String cod, int n) {
		// TODO Auto-generated method stub
		controlRepMed.removeQnt(cod,n);
	}

	@Override
	public Produto buscar(Medicamento med) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < medicamentos.size(); i++)
		{
			if(medicamentos.get(i).getCod().equals(med.getCod()))
			{
				return medicamentos.get(i);
			}
		}
		
		
		return null;
	}

	@Override
	public void adicionarQtn(String nome, int qnt) {
		// TODO Auto-generated method stub
		
		controlRepMed.adicionarQtn(nome, qnt);
	}

	public void removerQnt(String cod, int qnt) {
		
		medicamentos.
	}
	
}
