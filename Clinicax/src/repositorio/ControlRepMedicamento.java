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
			if(repMed.medicamentos.get(i).getCod() == (med.getCod()))
			{
				repMed.medicamentos.set(i, med);
			}
		}
	}

	public void remover(Medicamento med) {
	
		for(int i = 0; i <repMed.medicamentos.size(); i++)
		{
		
			if(repMed.medicamentos.get(i).getCod() == med.getCod())
				{
					repMed.medicamentos.remove(med);
				}
		}		
	}


	
	public void removeQnt(int cod, int n) {
		for(int i = 0; i< repMed.medicamentos.size();i++)
		{
			if(repMed.medicamentos.get(i).getCod() == (cod))
			{
				repMed.medicamentos.get(i).setQnt(repMed.medicamentos.get(i).getQnt() + n);
			}
			
		}
		
	}


	public void adicionarQtn(int codigo, int qnt) {
		
		
		for(int i = 0; i < repMed.medicamentos.size(); i++)
		{
			if(repMed.medicamentos.get(i).getCod() == (codigo))
			{
				repMed.medicamentos.get(i).setQnt(qnt);
			}
		}
	}
    public void removerQnt(int cod, int qnt) {
		
		for(int i = 0; i < repMed.medicamentos.size(); i++)
		{
			if(repMed.medicamentos.get(i).getCod() == cod)
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
    
    public Medicamento buscar(int cod)
    {
    	Medicamento aux = null;
    	
    	
    	for(int i = 0; i < repMed.medicamentos.size(); i++)
    	{
    		if(repMed.medicamentos.get(i).getCod() == cod)
    		{
    			aux = repMed.medicamentos.get(i);
    		}
    	}
    	return aux;
    }
    
    public boolean retirar(int codigo)
    {
    	boolean aux = false;
    	
    	for(int i = 0; i < repMed.medicamentos.size(); i++)
    	{
    		if(repMed.medicamentos.get(i).getCod() == codigo)
    		{
    			repMed.remover(repMed.medicamentos.get(i));
    			aux = true; 
    		}
    			
    	}
    	return aux;
    }
}
