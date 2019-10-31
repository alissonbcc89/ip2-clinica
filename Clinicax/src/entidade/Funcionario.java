package entidade;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Funcionario extends Pessoa{
	
	
	private String ctps;	
	//private ArrayList<Dependente> dependentes =  new ArrayList <Dependente>();

	
	
	Date dataAdmissao;
	private DateFormat dataAdmisao;
	//Date data = c.getTime();

	//dificuldade logica a respeito de como os arraylists recebem o obj do construtor
	public Funcionario(String nome, Endereco end,String cpf,Date dataNascimento, String ctps,Date dataAdmissao) {	
		
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

	

	public DateFormat getDataAdmisao() {
		return dataAdmisao;
	}

	public void setDataAdmisao(DateFormat dataAdmisao) {
		Calendar c = Calendar.getInstance();
		DateFormat dataAux = dataAdmisao.getDateTimeInstance();
		
		
		this.dataAdmisao = dataAux;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public DateFormat getFormataData() {
		Calendar c = Calendar.getInstance();
		 Date data = c.getTime();
		return dataAdmisao;
	}


	public void setFormataData(DateFormat formataData) {
		this.dataAdmisao = DateFormat.getDateTimeInstance();// a chamada do retorno deve ser 
	}


	@Override
	public String toString() {
		return  String.format("Funcionario: ctps=" + this.getCtps() + "\nNome=" + this.getNome());
	}
	
	
}
