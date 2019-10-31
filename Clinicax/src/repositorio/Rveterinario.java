package repositorio;
import java.util.ArrayList;
import entidade.Veterinario;


public class Rveterinario implements IVeterinario{
	
	
	//A dúvida trata se devo por o array de dependentes na classe funcionarioReal e Veterinario
	//Ou se faço um repositorio apenas para ela.


	
		
		Veterinario veterinario;
		ArrayList<Veterinario> veterinarios = new ArrayList<Veterinario>();
		
		
		

		@Override
		public void adicionar(Veterinario vet) 
		{
			// TODO Auto-generated method stub
			
			
					veterinarios.add(vet);
					System.out.println("\nInserido!");
		}

		@Override
		public void remover(Veterinario vet) {
			// TODO Auto-generated method stub
			for(int i = 0; i< veterinarios.size();i++)
			{
				if(vet.getCrmv() == veterinarios.get(i).getCrmv())
				{
					veterinarios.remove(veterinarios.get(i));
					System.out.println("\n Excluido");
				}
				
			}
			
		}

		//string cpf
		@Override
		public Veterinario buscar(Veterinario vet) {
			// TODO Auto-generated method stub
			for(int i = 0; i< veterinarios.size(); i++)
			{
				if(vet.getCrmv().equals (veterinarios.get(i).getCrmv())
				{
					return veterinarios.get(i);
				}
			}
			
			return null;
		}

		//Método funcionando, devendo ser finalizada sua implementação.
		@Override
		public void alterar(Veterinario vet) {
			
		//	Veterinario veteer =this.buscar(vet);
			
			for(int i = 0; i<veterinarios.size(); i++)
			{
				
				if(veterinarios.get(i).getCpf().equals(vet.getCpf()) )
				{//o array era pra receber o argumento do metodo e modificalo no repositorio.
					
					//if( vet.getNome()!= null)
					veterinarios.set(i,vet);
			
			
			// TODO Auto-generated method stub
			//Método não funciona, provavelmente o equals não deve esta implementado na classe veterinario.
			
			//	for(int i = 0; i < veterinarios.size(); i++)
		   			//{	//Ps. Estudar qual deve ser a chave primaria para a tabela veterinario.
			//			if(veterinarios.get(i).getCrmv().equals(vet.getCrmv()) || veterinarios.get(i).getCpf().equals(vet.getCpf()))
		   			//if(veterinarios.get(i).getCpf().equals(vet.getCpf())  || vet.getCpf() != null)
							//{
							//if(vet.getCrmv()!= null || vet.getEndereco() == null || vet.getNome()== null)
											//{
											//veterinarios.get(i).setCrmv(vet.getCrmv());
											//System.out.println("Modificado apenas crmv para: "+ veterinarios.get(i).getCrmv() );
											//}
										//if(vet.getCrmv()!= null || vet.getEndereco() != null || vet.getNome()== null)
											//{
											//veterinarios.get(i).setCrmv(vet.getCrmv());
											//veterinarios.get(i).setEndereco(vet.getEndereco());
											//System.out.println("Inserido os dois");
											//									}
										//if(vet.getCrmv()!= null || vet.getEndereco() != null || vet.getNome()!= null)
											//{
											//										veterinarios.get(i).setCrmv(vet.getCrmv());
											//veterinarios.get(i).setEndereco(vet.getEndereco());
											//		veterinarios.get(i).setNome(vet.getNome());
									//		System.out.println("Inserido os tres");
								//		}
							//}
						
				//			{
							
					/*veterinarios.get(i).setNome(vet.getNome());
					veterinarios.get(i).setEndereco(vet.getEndereco());
					veterinarios.get(i).setNome(vet.getNome());*/
					//		}
					
			
			}
				
		}
		}
		
		public void alterara(Veterinario vet)
		{
			  
		 for(int i = 0; i< veterinarios.size() ; i++ )
		 {
			 if(veterinarios.get(i).getCpf().equals(vet.getCpf()))
			 {
				 
			 veterinarios.set(i, vet);
			 }
		 }
				//for(Veterinario v:veterinarios)
				//{
				//for(int i = 0; i<veterinarios.size(); i++)
				//{
				
					//if(veterinarios.get(i).getCpf().equals(vet.getCpf()))
					//{
						//veterinarios.get().set(v,vet);
					//	System.out.println("Alterado");
				//	}
				//}
		}
	} //chave fecha a classe não pode existir chave depois dessa.




