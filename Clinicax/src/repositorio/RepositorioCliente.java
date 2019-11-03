package repositorio;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


import entidade.Animal;
import entidade.Cliente;
import entidade.Endereco;
import entidade.Pessoa;

public class RepositorioCliente {
	
	
	ControlRepCliente controlRepCli;
	
	
	
	ArrayList<Cliente> clientes;
	
	private static RepositorioCliente instance;
	
	private RepositorioCliente()
	{
		this.clientes = new ArrayList<Cliente>();
	}
	
	public static RepositorioCliente getInstance()
	{
		if(instance == null )
		{
			instance = new RepositorioCliente();
		}
		return instance;
	}
	

	//String nome,String (rua, String bairro, String cep, String estado, String numero, String pais, Endereco end),Animal animal, String codigo
	
	
	
	
	// String n = entradaTexto1.getText();
	
	//Cliente clientex = new Cliente(textoEntrada1,textoEntrada2,textoEntrada3,textoEntrada4,textoEntrada5,textoEntrada6,textoEntrada7,textoEntrada8,textoEntrada9,textoEntrada10);
		
		


	public void adicionar(Cliente cliente) 
	{		
		clientes.add(cliente);
		//System.out.print("Inserido");
	}
	
	public void remover (Cliente cliente)
	{
		clientes.remove(cliente);
	}
	
	
	public Cliente buscar(Cliente cliente)
	{
		return controlRepCli.buscar(cliente);
		
	}
	
	public void atualizar(Cliente cliente)
	{
		//Cliente aux = buscar(cliente.getCpf());
		controlRepCli.atualizar(cliente);
	}
	
	/*public Cliente pesquisarCliente(String cpf)
	{
		return	controlRepCli.pesquisarCliente(cpf) ;
	}
	
	
	
	public boolean buscarCpf(String cpf)
	{
		return controlRepCli.buscarCpf(cpf);	
	}
	*/
	
	
}

