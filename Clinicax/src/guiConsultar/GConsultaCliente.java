package guiConsultar;

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

import entidade.Cliente;
import repositorio.ControlRepCliente;

public class GConsultaCliente extends JFrame implements ActionListener{

	JTextField cpf;
	Cliente cliente;
	
	JButton ok, voltar;
	
	ArrayList<ControlRepCliente> controlRepCliente;
	
	public GConsultaCliente()
	{
		
		
		super("Digite o cpf");
		
		controlRepCliente = new ArrayList<ControlRepCliente>();
		
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel ("CPF"));
		cpf =  new JTextField(30);
		container.add(cpf);
		String teste = (cpf.getText());
		cliente.setCpf(teste);
		
		
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
			for(int i= 0; i< controlRepCliente.size(); i++)
			{
				//String aux = cpf.getText
					JOptionPane.showInputDialog(controlRepCliente.get(i).buscarCpf(cliente.getCpf()));

			}		
			
		}
		if(e.getSource() == voltar)
		{
			GConsulta gConsulta = new GConsulta();
			dispose();
		}
		}
	}


