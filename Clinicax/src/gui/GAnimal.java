package gui;

import java.awt.Container; 
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import entidade.Animal;
import entidade.Pessoa;
import repositorio.ControlRepAnimal;
import repositorio.RepositorioAnimal;

public class GAnimal extends JFrame implements ActionListener {
	
	JTextField nome,raca,especie,idade;
	JButton ok, cancela;
	
	Animal animal ;
	ControlRepAnimal controlRepAnimal = new ControlRepAnimal();
	
	
	public GAnimal()
	{
		
		super("Cadastro de Animais");
		Container container = getContentPane();
		
		
		
		container.setLayout( new GridLayout(23,2));
		
		container.add(new JLabel("Nome", SwingConstants.LEFT));
		nome = new JTextField(30);
		container.add(nome);
		animal.setNome(nome.getText());
		
		
		container.add(new JLabel("Raça", SwingConstants.LEFT));
		raca = new JTextField(15);
		container.add(raca);
		
		animal.setRaca(raca.getText());
		
		container.add(new JLabel("Especie", SwingConstants.LEFT));
		especie = new JTextField(10);
		container.add(especie);
		animal.setEspecie(especie.getText());
		
		container.add(new JLabel("Idade",SwingConstants.LEFT));
		idade = new JTextField(2);
		container.add(idade);
		animal.setIdade(idade.getText());
		
		ok = new JButton("Adicionar Animal");
		container.add(ok);
		ok.addActionListener(this);
		
		cancela = new JButton("Cancelar");
		container.add(cancela);
		cancela.addActionListener(this);
		
		setSize(640,480);
		 setVisible(true);		
		
		
	}
	
	
	
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource() == ok)
		{
	
			controlRepAnimal.adicionar(animal);
			//animal = new Animal(nome.getText(),raca.getText(),idade.getText(),especie.getText());			
			//repAnimal.adicionar(animal);
			//try {
			JOptionPane.showMessageDialog(null, "Animal Adicionado com sucesso" /*+nome.getText()
			+ idade.getText()+raca.getText()+especie.getText()*/);
			
			
			
			GInicial gInicial = new GInicial();
			dispose();
			//gInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//}
			
			/*catch(Exception ex)
			{
				JOptionPane.showMessageDialog(this, "Precisa Digitar os Caracters em branco!");
				//GAnimal ani = GAnimal();
				//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}*/
			
		}
		if(e.getSource()  == cancela)
		{
			GInicial gInicial  = new GInicial();
			
			
			
			
		}
	
	}

}
