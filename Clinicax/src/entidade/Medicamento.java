package entidade;


import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Medicamento extends Produto {

	private String lote;
	private LocalDate dataValidade;
	
//int cod, String nome, int qnt, double vv, double vc, LocalDate dataValidade
	
	public Medicamento(int cod, String nome, int qnt, double vv, double vc, LocalDate dataValidade, String lote,LocalDate validade) {
		// TODO Auto-generated constructor stub
		super(cod, nome, qnt, vv, vc, dataValidade);
		this.lote =lote;
		this.dataValidade = validade;
		
	}
	  
	

	/*public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;

	}*/
	

	public String getLote() {
		return lote;
	}


	public void setLote(String lote) {
		this.lote = lote;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public String toString() {
		return "Medicamento [lote=" + lote + ", dataValidade=" + dataValidade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataValidade == null) ? 0 : dataValidade.hashCode());
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
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
		Medicamento other = (Medicamento) obj;
		if (dataValidade == null) {
			if (other.dataValidade != null)
				return false;
		} else if (!dataValidade.equals(other.dataValidade))
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		return true;
	}
}
