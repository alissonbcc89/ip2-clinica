 package entidade;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Veterinario extends Pessoa{
	
	private Date dataAdmissao;
	private String crmv;	
		
	public Veterinario(String nome, Endereco enderco,String cpf,Date dataNascimento, String crmv,Date dataAdmissao ) 
	{
		super(nome, enderco,cpf,dataNascimento);
		this.crmv = crmv;
		this.dataAdmissao = dataAdmissao;
		
	}

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	@Override
	public String toString() {
		return "Veterinario \ncrmv:" + crmv + "\nCpf:" + super.getCpf() +"\nNome:" +super.getNome();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((crmv == null) ? 0 : crmv.hashCode());
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
		Veterinario other = (Veterinario) obj;
		if (crmv == null) {
			if (other.crmv != null)
				return false;
		} else if (!crmv.equals(other.crmv))
			return false;
		return true;
	}
	
}
