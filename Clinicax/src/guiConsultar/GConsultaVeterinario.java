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
import repositorio.ControlRepFuncionario;
import repositorio.ControlRepVeterinario;

public class GConsultaVeterinario extends JFrame implements ActionListener{

	JTextField cpf;
	Cliente cliente;
	
	JButton ok, voltar;
	
	ControlRepVeterinario controlRepVeterinario;
	
	GTelaPrincipal gTelaPrincipal;
	
	//ArrayList<ControlRepCliente> controlRepCliente;
	
	public GConsultaVeterinario()
	{
		
		
		super("Buscar Veterinario");
		
		//controlRepCliente = new ArrayList<ControlRepCliente>();
		
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel ("CRMV"));
		cpf =  new JTextField(30);
		container.add(cpf);
	//	String teste = (cpf.getText());
	//	cliente.setCpf(teste);
		
		
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
					
				
			JOptionPane.showMessageDialog(null,controlRepVeterinario.retornaId(cpf.getText()));
			
			GTelaPrincipal gTelaPrincipal = new GTelaPrincipal();

			
		}
		if(e.getSource() == voltar)
		{
			GTelaPrincipal gTelaPrincipal = new GTelaPrincipal();
			dispose();
		}
		}
	}



