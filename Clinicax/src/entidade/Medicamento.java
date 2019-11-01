package entidade;


import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Medicamento extends Produto {

	private String lote;
	private LocalDate dataValidade;

	public Medicamento(String cod, String nome, int qnt, double vc, double vv, String lote, LocalDate d) {
		super(cod, nome, qnt, vc, vv);
		this.lote = lote;
		this.dataValidade = d;  
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

}
