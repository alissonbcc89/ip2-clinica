package guiCadastrar;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

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
	
	


	/**
	 * 
	 */
	

	//RepositorioCliente clientes;

	
	//JLabel cpf, bairro,cep,estado,numero,pais,nomea,idade,raca,especie;

	JTextField rua, cpf,telefone,bairro,cep,estado,numero,pais,nome,idade,raca,especie;
	
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
		//String nome,Endereco end,String cpf, String t,LocalDate dataNascimento
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(53,2));
		
		container.add(new JLabel ("Nome"));
		nome =  new JTextField(30);
		container.add(nome);
		String teste = (nome.getText());
		//cliente.setNome(teste);
		
		
		container.add(new JLabel ("CPF:"));
		cpf = new JTextField(16);
		container.add(cpf);
		String aux = cpf.getText();
		//cliente.setCpf(aux);
		
		container.add(new JLabel("Telefone"));
		telefone = new JTextField(12);
		container.add(telefone);
		
		//String rua, String bairro, String cep, String estado, String numero, String pais, String codigo
		container.add(new JLabel("Rua"));
		rua = new JTextField(20);
		container.add(rua);
		String r = rua.getText();
		//endereco.setRua(r);
		
		container.add(new JLabel("Bairro"));
		bairro = new JTextField(20);
		container.add(bairro);
		String b = bairro.getText();
		//endereco.setBairro(b);
		
		container.add(new JLabel("Cep"));
		cep = new JTextField(16);
		container.add(cep);
		String c = cep.getText();
		//endereco.setCep(c);
		
		container.add(new JLabel("Estado"));
		estado = new JTextField(20);
		container.add(estado);
		String e = estado.getText();
		//endereco.setEstado(e);
		
		container.add(new JLabel("Numero"));
		numero = new JTextField(20);
		container.add(numero);
		String n = numero.getText();
		//endereco.setNumero(n);
		
		container.add(new JLabel("Pa�s"));
		pais = new JTextField(20);
		container.add(pais);
		String p = pais.getText();
		//endereco.setPais(p);
		
		container.add(new JLabel("Nome"));
		nome = new JTextField(30);
		container.add(nome);
		String an = nome.getText();
		//animal.setNome(an);
		
		container.add( new JLabel("Ra�a"));
		raca = new JTextField();
		container.add(raca);
		String ra = raca.getText();
		//animal.setRaca(ra);
		
		
		container.add(new JLabel("Idade"));
		idade = new JTextField();
		container.add(idade);
		String id = idade.getText();
	//	animal.setIdade(id);
		
		container.add(new JLabel("Especie"));
		especie  = new JTextField();
		container.add(especie);
		String esp = especie.getText();
		//animal.setEspecie(esp);
		
		
		adicionar = new JButton("OK");
		container.add(adicionar);
		adicionar.addActionListener(this);
		
		cancelar = new JButton("Cancelar");
		container.add(cancelar);
		cancelar.addActionListener(this);
		
		voltar = new JButton("Voltar");
		container.add(voltar);
		voltar.addActionListener(this);
		
		 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setSize(425,300);
		 setVisible(true);		


		
		
	}

	

	
	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		
		if(a.getSource() == adicionar)
		{		
			//devo verificar construtor
			//String rua, String bairro, String cep, String estado, String numero, String pais, String codigo
			endereco = new Endereco(rua.getText(),bairro.getText(),cep.getText(),estado.getText(),numero.getText(),pais.getText(),cpf.getText());
			
			//String nome, String raca, String idade,String especie, Cliente c, LocalDate d
			animal= new Animal(nome.getText(),raca.getText(),idade.getText(),especie.getText(), cliente.getCpf());
			
			//String nome,Endereco end,String cpf, String t,LocalDate dataNascimento
			cliente = new Cliente(nome.getText(),endereco,cpf.getText(),"9999999",null);
			
			repclientes.adicionar(cliente);
			
			
			gCadastro = new GCadastro();
			dispose();			
		}
		if(a.getSource() == cancelar)
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
		
		if(a.getSource() == voltar)
		{	
			gCadastro = new GCadastro();
			dispose();
		}
				
		
		}
}



