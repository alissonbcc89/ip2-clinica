package guiCadastrar;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.NumberOfDocuments;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entidade.Animal;
import entidade.Cliente;
import entidade.Endereco;
import entidade.Pessoa;
import repositorio.ControlRepCliente;
import repositorio.RepositorioCliente;

public class GCadastroCliente extends JFrame implements ActionListener{
	
	RepositorioCliente clientes;
	
	JTextField nome, cpf, rua,bairro,cep,estado,numero,pais,nomea,idade,raca,especie;
	
	JButton adicionar, cancelar, voltar;
	
	Cliente cliente;
	Endereco endereco;
	Animal animal;
	
	GCadastro gCadastro;
	
	
	ControlRepCliente repclientes = new ControlRepCliente();
	
	public GCadastroCliente()
	{
		
		
		super("Cadastro Cliente");
		
		//Pessoa cliente = new Cliente(nome.getText(), endereco, title, title, null);
		
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel ("Nome"));
		nome =  new JTextField(30);
		container.add(nome);
		String teste = (nome.getText());
		cliente.setNome(teste);
		
		
		
		container.add(new JLabel ("CPF:"));
		cpf = new JTextField(16);
		container.add(cpf);
		String aux = cpf.getText();
		cliente.setCpf(aux);
		
		container.add(new JLabel("Rua"));
		rua = new JTextField(20);
		container.add(rua);
		String r = rua.getText();
		endereco.setRua(r);
		
		container.add(new JLabel("Bairro"));
		bairro = new JTextField(20);
		container.add(bairro);
		String b = bairro.getText();
		endereco.setBairro(b);
		
		container.add(new JLabel("Cep"));
		cep = new JTextField(16);
		container.add(cep);
		String c = cep.getText();
		endereco.setCep(c);
		
		container.add(new JLabel("Estado"));
		estado = new JTextField(20);
		container.add(estado);
		String e = estado.getText();
		endereco.setEstado(e);
		
		container.add(new JLabel("Numero"));
		numero = new JTextField(20);
		container.add(numero);
		String n = numero.getText();
		endereco.setNumero(n);
		
		container.add(new JLabel("País"));
		pais = new JTextField(20);
		container.add(pais);
		String p = pais.getText();
		endereco.setPais(p);
		
		container.add(new JLabel("Nome"));
		nomea = new JTextField(30);
		container.add(nomea);
		String an = nomea.getText();
		animal.setNome(an);
		
		container.add( new JLabel("Raça"));
		raca = new JTextField();
		container.add(raca);
		String ra = raca.getText();
		animal.setRaca(ra);
		
		
		container.add(new JLabel("Idade"));
		idade = new JTextField();
		container.add(idade);
		String id = idade.getText();
		animal.setIdade(id);
		
		container.add(new JLabel("Especie"));
		especie  = new JTextField();
		container.add(especie);
		String esp = especie.getText();
		animal.setEspecie(esp);
		
		
		adicionar = new JButton("OK");
		container.add(adicionar);
		adicionar.addActionListener(this);
		
		cancelar = new JButton("Cancelar");
		container.add(cancelar);
		cancelar.addActionListener(this);
		
		voltar = new JButton("Voltar");
		container.add(voltar);
		voltar.addActionListener(this);
		
		 setSize(425,100);
		 setVisible(true);		


		
		
	}

	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == adicionar)
		{		
			//devo verificar construtor
			
			endereco = new Endereco(rua.getText(),bairro.getText(),cep.getText(),estado.getText(),numero.getText(),pais.getText(), title);
			animal= new Animal(nome.getText(),raca.getText(),idade.getText(),especie.getText(), cliente, null);
			cliente = new Cliente(nome.getText(),endereco,animal,cpf.getText());
			ControlRepCliente controlRepCliente;
			controlRepCliente.adicionar(cliente);
			gCadastro = new GCadastro();
			dispose();			
		}
		if(e.getSource() == cancelar)
		{
			 for (int i=0; i < getContentPane().getComponentCount(); i++) 
			 {
				//varre todos os componentes

				Component c = getContentPane().getComponent(i);

				if (c instanceof JTextField) 
				{
				//apaga os valores
				JTextField field = (JTextField) c;
				field.setText("");
				//System.out.println("apagando campo " + i);		
				}
			 }
		}
		
		if(e.getSource() == voltar)
		{	
			gCadastro = new GCadastro();
			dispose();
		}
				
		
		}
}



