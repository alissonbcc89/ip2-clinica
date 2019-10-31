package entidade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


//Pessoa e todas as outras clases devem ser revisadas para atribuição de retorno necessario a cada caso.
public abstract class Pessoa {
	
	private String nome;
	private Endereco endereco;
	private String cpf;
	private LocalDate dataNascimento;
	
	public Pessoa(String nome, Endereco endereco,String cpf, LocalDate dataNascimento ) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		
	
	}
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getCpf()
	{
		return cpf;
	}
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa \nnome=" + nome + "\ncpf=" + cpf + "]";
	}
	
	
}
