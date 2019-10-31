package entidade;

import java.time.LocalDate;
import java.util.Date;

public class Animal {

	private int id;
	private String nome;
	private String raca;
	private String idade;
	private String especie;
	private Cliente cliente;
	private LocalDate dataNascimento;
	
	
	public Animal(String nome, String raca, String idade,String especie, Cliente c, LocalDate d)
	{
		
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.especie = especie;
		this.cliente = c;
		this.dataNascimento = d;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getEspecie() {
		
		return especie;
	}
	public void setEspecie(String especie) {
		
		this.especie = especie;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public void setDataBascimento( LocalDate d )
	{
		this.dataNascimento = d;
	}
	public LocalDate getDataNascimento(){
		return dataNascimento;
	}
	@Override
	public String toString() {
		return "\n Animal\n nome:" + nome + "\n raca:" + raca + "\n idade:" + idade + "\n especie:" + especie + "\n Pertence:"+cliente.getNome();
	}
}
