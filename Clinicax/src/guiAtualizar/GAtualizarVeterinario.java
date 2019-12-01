package guiAtualizar;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entidade.Endereco;
import entidade.Veterinario;
import guiCadastrar.GC;
import repositorio.ControlRepVeterinario;

public class GAtualizarVeterinario extends JFrame implements ActionListener {

	GC gC;
	
	ControlRepVeterinario controlRepVeterinario;
	
	//String nome, Endereco enderco,String cpf,LocalDate dataNascimento, String crmv,LocalDate dataAdmissao
	Veterinario veterinario;
	
	//String rua, String bairro, String cep, String estado, String numero, String pais, String codigo
	Endereco endereco;
	
	JTextField nome,cpf,dataNascimento,crmv,dataAdmissao, rua,bairro,cep,estado,numero,pais;
	
	JButton ok,voltar;
	
	LocalDate certa,cert;
	
	public GCadastroVeterinario()
	{
		super("Cadastro Veterinario");
		
		Container container = getContentPane();
		
		container.setLayout(new GridLayout(23,2));
		
		container.add(new JLabel ("Nome"));
		nome =  new JTextField(30);
		container.add(nome);
//		String teste = (nome.getText());
//		veterinario.setNome(teste);
		
		container.add(new JLabel ("CPF:"));
		cpf = new JTextField(16);
		container.add(cpf);
	//	String aux = cpf.getText();
//		veterinario.setCpf(aux);
		
		container.add(new JLabel("Data nascimento"));
		dataNascimento = new JTextField(8);
		container.add(dataNascimento);
		//LocalDate certa = LocalDate.parse(dataNascimento.getText());
	//	veterinario.setDataNascimento(certa);
		
		container.add(new JLabel("CRMV"));
		crmv = new JTextField(16);
		container.add(crmv);
		//String c = crmv.getText();
	//	veterinario.setCrmv(c);
		
		
		//LocalDate cert = LocalDate.now();
		//veterinario.setDataAdmissao(cert);
		
		//rua,bairro,cep,estado,numero,pais;
		
		container.add(new JLabel("Rua:"));
		rua = new JTextField(16);
		container.add(rua);
		//String r = rua.getText();
	//	endereco.setRua(r);
		
		container.add(new JLabel("Bairro:"));
		bairro = new JTextField(16);
		container.add(bairro);
		//String b = bairro.getText();
	//	endereco.setBairro(b);
		
		container.add(new JLabel("Cep:"));
		cep = new JTextField(16);
		container.add(cep);
		//String ce = cep.getText();
	//	endereco.setCep(ce);
		
		container.add(new JLabel("Estado:"));
		estado = new JTextField(16);
		container.add(estado);
		//String este = estado.getText();
	//	endereco.setEstado(este);
		
		container.add(new JLabel("Numero:"));
		numero = new JTextField(5);
		container.add(numero);
		//String num = numero.getText();
	//	endereco.setNumero(num);
		
		container.add(new JLabel("Pais:"));
		pais = new JTextField(16);
		container.add(pais);
		//String pa = pais.getText();
	//	endereco.setPais(pa);
		
		//veterinario.setEndereco(endereco);
		
		
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
		if(e.getSource() == ok)
		{	
			LocalDate certa = LocalDate.parse(dataNascimento.getText());
			LocalDate cert = LocalDate.now();
			
			//String rua, String bairro, String cep, String estado, String numero, String pais, String codigo
			endereco = new Endereco(rua.getText(),bairro.getText(),cep.getText(),estado.getText(),numero.getText(),pais.getText(),cpf.getText());
			
			//String nome, Endereco enderco,String cpf,LocalDate dataNascimento, String crmv,LocalDate dataAdmissao
			veterinario = new Veterinario(nome.getText(),endereco,cpf.getText(),certa,crmv.getText(),cert);
			
			controlRepVeterinario.alterar(veterinario);
			GC gC = new GC();
			dispose();
		}
		if(e.getSource()== voltar)
		{
			GC gc = new GC();
			dispose();
		}
	}

}
