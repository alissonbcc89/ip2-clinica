package entidade;

import java.time.LocalDate;
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
	private LocalDate dataVenda;
	private int cod;
	
	ArrayList <ProdutoReal> prodReal = new ArrayList<ProdutoReal>();
	ArrayList<Medicamento> medicamento = new ArrayList<Medicamento>();
	ArrayList<Consulta> consulta = new ArrayList<Consulta>();
	Cliente cliente;
	private double valor;

	
	public Venda(Cliente c, double valor)
	{
		
	}

	public Venda(LocalDate dataVenda,int cod,ArrayList<ProdutoReal> prodReal, ArrayList<Medicamento>med,ArrayList<Consulta> con,Cliente c, double v)
	{
		this.dataVenda = dataVenda; 
		this.cod = cod;
		this.prodReal = prodReal;
		this.medicamento = med;
		this.consulta = con; 
		this.cliente = c;
		this.valor = v;
		
	}
	
	public LocalDate getDataVenda() {
		return dataVenda;
	}
//Relembra data atual da data
	public void setDataVenda() {
		LocalDate agora = LocalDate.now();
		this.dataVenda = agora;
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
	
	public double valorTotal()
	{
		double atualizando1 = 0;
		double atualizando2 = 0;
		double atualizando3 = 0;
	
		
		for(int i = 0; i < consulta.size() ; i++ )
		{
			if( consulta.get(i).getValor() != 0 )
			{
				atualizando1 =+ consulta.get(i).getValor();
				
			}
		}
		for(int j = 0; j < medicamento.size(); j++ )
		{
			if(medicamento.get(j).getValorVenda() != 0)
				{
					atualizando2 =+ medicamento.get(j).getValorVenda();
				}
		}
		
		for(int k = 0; k < prodReal.size(); k++ )
		{
			if(prodReal.get(k).getValorVenda() != 0)
			{
				atualizando3 =+ prodReal.get(k).getValorVenda();
			}
		}
		
		  valor = atualizando1 + atualizando2 + atualizando3; 
		
		 return valor;
	
	}
	
	public double total()
	{
		return this.valor;
	}
	
}


