package repositorio;

import java.util.ArrayList;

import entidade.Pessoa;


//Não precisa criar repositorio pessoa pois aadiciono  cliente e funcionario.

public class RepPessoa implements IPessoa{
	
	ArrayList<Pessoa>pessoas ;
	
	private static RepPessoa instance;
	
	private RepPessoa()
	{
		this.pessoas = new ArrayList<Pessoa>();
	}

	private static RepPessoa getInstance()
	{
		if(instance == null )
		{
			instance = new RepPessoa()
		}
		return instance;
	}
	@Override
	public void adicionar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
		pessoas.add(pessoa);
		
	}

	@Override
	public void excluir(Pessoa pessoa) throws NullPointerException 
	{
		// TODO Auto-generated method stub		
		for(int i = 0; i < pessoas.size(); i++)
		{
			if(pessoas.get(i).getNome() == pessoa.getNome())
			{
				pessoas.remove(i);
			}
			
		}
		
	}

	@Override
	public Pessoa buscar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < pessoas.size(); i++)
		{
			if(pessoas.get(i).getNome().equals(pessoa.getNome()))
			{
//				return pessoas.get(i).toString();
				
			}
			
		}
		return null;
	}

	@Override
	public void alterar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		for(int i  = 0; i < pessoas.size(); i++ )
		{
			pessoas.set(i, pessoa);
		}
		
	}

}
