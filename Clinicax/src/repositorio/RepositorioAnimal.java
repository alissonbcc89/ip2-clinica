package repositorio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import entidade.Animal;
import javax.swing.JOptionPane;

public class RepositorioAnimal implements IAnimal{
	
	ControlRepAnimal controlRepAnimal;
	
	public ArrayList<Animal> animais;
	private static RepositorioAnimal instance;
	
	private RepositorioAnimal ()
	{
		this.animais = new ArrayList<Animal>();
	}
	
	public static RepositorioAnimal getInstance()
	{
		if(instance == null )
		{
			instance = new RepositorioAnimal();
		}
		return instance;
	}
	@Override
	public void adicionar(Animal animal) {
		
		// TODO Auto-generated method stub
		animais.add(animal);
		//System.out.println("\n Animal Inserido, PArabéns!");
			
			
	/*	try
		{
		animais.add(animal);
		}
		catch(NullPointerException e)
		{
			JOptionPane.showMessageDialog(null, "Precisa Digitar os Caracters em branco!");
			
		}*/
		
	}

	@Override
	public void excluir(Animal animal) {
		// TODO Auto-generated method stub
		
		animais.remove(animal);
	}

	@Override
	public Animal pesquisar(Animal animal) 
	{// TODO Auto-generated method stub
		
			return controlRepAnimal.pesquisar(animal);	
	}

	@Override
	public void alterar(Animal animal) 
	{
		// TODO Auto-generated method stub
	//	
		controlRepAnimal.alterar(animal);
	}
	
	

}
