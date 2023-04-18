package exercicioControleFluxo;

import java.util.Scanner;

public class mesesDoAno {

	public static void main(String[] args) {

	
		while (true) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 12 para saber o mês correspondente");

		int mes = 0;
		mes = scan.nextInt();
		
		if (mes==1||mes==7 || mes==12 ) {
			System.out.println("Mês de férias");
		}

		switch (mes) {

		case 1:
			System.out.println("janeiro");
			break;

		case 2:
			System.out.println("fevereiro");
			break;

		case 3:
			System.out.println("março");
			break;

		case 4:
			System.out.println("abril");
			break;

		case 5:
			System.out.println("maio");
			break;

		case 6:
			System.out.println("juno");
			break;

		case 7:
			System.out.println("julhoo");
			break;

		case 8:
			System.out.println("agosto");
			break;

		case 9:
			System.out.println("setembro");
			break;

		case 10:
			System.out.println("outubro");
			break;

		case 11:
			System.out.println("novembro");
			break;

		case 12:
			System.out.println("dezembro");
			break;

		default:
			System.out.println("Digite um número válido: ");
			
			

		}
	}
		
		
	}
}
