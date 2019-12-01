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
import repositorio.ControlRepConsulta;
import repositorio.ControlRepDependente;

public class GRemoverDependente extends JFrame implements ActionListener {

	JButton ok,cancela;
	
	JTextField dado, nome;
	
	ControlRepDependente controlRepDependente;
	
	GTelaPrincipal gTelaPrincipal;
	
	
	public GRemoverDependente()
	{
		super("Remover Dependente");
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(23,2));

		
		container.add(new JLabel("Digite o cpf do cliente"));
		dado = new JTextField(16);
		container.add(dado);
		
		container.add(new JLabel("Digite Nome do dependente"));
		nome = new JTextField(16);
		container.add(nome);
		
		
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
		
		if(e.getSource() == ok )
		{
			controlRepDependente.retirar(dado.getText(), nome.getText());
			GTelaPrincipal gTelaPrincipal = new GTelaPrincipal();
			dispose();
			
		}
		if(e.getSource() == cancela )
		{
			GTelaPrincipal gTelaPrincipal = new GTelaPrincipal();
			dispose();
		}
	}

}
