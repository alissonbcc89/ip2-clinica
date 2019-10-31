package repositorio;

import java.util.ArrayList;

import entidade.Endereco;


// falta implementar assinaturas da interface

public class RepositorioEndereco implements IEndereco{

	ArrayList<Endereco>enderecos ;
	Endereco endereco;
	ControlRepEndereco controlRepEnd;
	
	
	private static RepositorioEndereco instance;
	
	private RepositorioEndereco()
	{
		this.enderecos = new ArrayList<Endereco>();
	}
	
	public static RepositorioEndereco getInstance()
	{
		if(instance == null )
		{
			instance = new RepositorioEndereco();
		}
		return instance;
	}
	

	

	@Override
	public void adicionar(Endereco endereco) {
		// TODO Auto-generated method stub
		enderecos.add(endereco);	
		
	}

	@Override
	public void excluir(Endereco endereco) {
		// TODO Auto-generated method stub
		enderecos.remove(endereco);
		
	}
	
	@Override
	public void alterar(Endereco endereco) {
		// TODO Auto-generated method stub
		controlRepEnd.alterar(endereco);
	}

	@Override
	public Endereco consultar(Endereco endereco) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
