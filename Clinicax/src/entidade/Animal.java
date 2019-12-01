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
	private String codCliente;
	
	Random random = new Random();
	
	
	public Animal(String nome, String raca, String idade,String especie, String codCliente)
	{
		
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.especie = especie;
		this.codCliente = codCliente;
		
	}
	public String getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(String cod) {
		this.codCliente = cod;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		 
		this.id = random.nextInt() ;
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
	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + ", raca=" + raca + ", idade=" + idade + ", especie=" + especie
				+ ", codCliente=" + codCliente + ", random=" + random + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codCliente == null) ? 0 : codCliente.hashCode());
		result = prime * result + ((especie == null) ? 0 : especie.hashCode());
		result = prime * result + id;
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((raca == null) ? 0 : raca.hashCode());
		result = prime * result + ((random == null) ? 0 : random.hashCode());
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
		if (codCliente == null) {
			if (other.codCliente != null)
				return false;
		} else if (!codCliente.equals(other.codCliente))
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
		if (random == null) {
			if (other.random != null)
				return false;
		} else if (!random.equals(other.random))
			return false;
		return true;
	}
	
		
}
