package repositorio;

import entidade.Cliente;

public class ControlRepCliente {
	
	
	RepositorioCliente repCli;
	
	public void adicionar(Cliente cliente)
	{
		repCli.adicionar(cliente);
	}
	
	public void remover(Cliente cliente)
	{
		repCli.remover(cliente);
	}
	
	public Cliente buscar(Cliente cliente)
	{
		Cliente aux = null;
		
		for(int i = 0; i< repCli.clientes.size(); i++ )
		{
			if(repCli.clientes.get(i).equals(cliente));
			{
				aux = repCli.clientes.get(i);
				
			}
		}
		return aux;
	}
	
	public void atualizar(Cliente cliente)
	{
		for(int i = 0; i < repCli.clientes.size(); i++ )
		{
			if(repCli.clientes.get(i).getCpf().equals(cliente))
			{
				repCli.clientes.set(i, cliente);
			}
		}
	}
	/*
	public void adicionar(Cliente cli)
	{
		repCli.adicionar(cli);
	}
	public void remover (String id)
	{
	
	int cont = repCli.clientes.size();
	
		for(int i = 0; i< cont; i++)
		{
			if(id != null && repCli.clientes.get(i).getCpf().equals(id))
		{			
		 repCli.clientes.remove(repCli.clientes.get(i));
		}
		else
			System.out.println("Digite um Cpf Válido");
	}
	}
	
	
	Cliente buscar(String nome)
	{
		int cont = repCli.clientes.size();
		
		for(int i = 0; i<cont; i++)
		{
			if(repCli.clientes.get(i).getNome().equals( nome ) )
			{
				return repCli.clientes.get(i);
			}
			
		}
		
		return null;
		
	}

	public Cliente pesquisarCliente(String cpf)
	{
		int aux = repCli.clientes.size();
		
		for(int i = 0; i < aux; i++)
		{
			if(cpf == repCli.clientes.get(i).getCpf())
			{
				return repCli.clientes.get(i);
			}
		}
		return null;
	}
	
	public void altera(Cliente cliente)
	{
		//Cliente aux = buscar(cliente.getCpf());
						
		for(int i = 0; i < repCli.clientes.size(); i++)
		{
			if(repCli.clientes.get(i).getCpf().equals(cliente.getCpf()))
			{				
					repCli.clientes.set(i,cliente);
			}
	}
	}


	public boolean buscarCpf(String cpf)
	{	
		boolean aux = false;
	
		for (int i = 0; i<repCli.clientes.size(); i++ )
		{
			
			if(repCli.clientes.get(i).getCpf().equals(cpf))
			{
				aux = true;
				return aux;
				
			}
			
		}
		
		return aux;
		
	}
*/
}
