package guiAtualizar;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import guiCadastrar.GCadastroCliente;

public class GAtualizarCliente extends JFrame implements ActionListener {
	
	String cpf;
	GCadastroCliente cadcli;
	
	
	
	
	public GAtualizarCliente()
	{
		super("Atualizando Cliente\nO que deseja atualizar");
		
		
		Container container  = getContentPane();

		container.setLayout(new GridLayout(23,2));
		
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == cadcli)
		{
			cadcli = new GCadastroCliente();
			dispose();
		}
		if(e.getSource() )
	}
	

}
