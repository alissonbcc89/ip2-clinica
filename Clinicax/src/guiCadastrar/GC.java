package guiCadastrar;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import gui.GTelaPrincipal;

public class GC extends JFrame implements ActionListener{
	
	
	GCadastroAnimal gCadastroAnimal;
	GCadastroCliente cadCliente;
	GCadastroConsulta cadConsulta;
	GCadastroDependente cadDependente;
	GCadastroEndereco cadEndereco;
	GCadastroFuncionario cadFuncionario;
	GCadastroMedicamento cadMedicamento;
	GCadastroProduto cadProduto;
	GCadastroVeterinario cadVeterinario;
	
	
	GTelaPrincipal gTelaPrincipal;
	
	//devo efetuar a criação de classe venda aqui?
	
	
	JButton cadastroAnimal,cadastroCliente,cadastroConsulta,cadastroDependente,cadastroEndereco,cadastroFuncionario,cadastroMedico,cadastroProduto,cadastroVeterinario,voltar;
	
	public GC()
	{
		super("Cadastro");
		
		Container container =  getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		cadastroAnimal = new JButton("Cadastro Animal");
		container.add(cadastroAnimal);
		cadastroAnimal.addActionListener(this);
		
		
		cadastroCliente = new JButton("Cadastro Cliente");
		container.add(cadastroCliente);
		cadastroCliente.addActionListener(this);
		
		cadastroConsulta = new JButton("Cadastro Consulta");
		container.add(cadastroConsulta);
		cadastroConsulta.addActionListener(this);
		
		cadastroDependente = new JButton("Cadastro Dependente");
		container.add(cadastroDependente);
		cadastroDependente.addActionListener(this);
		
		cadastroEndereco = new JButton("Cadastro Endereco");
		container.add(cadastroEndereco);
		cadastroEndereco.addActionListener(this);
		
		cadastroFuncionario = new JButton("Cadastro Funcionario");
		container.add(cadastroFuncionario);
		cadastroFuncionario.addActionListener(this);
		
		cadastroMedico = new JButton("Cadastro de Medicamentos");
		container.add(cadastroMedico);
		cadastroMedico.addActionListener(this);
		
		cadastroProduto = new JButton("Cadastro de Produto");
		container.add(cadastroProduto);
		cadastroProduto.addActionListener(this);
		
		cadastroVeterinario = new JButton("Cadastro de Veterinario");
		container.add(cadastroVeterinario);
		cadastroVeterinario.addActionListener(this);
		
		voltar = new JButton("Tela Principal");
		container.add(voltar);
		voltar.addActionListener(this);
		
		setSize(425,100);
		setVisible(true);		

		
	}	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
		if(e.getSource() == voltar )
		{
			gTelaPrincipal = new GTelaPrincipal();
			dispose();
		}
		if(e.getSource() == cadastroAnimal)
		{
			//gCadastroAnimal = 
			new GCadastroAnimal().setVisible(true);
			JOptionPane.showMessageDialog(null, "O botão Buscar foi acionado");
			dispose();
		}
		
		if(e.getSource() == cadastroCliente)
		{
			//GCadastroCliente cadCliente
			//cadCliente = new GCadastroCliente();
			new GCadastroCliente().setVisible(true);
			//gTelaPrincipal = new GTelaPrincipal();
		//	new GTelaPrincipal().setVisible(true);
			dispose();
			JOptionPane.showMessageDialog(null, "O botão Buscar foi acionado");
			//dispose();
		}
		
		if(e.getSource() == cadastroConsulta)
		{
			cadConsulta = new GCadastroConsulta();
			JOptionPane.showMessageDialog(null, "O botão Buscar foi acionado");
			dispose();
		}
		
		if(e.getSource() == cadastroDependente)
		{
			cadDependente = new GCadastroDependente();
			JOptionPane.showMessageDialog(null, "O botão Buscar foi acionado");
			dispose();
		}
		
		if(e.getSource()== cadastroFuncionario)
		{
			cadFuncionario = new GCadastroFuncionario();
			JOptionPane.showMessageDialog(null, "O botão Buscar foi acionado");
			dispose();
		}
		
		if(e.getSource() == cadastroMedico)
		{
			cadMedicamento = new GCadastroMedicamento();
			JOptionPane.showMessageDialog(null, "O botão Buscar foi acionado");
			dispose();
		}
		
		
		if(e.getSource() == cadastroProduto)
		{
			cadProduto = new GCadastroProduto();
			dispose();
		}
		
		if(e.getSource() == cadastroVeterinario)
		{
			cadVeterinario = new GCadastroVeterinario();
			dispose();
		}
		if(e.getSource() == cadastroEndereco )
		{
			cadEndereco = new GCadastroEndereco();
		}
	
	}

}
