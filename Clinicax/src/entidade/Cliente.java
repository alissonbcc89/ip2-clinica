package entidade;

import java.util.ArrayList;
import java.util.Date;

//Cliente não possui dependente, vericar problema mais tarde

public class Cliente extends Pessoa{
	
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
	public boolean equals(Object obj)
	{
		boolean result = false;
		
		if(obj instanceof Cliente)
		{
			Cliente cliente = (Cliente)obj;
			if(cliente.getCpf() != null && cliente.getNome() != null 
					&& cliente.getNome().equals(this.getNome()))
			{
				result = true;
			}			
			
		}
		return result;
	}



	@Override
	public String toString() {
		return "\n Cliente\n Cpf:" + super.getCpf() + "\n Nome:" +super.getNome() ;
	}
	
}
