package entidade;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Consulta {
	
	
	private int id;
	private Cliente cliente;
	private LocalDate dataConsulta;
	private double valor;
	private Animal animal;
	
	public Consulta(int id,Cliente cliente, LocalDate dateFormat, double valor, Animal animal ) {
	
		this.id = id;
		this.cliente = cliente;
		this.dataConsulta = dateFormat;
		this.valor = valor;
		this.animal = animal;
		
	}
	public int getId() {
		return id;
	}
	//metodo randomico
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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


	@Override
	public String toString() {
		return "Consulta [id=" + id + ", cliente=" + cliente + ", dateFormat=" + dataConsulta + ", valor=" + valor
				+ ", animal=" + animal + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
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
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
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
