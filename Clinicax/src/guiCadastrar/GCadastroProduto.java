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
	
	//int cod, String nome, int qnt, double valorVenda, double valorCompra, LocalDate dataValidade,String desc
	
	ProdutoReal produtoReal;
	
	ControlRepProduto controlRepProduto;
	
	JTextField codigo,nome,quantidade,valorCompra,validade,descricao;
	
	JButton ok, voltar;
	
	public GCadastroProduto()
	{
		super("Cadastrando Produto");
		
	Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel ("Nome"));
		nome =  new JTextField(30);
		container.add(nome);
		String teste = (nome.getText());
		produtoReal.setNome(teste);
		
		
		container.add(new JLabel ("Quantidade:"));
		quantidade =  new JTextField(30);
		container.add(quantidade);
		int q = Integer.parseInt(quantidade.getText());
		produtoReal.setQnt(q);
		
		
		container.add(new JLabel ("Valor Compra:"));
		valorCompra =  new JTextField(30);
		container.add(valorCompra);
		double vc = Double.parseDouble(valorCompra.getText());
		produtoReal.setValorCompra(vc);
		
		container.add(new JLabel ("Descricao:"));
		descricao =  new JTextField(100);
		container.add(descricao);
		String d = descricao.getText();
		produtoReal.setDescricao(d);
		
		
		container.add(new JLabel("Data Validade:"));
		validade = new JTextField(8);
		container.add(validade);
		LocalDate agora = LocalDate.parse(validade.getText());
		produtoReal.setDataValidade(agora);
		
		double venda = produtoReal.getValorCompra() * 0.30 + produtoReal.getValorCompra();
		
		produtoReal.setValorVenda(venda);
		

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
			controlRepProduto.adicionar(produtoReal);
			
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
