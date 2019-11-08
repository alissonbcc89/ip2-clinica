package main;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

import entidade.Animal;
import entidade.Cliente;
import entidade.Dependente;
import entidade.Endereco;
import entidade.Funcionario;
import entidade.Medicamento;
import entidade.Pessoa;
import entidade.Produto;
import entidade.ProdutoReal;
import entidade.Veterinario;
import repositorio.RepositorioCliente;
import repositorio.RepositorioConsulta;
import repositorio.RepositorioDependente;
import repositorio.RepositorioEndereco;
import repositorio.RepositorioMedicamento;
import repositorio.RepositorioProduto;
import repositorio.RepositorioVenda;
import repositorio.RepositorioVeterinario;
import repositorio.Rveterinario;
import repositorio.ControlRepAnimal;
import repositorio.ControlRepCliente;
import repositorio.ControlRepConsulta;
import repositorio.ControlRepDependente;
import repositorio.ControlRepEndereco;
import repositorio.ControlRepFuncionario;
import repositorio.ControlRepMedicamento;
import repositorio.ControlRepProduto;
import repositorio.ControlRepVeterinario;
import repositorio.RepFuncionario;
import repositorio.RepositorioAnimal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String rua, String bairro, String cep, String estado, String numero, String pais
		
		 //Calendar c = Calendar.getInstance();
	       // c.set(2013, Calendar.FEBRUARY, 28);
		
		
		
		//Repositorios onde sera manipulado os dados
		
		//o sistema ta pedindo que os repositorios sejam inicializado como null
		
	        
	        ControlRepAnimal animais = new ControlRepAnimal() ;
	       ControlRepFuncionario funcionarios = new ControlRepFuncionario();
	        ControlRepConsulta consultas = new ControlRepConsulta();
	       ControlRepDependente dependentes = new ControlRepDependente();
	        ControlRepMedicamento medicamentos = new ControlRepMedicamento();
	        ControlRepProduto produtos = new ControlRepProduto();
	       // RepositorioVenda vendas = new RepositorioVenda();
	       ControlRepVeterinario veterinarios = new ControlRepVeterinario();
	        ControlRepEndereco enderecos = new ControlRepEndereco();
	        ControlRepCliente clientes  = new ControlRepCliente();
	        
	        //String rua, String bairro, String cep, String estado, String numero, String pais
	       Endereco end = new Endereco("nova jerusalem","Pau - Amarelo","50090690","PE","34","Brasil");
	      //  enderecos.adicionar(end);
	       // end.setBairro("Pau - Amarelo");
	        //end.setRua("nova jerusalem");
	        //end.setCep("50090690");
	        //end.setEstado("PE");
	        //end.setNumero("34");
	        //end.setPais("Brasil");
	        
	        enderecos.adicionar(end);
	        
	        //(String cod, String nome, int qnt, double vc, double vv, String lote, LocalDate d)
	        Medicamento medicamento = new Medicamento("666","Atenalou",29,1.59,1.59*0.3+1.59,"A1569", null);
	        medicamentos.adicionar(medicamento);
	        
	      
	        
	        
	        //(String nome,Endereco end,String cpf, String t,LocalDate dataNascimento)
	        
	        Cliente cliente = new Cliente("Alisson",end,"cpf","999999999", null);
			clientes.adicionar(cliente);
			
			//clientes.buscarCpf("cpf");
			System.out.print(clientes.buscarCpf("cpf"));
			clientes.buscarCpf("cpf");
			Dependente dependente = new Dependente("Filho","0008734532",cliente, end);
	        Dependente dep1 = new Dependente("Esposa","00094876424",cliente, end);
	        
	        dependentes.adicionar(dep1);
			dependentes.adicionar(dependente);
			
						
			//String nome, String raca, String idade,String esp, Cliente c
			Animal animal = new Animal("Bob","Vira-lata","2","Cachorro",cliente, null);
			
			animais.adicionar(animal);
			
			//Dependente dep2 = new Dependente("Filho","0008734532",veterinario);
	        //Dependente dep3 = new Dependente("Filho","00094876424",vet);
			
			//ArrayList<Dependente>testeDep;
			//testeDep.add(dep2);
			//testeDep.add(dep3);

			
			//String nome, Endereco enderco,String cpf, String crmv
			//Veterinario veterinario = new Veterinario ("Doutor",end,"cpfver","crmv1");
			LocalDate agora = LocalDate.now();  
			
			Veterinario veterinario = new Veterinario ("Doutor",end,"cpfver",null, "crmv1", agora);
			
			veterinarios.adicionar(veterinario);
			//veterinarios.remover(veterinario);
			
		System.out.println(	"Veterinario Busca 1!\n" +veterinarios.buscar(veterinario));
			
//		System.out.println(animais.pesquisar(animal));
		
		
		//Veterinario veterinario = new Veterinario ("Doutor",end,"cpfver","crmv1");
		
		Veterinario vete = new Veterinario("alguem",null,"cpfver",null, "crmvtester", null);
		
		 veterinarios.alterar(vete);

		 
		 System.out.println("Veterinario Busca Atual 2!\n" +veterinarios.buscar(veterinario));
		 
		 System.out.println("\nVeterinario Busca Atual 3!\n" +veterinarios.buscar(veterinario));
		 
		 
		 
 
		 
		 
		
		
		
		//animais.excluir(animal);
		//System.out.println(animais.pesquisar(animal));
			
				
	}
			
			
}					
	    
	    
			
	



