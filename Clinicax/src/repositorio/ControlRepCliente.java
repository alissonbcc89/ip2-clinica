package repositorio;

import entidade.Cliente;

public class ControlRepCliente {
	
	
	RepositorioCliente repCli;
	
	public ControlRepCliente()
	{
		this.repCli = RepositorioCliente.getInstance();
	}
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
	
	public Cliente buscarCpf(String cpf)
	{	
		Cliente aux = null;
	
		for (int i = 0; i<repCli.clientes.size(); i++ )
		{
			
			if(repCli.clientes.get(i).getCpf().equals(cpf))
			{
			 	aux = repCli.clientes.get(i);
			}
			
		}
		
		return aux;
		
	}
	
	public boolean retirar(String cpf)
	{
		boolean aux = false;
		
		for (int i = 0; i<repCli.clientes.size(); i++ )
		{
			
			if(repCli.clientes.get(i).getCpf().equals(cpf))
			{
			 	aux = true;
			 	repCli.remover(repCli.clientes.get(i));
			}
			
		}
		
		return aux;
		
	}

	public Cliente retornaId(String cpf)
	{
		Cliente c = null;
		
		for(int i = 0; i< repCli.clientes.size(); i++)
		{
			if(repCli.clientes.get(i).getCpf().equals(cpf))
			{
				c = repCli.clientes.get(i);
			}
		}
		return c;
	}
}
