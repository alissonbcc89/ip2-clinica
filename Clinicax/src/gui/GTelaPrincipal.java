package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import guiCadastrar.GCadastro;
import guiConsultar.GConsulta;
import guiEditar.GAtualizar;
import guiPesquisar.GPesquisa;
import guiRemover.GRemover;

public class GTelaPrincipal extends JFrame implements ActionListener{

	GCadastro cad;
	GPesquisa pesq;
	GRemover rem;
	GAtualizar atual;
	GVenda ven;
	//GConsulta con;
	
	
	JButton cadastrar,pesquisar,remover,atualizar,venda,consulta;
	
	public GTelaPrincipal()
	{
		super("Tela Inicial");
		
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		cadastrar = new JButton("Cadastro");
		container.add(cadastrar);
		cadastrar.addActionListener(this);
		
		pesquisar = new JButton("Buscar");
		container.add(pesquisar);
		pesquisar.addActionListener(this);
		
		remover = new JButton("Remover");
		container.add(remover);
		remover.addActionListener(this);
		
		atualizar = new JButton("Atualizar");
		container.add(atualizar);
		atualizar.addActionListener(this);
		
		venda = new JButton("Venda");
		container.add(venda);
		venda.addActionListener(this);
		
		consulta = new JButton("Efetuar Consulta");
		container.add(consulta);
		consulta.addActionListener(this);
		
		 setSize(425,100);
		 setVisible(true);		

	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == cadastrar)
		{
			cad = new GCadastro();		
		//	JOptionPane.showMessageDialog(null, "O bot�o Cadastro foi acionado");
			dispose();
		}
		if(e.getSource() == pesquisar)
		{
			pesq = new GPesquisa();
			//pesq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JOptionPane.showMessageDialog(null, "O bot�o Buscar foi acionado");
			dispose();
		
		
		}
		
		if(e.getSource() == remover)
		{
			rem = new GRemover();
			//rem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JOptionPane.showMessageDialog(null, "O bot�o Remover foi acionado");
			dispose();
		}
		
		if(e.getSource() == atualizar)
		{
			atual = new GAtualizar();
			//atual.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JOptionPane.showMessageDialog(null, "O bot�o Atualizar foi acionado");
			dispose();
		
		}
		
		
		
		if(e.getSource() ==  venda)
		{
			ven = new GVenda();
			JOptionPane.showMessageDialog(null,"O Bot�o efetuar Venda foi adicionado");
			dispose();
		}
		
		if(e.getSource() == consulta)
		{
			con = new GConsulta();
			JOptionPane.showMessageDialog(null,"O Bot�o efetuar Consulta foi adicionado");
			dispose();
			
		}
			
		
		
	}
	
	






}
