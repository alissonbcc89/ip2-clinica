package repositorio;

import java.util.ArrayList;

import entidade.Medicamento;

public class ControlRepMedicamento {
	
	RepositorioMedicamento repMed;
	
	public ControlRepMedicamento()
	{
		this.repMed = RepositorioMedicamento.getInstance();
	}
	
	public void adicionar(Medicamento med)
	{
		repMed.adicionar(med);
	}
	public void alterar(Medicamento med)
	{
		for(int i = 0; i < repMed.medicamentos.size(); i++)
		{
			if(repMed.medicamentos.get(i).getCod().equals(med.getCod()))
			{
				repMed.medicamentos.set(i, med);
			}
		}
	}

	public void remover(Medicamento med) {
		// TODO Auto-generated method stub
		
	for(int i = 0; i <repMed.medicamentos.size(); i++)
	{
		
		if(repMed.medicamentos.get(i).getCod().equals(med.getCod()))
		{
			repMed.medicamentos.remove(med);
		}
		else
			System.out.println("Medicamento não existe");
	
			
	}		
	}

	public void removeQnt(String cod, int n) {
		// TODO Auto-generated method stub
		for(int i = 0; i< repMed.medicamentos.size();i++)
		{
			if(repMed.medicamentos.get(i).getCod().equals(cod))
			{
				repMed.medicamentos.get(i).setQnt(repMed.medicamentos.get(i).getQnt() + n);
			}
			else
				System.out.println("Não é possivel encontrar medicamento");
			
		}
		
	}


	public void adicionarQtn(String nome, int qnt) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < repMed.medicamentos.size(); i++)
		{
			if(repMed.medicamentos.get(i).getNome().equals(nome))
			{
				repMed.medicamentos.get(i).setQnt(qnt);
			}
		}
	}
    public void removerQnt(String cod, int qnt) {
		
		for(int i = 0; i < repMed.medicamentos.size(); i++)
		{
			if(repMed.medicamentos.get(i).getCod().equals(cod))
			{
				repMed.medicamentos.get(i).setQnt(repMed.medicamentos.get(i).getQnt()-qnt);
			}
		
		}
	}
    public ArrayList<Medicamento> pesquisarNome(String nome)
    {
    	ArrayList<Medicamento> aux;
    	aux = new ArrayList<Medicamento>();
    	for(int i = 0; i < repMed.medicamentos.size(); i++)
    	{
    		if(repMed.medicamentos.get(i).getNome().equals(nome))
    		{
    			aux.add(repMed.medicamentos.get(i)); 
    		}
    		
    	}
    	
    	return aux;
    }
}
