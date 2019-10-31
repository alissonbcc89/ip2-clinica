package entidade;

import java.text.DateFormat;
import java.util.Date;

public class Consulta {
	
	
	private int id;
	private Cliente cliente;
	private Date dataConsulta;
	private double valor;
	private Animal animal;
	
	public Consulta(int id,Cliente cliente, Date dateFormat, double valor, Animal animal ) {
	
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
	public Date getDateFormat() {

		return dataConsulta;
	}

	public void setDateFormat(Date dateFormat) {
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

}
