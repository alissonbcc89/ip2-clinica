package guiConsultar;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;


public class GConsulta extends JFrame implements ActionListener{
	
	GConsultaAnimal gConsultaAnimal;
	GConsultaCliente gConsultaCliente;
	GConsultaConsulta gConsultaCosulta;
	GConsultaEndereco gConsultaEndereco;
	GConsultaFuncionario gConsultaFuncionario;
	GConsultaMedicamento gConsultaMedicamento;
	GConsultaProduto gConsultaProduto;
	GConsultaVeterinario gConsultaVeterinario;
	
	
	JButton consultaAnimal,consultaCliente,consultaConsulta,consultaEndereco,consultaFuncionario,consultaMedicamento,consultaProduto,consultaVeterinario,voltar;
	
	public GConsulta()
	{
		super("Consulte o que desejar");
		
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
	
		
		consultaAnimal = new JButton("Consulta Animal");
		container.add(consultaAnimal);
		consultaAnimal.addActionListener(this);
		
		consultaCliente = new JButton("Consulta Cliente");
		container.add(consultaCliente);
		consultaCliente.addActionListener(this);
		
		
		consultaConsulta = new JButton("Consultar Consulta");
		container.add(consultaConsulta);
		consultaConsulta.addActionListener(this);
		
		consultaEndereco = new JButton("Consulta Endereco");
		container.add(consultaEndereco);
		consultaEndereco.addActionListener(this);
		
		
		consultaFuncionario = new JButton("Consulta Funcionario");
		container.add(consultaFuncionario);
		consultaFuncionario.addActionListener(this);
		
		
		consultaMedicamento = new JButton("Consulta Medicamento");
		container.add(consultaMedicamento);
		consultaMedicamento.addActionListener(this);
		
		consultaProduto = new JButton("Consulta Produto");
		container.add(consultaProduto);
		consultaProduto.addActionListener(this);
		
		consultaVeterinario = new JButton("Consulta Veterinario");
		container.add(consultaVeterinario);
		consultaVeterinario.addActionListener(this);
		
		voltar = new JButton("Voltar");
		container.add(voltar);
		voltar.addActionListener(this);
		
		 setSize(425,100);
		 setVisible(true);		

		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == consultaAnimal)
		{
			GConsultaAnimal gConsultaAnimal = new GConsultaAnimal();
			dispose();
		}
		if(e.getSource() == consultaCliente)
		{
			GConsultaCliente gConsultaCliente = new GConsultaCliente();
			dispose();
		}
		if(e.getSource() == consultaConsulta)
		{
			GConsultaConsulta gConsultaConsulta = new GConsultaConsulta();
			dispose();
		}
		if(e.getSource() == consultaEndereco)
		{
			GConsultaEndereco gConsultaEndereco = new GConsultaEndereco();
			dispose();
		}
		if(e.getSource()== consultaMedicamento)
		{
			GConsultaMedicamento gConsultaMedicamento = new GConsultaMedicamento();
			dispose();
		}
		if(e.getSource()== consultaProduto)
		{
			GConsultaProduto gConsultaProduto = new GConsultaProduto();
			dispose();
		}
		if(e.getSource()== consultaVeterinario)
		{
			//GConsultaVeterinario gConsultaVeterinario;
			  GConsultaVeterinario gConsultaVeterinario =  new GConsultaVeterinario();
			dispose();
		}
	}

}
