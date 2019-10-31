package entidade;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Medicamento extends Produto {

	private String lote;
	private Date dataValidade;

	public Medicamento(String cod, String nome, int qnt, double vc, double vv, String lote, Date d) {
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

}
