package repositorio;

import entidade.Consulta;

public interface IRepositorioConsulta {
	
	public void adicionar(Consulta consulta);
	public void remover(Consulta consulta);
	public Consulta buscar(int cod);
	public void editar(int cod,Consulta con);
	

}
