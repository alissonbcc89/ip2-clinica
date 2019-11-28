package entidade;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

//Cliente não possui dependente, vericar problema mais tarde

public class Cliente extends Pessoa {
	
	private String telefone;
	
	
	public Cliente(String nome,Endereco end,String cpf, String t,LocalDate dataNascimento) 
	{
		super(nome,end,cpf,dataNascimento);
		// TODO Auto-generated constructor stub	
		this.telefone = t;
	}
	
	


	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}
	
	public int getTipo()
	{
		return Pessoa.Cliente;
	}



	@Override
	public String toString() {
		return "\n Cliente\n Cpf:" + super.getCpf() + "\n Nome:" +super.getNome() ;
	}
	
	
	
}
