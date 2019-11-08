package entidade;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Animal {
	
	
	private int id;
	private String nome;
	private String raca;
	private String idade;
	private String especie;
	private Cliente cliente;
	private LocalDate dataNascimento;
	Random random = new Random();
	
	
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
	public int getId() {
		return id;
	}
	public void setId() {
		 
		this.id = random.nextInt() ;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
	
		this.dataNascimento = dataNascimento;
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
		return "\n Animal\n Codigo:"+id +"\n nome:" + nome + "\n raca:" + raca + "\n idade:" + idade + "\n especie:" + especie + "\n Pertence:"+cliente.getNome();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((especie == null) ? 0 : especie.hashCode());
		result = prime * result + id;
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((raca == null) ? 0 : raca.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (especie == null) {
			if (other.especie != null)
				return false;
		} else if (!especie.equals(other.especie))
			return false;
		if (id != other.id)
			return false;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (raca == null) {
			if (other.raca != null)
				return false;
		} else if (!raca.equals(other.raca))
			return false;
		return true;
	}
	
	
}
