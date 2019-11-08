package entidade;

import java.time.LocalDate;

public class ProdutoReal extends Produto{

	private String descricao;
	
	public ProdutoReal(int cod, String nome, int qnt, double valorVenda, double valorCompra, LocalDate dataValidade,String desc)
	{
		super(cod,nome,qnt,valorVenda,valorCompra, dataValidade);
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
		ProdutoReal other = (ProdutoReal) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProdutoReal [descricao=" + descricao + "]";
	}
	
		
}