package repositorio;

import entidade.Consulta;

public interface IConsulta {
	
	public void adcionar(Consulta consulta);
	public void remover(Consulta consulta);
	public void atualizar(Consulta consulta);
	public void buscar(Consulta consulta);
	

}
