package guiConsultar;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidade.Cliente;
import gui.GTelaPrincipal;
import repositorio.ControlRepCliente;
import repositorio.ControlRepConsulta;

public class GConsultaConsulta extends JFrame implements ActionListener{

	JTextField id;
	Cliente cliente;
	
	JButton ok, voltar;
	
	ControlRepConsulta controlRepConsulta;
	
	GTelaPrincipal gTelaPrincipal;
	
	//ArrayList<ControlRepCliente> controlRepCliente;
	
	public GConsultaConsulta()
	{
		
		
		super("Buscar Consulta");
		
		//controlRepCliente = new ArrayList<ControlRepCliente>();
		
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel ("ID Consulta"));
		id =  new JTextField(30);
		container.add(id);
		
		
		
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
					
			int identidade = Integer.parseInt(id.getText());
			
			JOptionPane.showMessageDialog(null,controlRepConsulta.retornaId(identidade));
			
			GTelaPrincipal gTelaPrincipal = new GTelaPrincipal();

			
		}
		if(e.getSource() == voltar)
		{
			GTelaPrincipal gTelaPrincipal = new GTelaPrincipal();
			dispose();
		}
		}
	


}


