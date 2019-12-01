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
import repositorio.ControlRepEndereco;
import repositorio.ControlRepMedicamento;

public class GRemoverMedicamento extends JFrame implements ActionListener {

	JButton ok,cancela;
	
	JTextField dado, nome;
	
	
	ControlRepMedicamento controlRepMedicamento;
	
	GTelaPrincipal gTelaPrincipal;
	
	int x = Integer.parseInt(dado.getText());
	
	
	public GRemoverMedicamento()
	{
		super("Remover Medicamento");
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(23,2));

		
		container.add(new JLabel("Digite o codigo de barra do medicamento"));
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
			controlRepMedicamento.retirar(x);
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