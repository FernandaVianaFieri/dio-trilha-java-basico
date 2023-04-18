package exercicioControleFluxo;

import java.util.Scanner;

public class exerciocioMesesUm {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* criar um programa que mostre os meses do ano de acorco com o número digitado... E para os meses de janeiro, julho e dezembro, exibir "Mês de férias*
		 ... Se fot digitado um númro que não corresponde a nenum mês, pedir para o usuário digitar um número válido **** Essa não é a melhor maneira de escrever esse código, 
		 é apenas para ilustração   */

		
				
		Scanner scan = new Scanner (System.in);	
		System.out.println("Digite um número de 1 a 12 para saber o mês correspondente");
		 
		
		int mes = 0;
		 mes= scan.nextInt();
		 
		
		if (mes == 1) {
			System.out.println("janeiro *** mês de férias");
		}
		
		 if(mes == 2){
			 System.out.println("fevereiro");
		 }
				
			
		 if(mes == 3){
			 System.out.println("março");
		 }
		 
		 
		 if(mes == 3){
			 System.out.println("abril");
		 }
		 
		 
		 if(mes == 4){
			 System.out.println("maio");
		 }
		 
		 
		 if(mes == 5){
			 System.out.println("junho");
		 }
		 
		 if(mes == 6){
			 System.out.println("julho *** mês de férias");
		 }
		 
		 if(mes == 7){
			 System.out.println("agosto");
		 }
		 
		 if(mes == 8){
			 System.out.println("setembro");
		 }
		 
		 if(mes == 9){
			 System.out.println("outubro");
		 }
		 
		 if(mes == 10){
			
			 System.out.println("novembro");
		 }
		 
		 if(mes == 11){
			 System.out.println("dezembro *** mês de férias");
		 }
		 
		
		 else{
			 System.out.println("Digite um mês válido ");
		
		 }
		 
		 		 
		 
	}
		}
	
		
		 
	

	


