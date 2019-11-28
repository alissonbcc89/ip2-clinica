package guiCadastrar;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entidade.Animal;
import entidade.Cliente;
import entidade.Consulta;
import repositorio.ControlRepConsulta;

public class GCadastroConsulta extends JFrame implements ActionListener{

	
	//int id, LocalDate dateFormat, double valor, Animal animal
	
	
	Consulta consulta;
	
	
	
	ControlRepConsulta controlRepConsulta;
	
	
	//String nome, String raca, String idade,String especie, Cliente c, LocalDate d
	Animal animal;
	
	
	
	JTextField valor,nome,raca,idade,especie;
	JButton ok, voltar;
	
	public GCadastroConsulta()
	{
		super("Cadastro Consulta");
		
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel ("Nome"));
		nome =  new JTextField(30);
		container.add(nome);
		String teste = (nome.getText());
		animal.setNome(teste);
		
		container.add(new JLabel ("Raca"));
		raca =  new JTextField(30);
		container.add(raca);
		String r = (raca.getText());
		animal.setRaca(r);
		
		container.add(new JLabel ("Idade"));
		idade =  new JTextField(30);
		container.add(idade);
		String i = (nome.getText());
		animal.setIdade(i);
		
		container.add(new JLabel ("Especie"));
		especie =  new JTextField(30);
		container.add(especie);
		String e = (especie.getText());
		animal.setEspecie(e);
		
		
		container.add(new JLabel ("Valor"));
		valor =  new JTextField(30);
		container.add(valor);
		Double num = Double.parseDouble( valor.getText());
		consulta.setValor(num);
		
		
		
		ok = new JButton("OK");
		container.add(ok);
		ok.addActionListener(this);
		
		voltar = new JButton("Voltar");
		container.add(voltar);
		voltar.addActionListener(this);
		
		 setSize(425,100);
		 setVisible(true);		

		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == ok)
		{
			controlRepConsulta.adicionar(consulta);
			//devo chamar a primeira tela sempre que efetuar entrada.
		}
		if(e.getSource() == voltar)
		{
			GCadastro gCadastro = new GCadastro();
			
			dispose();
		}
	}

}
