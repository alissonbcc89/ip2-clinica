package guiRemover;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import gui.GTelaPrincipal;
import repositorio.ControlRepAnimal;

public class GRemoverAnimal extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ControlRepAnimal controlRepAnimal;
	
	JTextField dado,cpf;
	
	JButton ok,cancela;
	
	GTelaPrincipal gTelaPrincipal;
	
	public GRemoverAnimal()
	{
		super("Excluir animal");
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(23,2));

		
		container.add(new JLabel("Digite um nome de animal"));
		dado = new JTextField(16);
		container.add(dado);
		
		container.add(new JLabel("Digite um  cpf do cliente responsavel"));
		cpf = new JTextField(16);
		container.add(cpf);
		
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
		
		if(e.getSource()  == ok)
		{//Deve esclarecer se buscar por animal ou apendas cpd do cliente;
				
			GTelaPrincipal gTelaPrincipal = new GTelaPrincipal();
			controlRepAnimal.retirando(cpf.getText(),dado.getText());
			
		}
		if(e.getSource() == cancela)
		{
			GTelaPrincipal gTelaPrincipal = new GTelaPrincipal();
			dispose();
		}
	}
	
	

}
