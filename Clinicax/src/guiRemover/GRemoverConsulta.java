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
import repositorio.ControlRepCliente;
import repositorio.ControlRepConsulta;

public class GRemoverConsulta extends JFrame implements ActionListener {

	JButton ok,cancela;
	
	JTextField dado;
	
	ControlRepConsulta controlRepConsulta;
	
	GTelaPrincipal gTelaPrincipal;
	
	
	public GRemoverConsulta()
	{
		super("Remover Consulta");
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(23,2));

		
		container.add(new JLabel("Digite o cpf do cliente"));
		dado = new JTextField(16);
		container.add(dado);
		
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
			controlRepConsulta.retirar(dado.getText());
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
