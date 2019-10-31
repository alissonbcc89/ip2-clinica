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
import repositorio.RepositorioAnimal;
import repositorio.RepositorioCliente;




// observar com calma como adicionar um animal e a relação entre cliente e animal.


public class GCadastroAnimal extends JFrame implements ActionListener{
	
	GCadastro cadastro;
	
	JTextField nome,raca,idade,especie, cpf;
	
	JButton ok,cancela;
	
	Animal animal;
	
	
		
	RepositorioAnimal repAnimal = new RepositorioAnimal();
	
	RepositorioCliente repCli = new RepositorioCliente();
	
	public GCadastroAnimal()
	{
		super("Cadastro Animal");		
		Container container = getContentPane();		
		
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel("CPF do Cliente"));
		cpf = new JTextField(20);
		container.add(cpf);
		
		container.add(new JLabel("Nome"));		
		nome = new JTextField(30);
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
		
		repCli = new RepositorioCliente();
		
		setSize(425,100);
		setVisible(true);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//cliente possui arraylist animal
		
		if(e.getSource() ==  ok)
		{
			String aux = cpf.getText();
			boolean b = repCli.buscarCpf(aux);
			
				
			
			if(b == true)
			{
				//public String n = nome.getText();
				//animal.setNome(n);
				
				Cliente cliente = repCli.pesquisarCliente(aux);//nome,raca,idade,especie
								
					animal =new Animal(nome.getText(),raca.getText(),idade.getText(),especie.getText(),cliente);
					repAnimal.adicionar(animal);
				
			}
			if(b == false)
			{
				//apaga os dados e continua na tela de cadastro do cliente ou pode voltar para a tela inicial 
			}
			
		
			
			//repCli.getClass().getCliente().size();//todo animal recebe cliente e todo cliente recebe um ou mais animais, (adicionar animal alhei pode causar conflito de algoritimos ??)
			
			
		}		
		if(e.getSource() == cancela)
		{
			cadastro = new GCadastro();
		}
		
	}

}
