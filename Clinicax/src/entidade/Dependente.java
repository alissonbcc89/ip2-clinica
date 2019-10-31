package entidade;

import java.text.DateFormat;
import java.util.Date;

public class Dependente {
	
	private String cpf;
	private String nome;
	private Pessoa veterinario;
	private Endereco endereco;
	
	public Dependente(String nome, String cpf,Pessoa pessoa, Endereco endereco) 
	{
		this.nome = nome;
		this.cpf = cpf;
		this.veterinario = pessoa; 
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
	@Override
	public String toString() {
		return "Dependente [cpf=" + cpf + ", nome=" + nome + "]";
	}			
}
