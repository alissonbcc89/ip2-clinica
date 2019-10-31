package guiCadastrar;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GCadastro extends JFrame implements ActionListener {
	
	
	GCadastroCliente cadCliente;
	GCadastroFuncionario cadFuncionario;
	GCadastroAnimal cadAnimal;
	GCadastroConsulta cadConsulta;
	GCadastroDependente cadDependente;
	GCadastroProduto cadProduto;
	GCadastroMedicamento cadMedicamento;
	
	JButton cadCli,cadFun,cadAni,cadCon,cadDep,cadProd,cadMed;
	
	public GCadastro()
	{
		super("Cadastro");
		
		Container container =  getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		cadCli = new JButton("Cadastro Cliente");
		container.add(cadCli);
		cadCli.addActionListener(this);
		
		cadFun = new JButton("Cadastro Funcionario");
		container.add(cadFun);
		cadFun.addActionListener(this);
		
		cadAni = new JButton("Cadastro Animal");
		container.add(cadAni);
		cadAni.addActionListener(this);
		
		cadCon = new JButton("Cadastro Consulta");
		container.add(cadCon);
		cadCon.addActionListener(this);
		
		cadDep = new JButton("Cadastro Dependente");
		container.add(cadDep);
		cadDep.addActionListener(this);
		
		cadProd = new JButton("Cadastro Produto");
		container.add(cadProd);
		cadProd.addActionListener(this);
		
		cadMed = new JButton("Cadastro de Medicamentos");
		container.add(cadMed);
		cadMed.addActionListener(this);
		
		setSize(425,100);
		setVisible(true);		

		
	}	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub	
		if(e.getSource() == cadCli)
		{
			cadCliente =  new GCadastroCliente();
			dispose();
		}
		if(e.getSource()== cadFun)
		{
			cadFuncionario = new GCadastroFuncionario();
			dispose();
		}
		if(e.getSource() == cadAni)
		{
			cadAnimal = new GCadastroAnimal();
			dispose();
		}
		if(e.getSource() == cadCon)
		{
			cadConsulta = new GCadastroConsulta();
			dispose();
		}
		if(e.getSource() == cadDep)
		{
			cadDependente = new GCadastroDependente();
			dispose();
		}
		if(e.getSource() == cadProd)
		{
			cadProduto = new GCadastroProduto();
			dispose();
		}
		if(e.getSource() == cadMed)
		{
			cadMedicamento = new GCadastroMedicamento();
			dispose();
		}
		
	
	}
	
	
	
	
}
