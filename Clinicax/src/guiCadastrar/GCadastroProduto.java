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

import entidade.ProdutoReal;
import main.GMain;
import repositorio.ControlRepProduto;

public class GCadastroProduto extends JFrame implements ActionListener{
	
	GC gC;
	
	//int cod, String nome, int qnt, double valorVenda, double valorCompra, LocalDate dataValidade,String desc
	
	ProdutoReal produtoReal;
	
	ControlRepProduto controlRepProduto;
	
	double valorC,valorVenda;
	
	int cod, q;
	
	LocalDate agora;
	
	JTextField codigo,nome,quantidade,valorCompra,validade,descricao;
	
	JButton ok, voltar;
	
	public GCadastroProduto()
	{
		super("Cadastrando Produto");
		
	Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel("Digite o codigo do produto"));
		codigo = new JTextField(30); 
		container.add(codigo);
		//int cod = Integer.parseInt(codigo.getText());
		
		container.add(new JLabel ("Nome"));
		nome =  new JTextField(30);
		container.add(nome);
		//String teste = (nome.getText());
		//produtoReal.setNome(teste);
		
		
		container.add(new JLabel ("Quantidade:"));
		quantidade =  new JTextField(30);
		container.add(quantidade);
		//int q = Integer.parseInt(quantidade.getText());
	//	produtoReal.setQnt(q);
		
		
		container.add(new JLabel ("Valor Compra:"));
		valorCompra =  new JTextField(30);
		container.add(valorCompra);
		//double vc = Double.parseDouble(valorCompra.getText());
	//	produtoReal.setValorCompra(vc);
		
		container.add(new JLabel ("Descricao:"));
		descricao =  new JTextField(100);
		container.add(descricao);
		//String d = descricao.getText();
	//	produtoReal.setDescricao(d);
		
		
		container.add(new JLabel("Data Validade:"));
		validade = new JTextField(8);
		container.add(validade);
		//LocalDate agora = LocalDate.parse(validade.getText());
	//	produtoReal.setDataValidade(agora);
		
		//double venda = produtoReal.getValorCompra() * 0.30 + produtoReal.getValorCompra();
		
		//produtoReal.setValorVenda(venda);
		

		ok = new JButton("OK");
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
		if(e.getSource()== ok)
		{
			int cod = Integer.parseInt(codigo.getText());
			int q = Integer.parseInt(quantidade.getText());
			double vc = Double.parseDouble(valorCompra.getText());
			LocalDate agora = LocalDate.parse(validade.getText());
			double venda = produtoReal.getValorCompra() * 0.30 + produtoReal.getValorCompra();
			
			//int cod, String nome, int qnt, double valorVenda, double valorCompra, LocalDate dataValidade,String desc
			produtoReal = new ProdutoReal(cod,nome.getText(),q,valorVenda,valorC,agora,descricao.getText());
			
			controlRepProduto.adicionar(produtoReal);
			
			GC gC = new GC();
			
			dispose();
			
			
		}
		
		if(e.getSource() == voltar)
		{
			GC gC = new GC();
			dispose();
		}
		
	}
	
	
	

}
