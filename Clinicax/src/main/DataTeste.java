package main;

import java.util.ArrayList;
import java.util.Calendar;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import entidade.Funcionario;


public class DataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//construtor builde, cria o bojeto sem que vove perceba
		 	
		//Clacula quanto tempo foi passado desde que o brasil ganhou a copa de 2002 ate agora
		LocalDateTime brasilPenta  =  LocalDateTime.of(2002,7,16,18,30,0);
		LocalDateTime agora  =  LocalDateTime.now();
		System.out.printf("Data e hora atual: " + agora);
		
		
		long r = brasilPenta.until(agora,ChronoUnit.YEARS );
		
		System.out.printf("\nTempo que faz que o Brasil foi campeão" + r);
		
		
		
		      /*  Calendar c = Calendar.getInstance();
		        c.set(2013, Calendar.FEBRUARY, 28);
		        Date data = c.getTime();
		        System.out.println("Data atual sem formatação: "+data);
		         
		        //Formata a data
		        DateFormat formataData = DateFormat.getDateInstance();
		        System.out.println("Data atual com formatação: "+ formataData.format(data));
		         
		        //Formata Hora
		DateFormat hora = DateFormat.getTimeInstance();
		        System.out.println("Hora formatada: "+hora.format(data));
		 
		        //Formata Data e Hora
		        DateFormat dtHora = DateFormat.getDateTimeInstance();
		        System.out.println(dtHora.format(data));
		 */
		    }
		 
		}

	


