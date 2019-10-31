package guiEditar;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GAtualizar extends JFrame implements ActionListener {
	
	JButton atCliente, atAnimal,atProduto,atDependente,atFuncionario;

	GAtualizarCliente cliente;
	
	GAtualizarAnimal animal;
	
	GAtualizarProduto produto;
	
	GAtualizarDependente dependente;
	
	GAtualizarFuncionario funcionario;
	
	public GAtualizar()
	{
		super("Atualizar");
		
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		atCliente = new JButton("Atualizar Cliente");
		container.add(atCliente);
		atCliente.addActionListener(this);
		
		atAnimal = new JButton("Atualizar Animal");
		container.add(atAnimal);
		atAnimal.addActionListener(this);
		
		atProduto = new JButton("Atualizar Produto");
		container.add(atProduto);
		atProduto.addActionListener(this);
		
		atDependente = new JButton("Atulizar Dependente");
		container.add(atDependente);
		atDependente.addActionListener(this);
		
		atFuncionario = new JButton("Atualizar Funcionario");
		container.add(atFuncionario);
		atFuncionario.addActionListener(this);
		

		
		setSize(425,100);
		setVisible(true);		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== atCliente)
		{
			cliente = new GAtualizarCliente();
			dispose();
		}
		if(e.getSource()==atAnimal)
		{
			animal = new GAtualizarAnimal();
			dispose();
		}
		if(e.getSource() == atProduto)
		{
			produto = new GAtualizarProduto();
			dispose();
		}
		if(e.getSource() == atDependente)
		{
			dependente = new GAtualizarDependente();
			dispose();
			
		}
		if(e.getSource()== atFuncionario)
		{
			funcionario = new GAtualizarFuncionario();
			dispose();
			
		}
			
		
	}

}
