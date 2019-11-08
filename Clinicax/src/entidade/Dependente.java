package entidade;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Dependente {
	
	private String cpf;
	private String nome;
	private Endereco endereco;
	private Pessoa pessoa;
	private LocalDate dataNascimento;
	
	public Dependente(String nome, String cpf,Pessoa pessoa, Endereco endereco) 
	{
		this.nome = nome;
		this.cpf = cpf;
		this.pessoa = pessoa; 
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//seta data de nascimento restringindo o cadastro caso o dependente seja maior de 18, acho que com o betwwen ou na mão kk
	public void setDatanascimento(LocalDate dataNascimento)
	{
		LocalDate agora = LocalDate.now();
		int ano = dataNascimento.getYear();
		int aux = agora.getYear();
		int cont = ano - aux;
		if(cont < 18)
		{
			this.dataNascimento = dataNascimento;
		}
		//chamada para caso seja maior de dezoito não pode adicionar.
	}
	
	@Override
	public String toString() {
		return "Dependente [cpf=" + cpf + ", nome=" + nome + "]";
	}			
}
