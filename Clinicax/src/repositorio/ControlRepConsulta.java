package repositorio;

import entidade.Consulta;

public class ControlRepConsulta {
	
	RepositorioConsulta repConsulta;
	
	public ControlRepConsulta()
	{
		this.repConsulta = RepositorioConsulta.getInstance();
	}
	
	public Consulta buscar(int cod)
	{
		Consulta aux = null;
		for(int i = 0; i< repConsulta.consultas.size(); i++)
		{
			if(repConsulta.consultas.get(i).getId() == cod )
			{
				aux  = repConsulta.consultas.get(i);
				return aux;
			}
		}
		return aux;
	}
	
	public void editar(int cod,Consulta con) {
		// TODO Auto-generated method stub
		{
			for(int i = 0; i< repConsulta.consultas.size(); i++)
			{
				if(repConsulta.consultas.get(i).getId() == cod)
				{		
					repConsulta.consultas.set(i,con);
					
				}
			}
		}
		
	}
	
	public void remover(Consulta consulta) {
		// TODO Auto-generated method stub
		repConsulta.remover(consulta);
	}

	
	public void adicionar(Consulta con)
	{
		repConsulta.adicionar(con);
	}

	
	public void atualizar(Consulta consulta) {
		// TODO Auto-generated method stub

		
		for(int i = 0; i < repConsulta.consultas.size(); i++)
		{
			if(repConsulta.consultas.get(i).getId() == consulta.getId());
			{
				 repConsulta.consultas.set(i,consulta);				
			}
			
		}
		
	
	}

	
	
}
