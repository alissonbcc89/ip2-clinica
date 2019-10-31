package main;

import java.text.DateFormat;
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
		
	        
	        RepositorioAnimal animais = new RepositorioAnimal() ;
	        RepFuncionario funcionarios = new RepFuncionario();
	        RepositorioConsulta consultas = new RepositorioConsulta();
	        RepositorioDependente dependentes = new RepositorioDependente();
	        RepositorioMedicamento medicamentos = new RepositorioMedicamento();
	        RepositorioProduto produtos = new RepositorioProduto();
	        RepositorioVenda vendas = new RepositorioVenda();
	        Rveterinario veterinarios = new Rveterinario();
	        RepositorioEndereco enderecos = new RepositorioEndereco();
	        RepositorioCliente clientes  = new RepositorioCliente();
	        
	        
	        Endereco end = new Endereco("nova jerusalém","pau amarelo","50090690","PE","34","Brasil");
	        enderecos.adicionar(end);
	        
	        //String cod, String nome, int qnt, double vc, double vv, String lote
	        Medicamento medicamento = new Medicamento("666","Atenalou",29,1.59,1.59*0.3+1.59,"A1569");
	        medicamentos.adicionar(medicamento);
	        
	      
	        
	        
	        
	        //String nome,Endereco end,String cpf, ArrayList<Animal> animal, String t
	        Cliente cliente = new Cliente("Alisson",end,"cpf","999999999");
			clientes.adicionar(cliente);
			
			//clientes.buscarCpf("cpf");
			System.out.print(clientes.pesquisarCliente("cpf"));
			clientes.pesquisarCliente("cpf");
			Dependente dependente = new Dependente("Filho","0008734532",cliente);
	        Dependente dep1 = new Dependente("Esposa","00094876424",cliente);
	        
	        dependentes.adicionar(dep1);
			dependentes.adicionar(dependente);
			
						
			//String nome, String raca, String idade,String esp, Cliente c
			Animal animal = new Animal("Bob","Vira-lata","2","Cachorro",cliente);
			
			animais.adicionar(animal);
			
			//Dependente dep2 = new Dependente("Filho","0008734532",veterinario);
	        //Dependente dep3 = new Dependente("Filho","00094876424",vet);
			
			//ArrayList<Dependente>testeDep;
			//testeDep.add(dep2);
			//testeDep.add(dep3);

			
			//String nome, Endereco enderco,String cpf, String crmv
			//Veterinario veterinario = new Veterinario ("Doutor",end,"cpfver","crmv1");
			
			Veterinario veterinario = new Veterinario ("Doutor",end,"cpfver","crmv1");
			
			veterinarios.adicionar(veterinario);
			//veterinarios.remover(veterinario);
			
		System.out.println(	"Veterinario Busca 1!\n" +veterinarios.buscar(veterinario));
			
//		System.out.println(animais.pesquisar(animal));
		
		
		//Veterinario veterinario = new Veterinario ("Doutor",end,"cpfver","crmv1");
		
		Veterinario vete = new Veterinario("",null,"cpfver","crmvtester");
		
		 veterinarios.alterara(vete);

		 
		 System.out.println("Veterinario Busca Atual 2!\n" +veterinarios.buscar(veterinario));
		 
		 System.out.println("\nVeterinario Busca Atual 3!\n" +veterinarios.buscar(veterinario));
		 
		 
		 
 
		 
		 
		
		
		
		//animais.excluir(animal);
		//System.out.println(animais.pesquisar(animal));
			
				
	}
			
			
}					
	    
	    
			
	



