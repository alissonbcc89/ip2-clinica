package entidade;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Funcionario extends Pessoa{
	
	
	private String ctps;	
	//private ArrayList<Dependente> dependentes =  new ArrayList <Dependente>();

	
	
	//Date dataAdmissao;
	
	private LocalDate dataAdmissao;
	//Date data = c.getTime();

	//dificuldade logica a respeito de como os arraylists recebem o obj do construtor
	public Funcionario(String nome, Endereco end,String cpf,LocalDate dataNascimento, String ctps,LocalDate dataAdmissao) {	
		
		super(nome,end,cpf,dataNascimento);		
		this.ctps = ctps;		
		this.dataAdmissao = dataAdmissao;
		
	}
	
	public String getCtps() 
	{
		return ctps;
	}

	public void setCtps(String ctps) 
	{
		this.ctps = ctps;
	}	

	

	public LocalDate getDataAdmisao() {
		return dataAdmissao;
	}

	public void setDataAdmisao() {
		LocalDate agora =  LocalDate.now();
		this.dataAdmissao = agora;
		
	
	}

	@Override
	public String toString() {
		return  String.format("Funcionario: ctps=" + this.getCtps() + "\nNome=" + this.getNome());
	}
	
	
}
