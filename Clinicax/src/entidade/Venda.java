package entidade;

//import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;




//PS. AVALIAR TODA CLASSE VENDA
//PS.UMA DAS ULTIMAS CLASSES DE NEGOCIOS, VAMOS FINALIZAR O QUANTO ANTES
//Nessa classe devo por o atributos e métodos necessarios.
//Provavelmente ela recebe um array de atributos.


public class Venda {
	
	Random random;
	private Date dataVenda;
	private int cod;
	
	ArrayList <ProdutoReal> prodReal = new ArrayList<ProdutoReal>();
	ArrayList<Medicamento> medicamento = new ArrayList<Medicamento>();
	ArrayList<Consulta> consulta = new ArrayList<Consulta>();
	Cliente cliente;

	
	public Venda()
	{
		
	}

	public Venda(Date dataVenda,int cod,ArrayList<ProdutoReal> prodReal, ArrayList<Medicamento>med,ArrayList<Consulta> con,Cliente c)
	{
		this.dataVenda = dataVenda; 
		this.cod = cod;
		this.prodReal = prodReal;
		this.medicamento = med;
		this.consulta = con; 
		this.cliente = c;
		
	}
	
	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public int getCod() {
		return cod;
	}
	public void setCod() 
	{	
		this.cod = random.nextInt();
	}
	public ArrayList<ProdutoReal> getProdReal() {
		return prodReal;
	}
	public void setProdReal(ArrayList<ProdutoReal> prodReal) {
		this.prodReal = prodReal;
	}
	public ArrayList<Medicamento> getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(ArrayList<Medicamento> medicamento) {
		this.medicamento = medicamento;
	}
	public ArrayList<Consulta> getConsulta() {
		return consulta;
	}
	public void setConsulta(ArrayList<Consulta> consulta) {
		this.consulta = consulta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
}



