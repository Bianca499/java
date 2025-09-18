package Primeiro;

import java.applet.Applet;
import java.io.Console;
import java.util.List;
import java.util.Scanner;

public class Lista12 {

	public static void main(String[] args) {
		// 1 - Contador
	
		System.out.println(" 1 - Contador de 10 a 30 ");
		int  i = 10;
		do {
			System.out.println(i);
			i++;
		}while(i<=30);
		
	
	

		// 2 - Adivinhação de número
	
		System.out.println(" 2 - Adivinhação de número");
		int numero = 0;
		while (numero != 5) {
		System.out.println("Digite um número: ");
		}
		System.out.println("Você acertou! O número é 5.");

	
	// 3
		System.out.println(" Verificação de peso da mala ");
		int peso = 0;
		do {
		  System.out.println("Digite o peso da mala (kg): ");
		  if (peso > 23) {
		  }
		} while (peso > 23);
		System.out.println("Peso dentro do limite. Boa viagem!");

		
		// 4 - Páginas lidas na semana
		
		System.out.println(" - Páginas lidas na semana");
		int totalPaginas = 0;
		System.out.println("List i = 1; i <= 7; i++");
		  System.out.println("Quantas páginas você leu no dia ${i}? ");
		  System.out.println(" paginas");
		
		System.out.println("Você leu um total de ${totalPaginas} páginas na semana.");

	
		// 5 - Testar código de acesso
	
		System.out.println( " 5 - Código de acesso ");
		int codigoCorreto = 789;
		int codigo = 0;
		do {
		  System.out.println("Digite o código de acesso (3 dígitos): ");
		  if (codigo != codigoCorreto) {
		 System.out.println("Código incorreto! Tente novamente.");
		  }
		} while(codigo != codigoCorreto);
		System.out.println("Acesso liberado!");

	
		// 6 - Verificar nível de combustível

		System.out.println(" 6 - Verificar combustível ");
		int combustivel = 0;
		do {
		  System.out.println("Digite o nível de combustível (litros): ");
		  if (combustivel <= 10) {
		    System.out.println("Combustível baixo! Abasteça.");
		  }
		} while (combustivel <= 10);
		System.out.println("Combustível suficiente para a viagem!");

		
		// 7 - Contar quilômetros percorridos
		
		System.out.println( "Quilômetros percorridos");
		int totalKm = 0;
		int trecho = 0;
		do {
		 System.out.println("Digite a distância percorrida no trecho (0 ou negativo para encerrar): ");
		  if (trecho > 0) {
		    totalKm += trecho;
		  }
		} while (trecho > 0);
		System.out.println("Distância total percorrida: ${totalKm} km.");
		
	}
		}


