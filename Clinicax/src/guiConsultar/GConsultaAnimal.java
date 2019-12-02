package guiConsultar;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import gui.GTelaPrincipal;
import repositorio.ControlRepAnimal;
import repositorio.RepositorioAnimal;

public class GConsultaAnimal extends JFrame implements ActionListener{
	
	JTextField nome, id;
	
	ControlRepAnimal controlRepAnimal;
	
	GTelaPrincipal gTelaPRincipal;
	

	JButton ok, cancela;
	
	public GConsultaAnimal()
	{
		super("Excluir Animal");
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel("Digite a identidade do animal"));
		id = new JTextField(30);
		container.add(id);
		
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
		if(e.getSource() == ok)
		{
			
			int identidade = Integer.parseInt(id.getText());
			controlRepAnimal.retornaId(identidade);
			
			
		}
		if(e.getSource() == cancela)
		{
			GTelaPrincipal gTelaPRincipal = new GTelaPrincipal();
			dispose();
		}
		
	}
	
	

}
