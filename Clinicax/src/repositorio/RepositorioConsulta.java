package repositorio;

import java.util.ArrayList;

import entidade.Consulta;

public class RepositorioConsulta implements IRepositorioConsulta{
	
	
	ControlRepConsulta controlRepConsulta;
	ArrayList<Consulta>consultas ;
	
	private static RepositorioConsulta instance;
	
	private RepositorioConsulta()
	{
		this.consultas = new ArrayList<Consulta>();
	}
	
	
	public static RepositorioConsulta getInstance() 
	{
		if(instance == null )
		{
			instance = new RepositorioConsulta();
		}
		return instance;
	}
	
	
	@Override
	public void adicionar(Consulta consulta) 
	{
		// TODO Auto-generated method stub
		
		consultas.add(consulta);
	
	}

	@Override
	public void remover(Consulta consulta) {
		// TODO Auto-generated method stub
		consultas.remove(consulta);	
		
	}

	@Override
	public Consulta buscar(int cod) {
		// TODO Auto-generated method stub

		return controlRepConsulta.buscar(cod);

	}

	@Override
	public void editar(int cod,Consulta con) {

		// TODO Auto-generated method stub
		//Ps. pode acontecer um erro referente ao parametro do método, pois como se é geraddo um formulario
		// pode ser que não consiga direcionar os dois parametros no formulario da tela.
		{
			controlRepConsulta.editar(cod, con);
		}
		
	}
	
	

}
