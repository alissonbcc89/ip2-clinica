package guiCadastrar;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entidade.Medicamento;
import main.GMain;
import repositorio.ControlRepMedicamento;

public class GCadastroMedicamento extends JFrame implements ActionListener {

	//int cod, String nome, int qnt, double vv, double vc, LocalDate dataValidade, String lote,LocalDate validade
	
	Medicamento medicamento;
	
	int cod,qnt;
	
	double valorVenda,valor ;
	
	LocalDate agora;
	
	ControlRepMedicamento controlRepMedicamento = new ControlRepMedicamento();
	
	JTextField codigo,nome,quantidade,valorCompra,localValidade,lote;
	
	JButton ok,voltar;
	
	public GCadastroMedicamento()
	{
		super("Cadastro medicamento");
		
	Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel ("Nome"));
		nome =  new JTextField(30);
		container.add(nome);
		String teste = (nome.getText());
		//medicamento.setNome(teste);
		
		container.add(new JLabel("Digite o codigo do medicamento "));
		codigo = new JTextField(30);
		container.add(codigo);
		int cod = Integer.parseInt(quantidade.getText());
		
		container.add(new JLabel("Quantidade"));
		quantidade  =  new JTextField(30);
		container.add(quantidade);
		int qtn = Integer.parseInt(quantidade.getText());
	//	medicamento.setQnt(qtn);
		
		
		
		container.add(new JLabel("Valor Compra"));
		valorCompra =  new JTextField(30);
		container.add(valorCompra);
		double valor = Double.parseDouble(valorCompra.getText());
	//	medicamento.setValorCompra(valor);
	
		double valorVenda = ((valor * 0.3) + valor);
		
	//	medicamento.setValorVenda(valorVenda);
		
		container.add(new JLabel("Data Validade:"));
		localValidade = new JTextField(8);
		container.add(localValidade);
		LocalDate agora = LocalDate.parse(localValidade.getText());
		//medicamento.setDataValidade(agora);
		
		container.add(new JLabel("Lote"));
		lote = new JTextField(20);
		container.add(lote);
		String l = lote.getText(); 
	//	medicamento.setLote(l);
		
		ok =
				new JButton("OK");
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
			//int cod, String nome, int qnt, double vv, double vc, LocalDate dataValidade, String lote,LocalDate validade
			
			medicamento = new  Medicamento(cod,nome.getText(),qnt,valor,valorVenda,agora, lote.getText());
			
			controlRepMedicamento.adicionar(medicamento);
			
			GMain gMain = new GMain();
			
			dispose();
		}
		if(e.getSource() == voltar)
		{
			GMain gMain = new GMain();
			dispose();
		}
		
	}

}
