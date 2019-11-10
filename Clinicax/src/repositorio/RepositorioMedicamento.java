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
		//System.out.println("\n Medicamento Inserido com sucesso");
		
		
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
	public void removeQnt(int cod, int n) {
		// TODO Auto-generated method stub
		controlRepMed.removerQnt(cod,n);
	}

	@Override
	public Medicamento buscar(int cod) {
		// TODO Auto-generated method stub
		
			return controlRepMed.buscar(cod);
	}

	@Override
	public void adicionarQtn(int codigo, int qnt) {
		// TODO Auto-generated method stub
		
		controlRepMed.adicionarQtn(codigo,qnt);
	}

	}
