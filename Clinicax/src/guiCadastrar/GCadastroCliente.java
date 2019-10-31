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
import repositorio.RepositorioCliente;

public class GCadastroCliente extends JFrame implements ActionListener{
	
	RepositorioCliente clientes;
	
	JTextField nome, cpf, rua,bairro,cep,estado,numero,pais,nomea,idade,raca,especie;
	
	JButton adicionar, cancelar, voltar;
	
	Cliente cliente;
	Endereco endereco;
	Animal animal;
	
	GCadastro gCadastro;
	
	
	RepositorioCliente repclientes = new RepositorioCliente();
	
	public GCadastroCliente()
	{
		super("Cadastro Cliente");
		
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel ("Nome"));
		nome =  new JTextField(30);
		container.add(nome);
		
		container.add(new JLabel ("CPF:"));
		cpf = new JTextField(16);
		container.add(cpf);
		
		container.add(new JLabel("Rua"));
		rua = new JTextField(20);
		container.add(rua);
		
		container.add(new JLabel("Bairro"));
		bairro = new JTextField(20);
		container.add(bairro);
		
		container.add(new JLabel("Cep"));
		cep = new JTextField(16);
		container.add(cep);
		
		container.add(new JLabel("Estado"));
		estado = new JTextField(20);
		container.add(estado);
		
		container.add(new JLabel("Numero"));
		numero = new JTextField(20);
		container.add(numero);
		
		container.add(new JLabel("País"));
		pais = new JTextField(20);
		container.add(pais);
		
		container.add(new JLabel("Nome"));
		nomea = new JTextField(30);
		container.add(nome);
		
		container.add( new JLabel("Raça"));
		raca = new JTextField();
		container.add(raca);
		
		
		container.add(new JLabel("Idade"));
		idade = new JTextField();
		container.add(idade);
		
		container.add(new JLabel("Especie"));
		especie  = new JTextField();
		container.add(especie);
		
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
			endereco = new Endereco(rua.getText(),bairro.getText(),cep.getText(),estado.getText(),numero.getText(),pais.getText());
			animal= new Animal(nomea.getText(),raca.getText(),idade.getText(),especie.getText());
			cliente = new Cliente(nome.getText(),endereco,animal,cpf.getText());
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



