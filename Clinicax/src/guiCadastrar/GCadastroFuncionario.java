package guiCadastrar;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entidade.Endereco;
import entidade.Funcionario;
import repositorio.ControlRepFuncionario;

public class GCadastroFuncionario extends JFrame implements ActionListener{

	
	JTextField nome, cpf, rua,bairro,cep,estado,numero,pais,nomea,idade,raca,especie;
	
	JButton adicionar, cancelar, voltar;
	
	Funcionario funcionario;
	Endereco endereco;
	
	ControlRepFuncionario controlRepFuncionario = new ControlRepFuncionario();
	
	GCadastro gCadastro;
	
	
	public GCadastroFuncionario()
	{
		super("Cadastro Funcionario");
		
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel ("Nome"));
		nome =  new JTextField(30);
		container.add(nome);
		String teste = (nome.getText());
//		funcionario.setNome(teste);
		
		
		
		container.add(new JLabel ("CPF:"));
		cpf = new JTextField(16);
		container.add(cpf);
		String aux = cpf.getText();
	//	funcionario.setCpf(aux);
		
		container.add(new JLabel("Rua"));
		rua = new JTextField(20);
		container.add(rua);
		String r = rua.getText();
		//endereco.setRua(r);
		
		container.add(new JLabel("Bairro"));
		bairro = new JTextField(20);
		container.add(bairro);
		String b = bairro.getText();
	//	endereco.setBairro(b);
		
		container.add(new JLabel("Cep"));
		cep = new JTextField(16);
		container.add(cep);
		String c = cep.getText();
	//	endereco.setCep(c);
		
		container.add(new JLabel("Estado"));
		estado = new JTextField(20);
		container.add(estado);
		String e = estado.getText();
	//	endereco.setEstado(e);
		
		container.add(new JLabel("Numero"));
		numero = new JTextField(20);
		container.add(numero);
		String n = numero.getText();
	//	endereco.setNumero(n);
		
		container.add(new JLabel("País"));
		pais = new JTextField(20);
		container.add(pais);
		String p = pais.getText();
	//	endereco.setPais(p);
		
		
		
		adicionar = new JButton("OK");
		container.add(adicionar);
		adicionar.addActionListener(this);
		
		cancelar = new JButton("Cancelar");
		container.add(cancelar);
		cancelar.addActionListener(this);
		
		voltar = new JButton("Voltar");
		container.add(voltar);
		voltar.addActionListener(this);
		
		 setSize(425,100);
		 setVisible(true);		


		

		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == adicionar)
		{
			endereco = new Endereco(rua.getText(),bairro.getText(),cep.getText(),estado.getText(),numero.getText(),pais.getText(),cpf.getText());
			funcionario = new Funcionario(nome.getText(),endereco,cpf.getText(), null, getTitle(), null);
			controlRepFuncionario.adicionar(funcionario);
			
			gCadastro = new GCadastro();
			dispose();
		}
		
		if(e.getSource() == cancelar)
		{
			
		}
		if(e.getSource() == voltar)
		{	
			gCadastro = new GCadastro();
			dispose();
		}
	}

}
