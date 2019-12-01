package guiConsultar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import repositorio.ControlRepAnimal;
import repositorio.RepositorioAnimal;

public class GConsultaAnimal extends JFrame implements ActionListener{
	
	JTextField nome;
	
	JButton ok, voltar;
	
	ArrayList<ControlRepAnimal> controlRepAnimal = new ArrayList<ControlRepAnimal>();
	ArrayList<RepositorioAnimal> repositorioAnimal;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == ok)
		{
			String aux =nome.getText();
			
			for(int i = ‎0; i< controlRepAnimal.size(); i++)
			{
				
				if(repositorioAnimal.get(i).getNome().equals(aux);
				{
					
					 return jLabeMensagem.setText(controlRepAnimal.get(i));
				}
			}
		}
		
	}
	
	

}
