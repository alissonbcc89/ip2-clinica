package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import guiCadastrar.GCadastroCliente;
import guiCadastrar.GCadastroFuncionario;
import guiCadastrar.GCadastroMedicamento;
import guiCadastrar.GCadastroProduto;
import guiCadastrar.GCadastroVeterinario;
import guiConsultar.GConsulta;

public class GInicial extends JFrame implements ActionListener{

	
	GAnimal ani ;
	GDependente dep;
	GCadastroCliente cli;
	GCadastroFuncionario fun;
	GConsulta con;
	GVenda ven;
	GCadastroVeterinario vet;
	GCadastroProduto prod;
	GCadastroMedicamento med;
	
	JButton adcCliente, adcFuncionario,adcProduto,adcConsulta,venda,adcDependente,adcAnimal;
	
	public GInicial()
	{
		
		super("Tela Inicial");
		

		
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		adcCliente = new JButton("Adicionar Cliente");
		container.add(adcCliente);
		adcCliente.addActionListener(this);
		
		
		
		adcFuncionario = new JButton("Adicionar Funcionario");
		container.add(adcFuncionario);
		adcFuncionario.addActionListener(this);
		
		adcProduto = new JButton("Adicionar Produto");
		container.add(adcProduto);
		adcProduto.addActionListener(this);
		
		adcConsulta = new JButton("Adicionar Consulta");
		container.add(adcConsulta);
		adcConsulta.addActionListener(this);
		
		venda = new JButton("Efetuar Venda");
		container.add(venda);		
		venda.addActionListener(this);
		
		adcDependente = new JButton("Adicionar Dependente");
		container.add(adcDependente);
		adcDependente.addActionListener(this);
		
		adcAnimal = new JButton("Adicionar Animal");
		container.add(adcAnimal);
		adcAnimal.addActionListener(this);
		
		 setSize(425,100);
		 setVisible(true);		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == adcCliente)
		{ 
			cli = new GCadastroCliente();
			cli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JOptionPane.showMessageDialog(null, "O botão ADICIONAR CLIENTE foi clicado");
			//criar tela cliente;
			GCliente Gcliente = new GCliente();
			dispose();
			
			
		}
		if(e.getSource() == adcFuncionario)
		{
			fun = new GCadastroFuncionario();
			fun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JOptionPane.showMessageDialog(null, "O botão ADICIONAR FUNCIONARIO foi clicado");
			dispose();
		}
		if(e.getSource() == adcProduto)
		{
			prod = new GCadastroProduto();
			prod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JOptionPane.showMessageDialog(null, "O botão ADICIONAR PRODUTO foi clicado");
			dispose();
		}
		if(e.getSource() == adcConsulta)
		{
			con = new GConsulta();
			con.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JOptionPane.showMessageDialog(null, "O botão ADICIONAR CONSULTA foi clicado");
			dispose();
		}
		if(e.getSource() == venda)
		{
			JOptionPane.showMessageDialog(null, "O botão ADICIONAR VENDAS foi clicado");
			dispose();
		}
		if(e.getSource() == adcDependente)
		{
			dep = new GDependente();
			dep.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JOptionPane.showMessageDialog(null, "O botão ADICIONAR DEPENDENTE foi clicado");
			dispose();
		}
		if(e.getSource() == adcAnimal)
		{
			ani = new GAnimal();
			
			
			
			JOptionPane.showMessageDialog(null, "O botão ADICIONAR ANIMAL foi clicado");
			dispose();
		
			// ani = new GAnimal();		
			//ani.getAccessibleContext();
			//ani.getContentPane();
			//ani.getAccessibleContext();
			//ani.getContentPane();
			//ani.setLayout(ani.getLayout());
			//ani.
			//ani.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//JOptionPane.getDesktopPaneForComponent(ani);
				
			
		}
	}

}
