package guiRemover;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GRemover extends JFrame implements ActionListener {

	GRemoverAnimal gRemoverAnimal;
	GRemoverVeterinario gRemoverVeterinario;
	GRemoverProduto gRemoverProduto;
	GRemoverMedicamento gRemoverMedicamento;
	GRemoverFuncionario gRemoverFuncionario;
	GRemoverEndereco gRemoverEndereco;
	GRemoverDependente gRemoverDependente;
	GRemoverConsulta gRemoverConsulta;
	GRemoverCliente gRemoverCliente;
	
	
	
	JButton exclusaoAnimal,exclusaoCliente,exclusaoConsulta,exclusaoDependente,exclusaoEndereco,exclusaoFuncionario,exclusaoMedicamento,exclusaoProduto,exclusaoVeterinario;
	
	public GRemover()
	{
		super("Escolher qual remover");
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(23,2));
		
		exclusaoAnimal = new JButton("Excluir Animal");
		container.add(exclusaoAnimal);
		exclusaoAnimal.addActionListener(this);
		
		exclusaoCliente = new JButton("Excluir Cliente");
		container.add(exclusaoCliente);
		exclusaoCliente.addActionListener(this);
		
		exclusaoConsulta = new JButton("Excluir Consulta");
		container.add(exclusaoConsulta);
		exclusaoConsulta.addActionListener(this);
		
		exclusaoDependente = new JButton("Excluir Dependente");
		container.add(exclusaoDependente);
		exclusaoDependente.addActionListener(this);
		
		exclusaoEndereco = new JButton("Excluir Endereco");
		container.add(exclusaoEndereco);
		exclusaoEndereco.addActionListener(this);
		
		exclusaoFuncionario = new JButton("Excluir Funcionario");
		container.add(exclusaoFuncionario);
		exclusaoFuncionario.addActionListener(this);
		
		exclusaoMedicamento = new JButton("Excluir Medicamento");
		container.add(exclusaoMedicamento);
		exclusaoMedicamento.addActionListener(this);
		
		exclusaoProduto = new JButton("Excluir Produto");
		container.add(exclusaoProduto);
		exclusaoProduto.addActionListener(this);
		
		exclusaoVeterinario = new JButton("Excluir Veterinario");
		container.add(exclusaoVeterinario);
		exclusaoVeterinario.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == exclusaoAnimal)
		{
			GRemoverAnimal gRemoverAnimal =  new GRemoverAnimal();
			dispose();
		}
		if(e.getSource() == exclusaoCliente)
		{
			GRemoverCliente gRemoverCliente = new GRemoverCliente();
			dispose();
		} 
		if(e.getSource() == exclusaoConsulta)
		{
			GRemoverConsulta gRemoverConsulta = new GRemoverConsulta();
			dispose();
		}
		if(e.getSource() == exclusaoDependente)
		{
			GRemoverDependente gRemoverDependente = new GRemoverDependente();
			dispose();
		}
		if(e.getSource() == exclusaoEndereco)
		{
			GRemoverEndereco gRemoverEndereco = new GRemoverEndereco();
			dispose();
		}
		if(e.getSource() == exclusaoFuncionario)
		{
			GRemoverFuncionario gRemoverFuncionario = new GRemoverFuncionario();
			dispose();
		}
		if(e.getSource() == exclusaoMedicamento)
		{
			GRemoverMedicamento gRemoverMedicamento = new GRemoverMedicamento();
		}
		if(e.getSource() == exclusaoProduto)
		{
			GRemoverProduto gRemoverProduto = new GRemoverProduto();
			dispose();
		}
		if(e.getSource() == exclusaoVeterinario)
		{
			GRemoverVeterinario gRemoverVeterinario = new GRemoverVeterinario();
			dispose();
		}
	}
	
	
	

	
	
}
