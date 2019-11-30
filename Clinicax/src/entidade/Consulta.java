package entidade;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Consulta {
	
	
	private int id;
	private String cpf;
	private LocalDate dataConsulta;
	private double valor;
	private Animal animal;
	Random random = new Random();
	
	public Consulta(int id, LocalDate dateFormat, double valor, Animal animal,String cpf) {
	
		this.id = id;
		//this.cliente = cliente;
		this.dataConsulta = dateFormat;
		this.valor = valor;
		this.animal = animal;
		this.cpf = cpf;
		
	}
	public int getId() {
		
		
		return id;
	}
	//metodo randomico
	public void setId() {
		
		
		this.id = random.nextInt();
	}
	
		public LocalDate getDateFormat() {

		return dataConsulta;
	}

	public void setDateFormat(LocalDate dateFormat) {
		this.dataConsulta = dateFormat;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	public Animal getAnimal() {
		return animal;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
	


	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Consulta [id=" + id + ", dateFormat=" + dataConsulta + ", valor=" + valor
				+ ", animal=" + animal + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
		result = prime * result + ((dataConsulta == null) ? 0 : dataConsulta.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Consulta other = (Consulta) obj;
		if (animal == null) {
			if (other.animal != null)
				return false;
		} else if (!animal.equals(other.animal))
			return false;
		if (dataConsulta == null) {
			if (other.dataConsulta != null)
				return false;
		} else if (!dataConsulta.equals(other.dataConsulta))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
	
	

}
