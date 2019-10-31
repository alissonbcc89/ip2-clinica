package repositorio;

import entidade.Consulta;

public class ControlRepConsulta implements IConsulta{
	
	RepositorioConsulta repConsulta;
	
	
	
	public Consulta buscar(int cod)
	{
			
	}
	
	public void editar(int cod,Consulta con) {
		// TODO Auto-generated method stub
		{
			for(int i = 0; i< repConsulta.consultas.size(); i++)
			{
				if(repConsulta.consultas.get(i).getId() == cod)
				{		
					repConsulta.consultas.get(i).setValor(con.getValor());
					
				}
			}
		}
		
	}
	
	public void remover(Consulta consulta) {
		// TODO Auto-generated method stub
		for(int i = 0; i< repConsulta.consultas.size();i++)
		{
			if(repConsulta.consultas.get(i).getId() == consulta.getId())
			{
				repConsulta.consultas.remove(consulta);
			}
		}
	}

	public void adiconar(Consulta con)
	{
		repConsulta.adicionar(con);
	}

	@Override
	public void adcionar(Consulta consulta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Consulta consulta) {
		// TODO Auto-generated method stub
	
		for(int i = 0; i < repConsulta.consultas.size(); i++)
		{
			if(repConsulta.consultas.get(i).getId().equals(consulta.getCod());
			{
				return repConsulta.consultas.get(i);
				
			}
			
		}
		return null;
	
	}

	@Override
	public void buscar(Consulta consulta) {
		// TODO Auto-generated method stub
		
	}
}
