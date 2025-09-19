package Primeiro;

import java.util.Scanner;

public class lista14 {

	public static void main(String[] args) {
		for(int cont =1; cont <=10; cont++) {
			System.out.println(cont);
		}
		System.out.println("-----------------------------");
		Scanner scanner= new Scanner(System.in); //jsva.util
		
		System.out.println("Ate que o numero você que eu conte?");
		int numero = scanner.nextInt();
		for(int vez =1; vez <=numero; vez++ /*+1*/) {
			System.out.println(vez);
		}

	}

}
