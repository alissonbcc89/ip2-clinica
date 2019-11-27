package guiCadastrar;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entidade.Animal;
import entidade.Cliente;
import repositorio.ControlRepAnimal;
import repositorio.RepositorioAnimal;
import repositorio.RepositorioCliente;




// observar com calma como adicionar um animal e a rela��o entre cliente e animal.


public class GCadastroAnimal extends JFrame implements ActionListener{
	
	GCadastro cadastro;
	
	JTextField nome,raca,idade,especie, cpf;
	
	JButton ok,cancela;
	
	Animal animal;
	
	
		
	ControlRepAnimal repAnimal = new ControlRepAnimal();
	
	//RepositorioCliente repCli = new RepositorioCliente();
	
	Cliente cliente;
	
	public GCadastroAnimal()
	{
		super("Cadastro Animal");		
		Container container = getContentPane();		
		
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel("CPF do Cliente"));
		cpf = new JTextField(20);
		container.add(cpf);
		String teste = (cpf.getText());
		cliente.setCpf(teste);
		
		container.add(new JLabel("Nome"));		
		nome = new JTextField(30);
		container.add(nome);
		String n = (nome.getText());
		animal.setNome(n);
		
		container.add( new JLabel("Ra�a"));
		raca = new JTextField();
		container.add(raca);		
		
		container.add(new JLabel("Idade"));
		idade = new JTextField();
		container.add(idade);
		
		container.add(new JLabel("Especie"));
		especie  = new JTextField();
		container.add(especie);
		
		//repCli = new RepositorioCliente();
		
		setSize(425,100);
		setVisible(true);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//cliente possui arraylist animal
		
		if(e.getSource() ==  ok)
		{		
		}
				
		if(e.getSource() == cancela)
		{
			cadastro = new GCadastro();
		}
		
	}

}
