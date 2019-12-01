package guiAtualizar;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entidade.Animal;
import guiCadastrar.GCadastro;
import repositorio.ControlRepAnimal;

public class GAtualizarAnimal extends JFrame implements ActionListener{
	
	GCadastro cadastro;
	
	JTextField nome,raca,idade,especie, cpf;
	
	JButton ok,cancela;
	
	//String nome, String raca, String idade,String especie, Cliente c, LocalDate d
	Animal animal;
	
	
		
	ControlRepAnimal repAnimal = new ControlRepAnimal();
	
	//RepositorioCliente repCli = new RepositorioCliente();
	
	//Cliente cliente;
	
	public GAtualizarAnimal()
	{
		super("Atualizar animal");		
		Container container = getContentPane();		
		
		container.setLayout(new GridLayout(23,2));
		
		/*container.add(new JLabel("CPF do Cliente"));
		cpf = new JTextField(20);
		container.add(cpf);
		String teste = (cpf.getText());
		cliente.setCpf(teste);*/
		
		//String nome, String raca, String idade,String especie, String codCliente, LocalDate d
		
		container.add(new JLabel("Cpf:"));
		cpf = new JTextField(16);
		container.add(cpf);
		
		container.add(new JLabel("Nome"));		
		nome = new JTextField(30);
		container.add(nome);
		String n = (nome.getText());
		//animal.setNome(n);
		
		container.add( new JLabel("Raça"));
		raca = new JTextField();
		container.add(raca);
		String r = (raca.getText());
		//animal.setRaca(r);
		
		container.add(new JLabel("Idade"));
		idade = new JTextField();
		container.add(idade);
		String i = idade.getText();
// 		animal.setIdade(i);
		
		container.add(new JLabel("Especie"));
		especie  = new JTextField();
		container.add(especie);
		String e = especie.getText();
	//	animal.setEspecie(e);
		
		//repCli = new RepositorioCliente();
		
		ok = new JButton("OK");
		container.add(ok);
		ok.addActionListener(this);
		
		/*cancelar = new JButton("Cancelar");
		container.add(cancelar);
		cancelar.addActionListener(this);*/
		
		cancela = new JButton("Voltar");
		container.add(cancela);
		cancela.addActionListener(this);
		
		 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setSize(425,300);
		 setVisible(true);		
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//cliente possui arraylist animal
		
		if(e.getSource() ==  ok)
		{	
			//String nome, String raca, String idade,String especie, String codCliente
			Animal animal = new Animal(nome.getText(),raca.getText(),idade.getText(),especie.getText(),cpf.getText());
			
			//controlRepAnimal.adicionar(animal);
			repAnimal.alterar(animal);
			
			//GCadastro cadastro;
			cadastro = new GCadastro();
			dispose();
		}
				
		if(e.getSource() == cancela)
		{
			cadastro = new GCadastro();
			dispose();
		}
		
	}

}
