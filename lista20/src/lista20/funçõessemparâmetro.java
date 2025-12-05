package lista20;

import java.util.Scanner;

public class funçõessemparâmetro {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	}
		   // 1 – Repetindo uma saudação
		    public static void repetirBomDia() {
		        System.out.println("\n1 – Repetindo uma saudação:");
		        for (int i = 1; i <= 5; i++) {
		            System.out.println("Bom dia!");
		        }
		    }

		    // 2 – Desenhando um retângulo
		    public static void desenharRetangulo() {
		        System.out.println("\n2 – Desenhando um retângulo:");
		        for (int i = 1; i <= 3; i++) {
		            System.out.println("*****");
		        }
		    }

		    // 3 – Imprimindo múltiplos de 5
		    public static void multiplosDe5() {
		        System.out.println("\n3 – Imprimindo múltiplos de 5:");
		        for (int i = 5; i <= 25; i += 5) {
		            System.out.println(i);
		        }
		    }

		    // 4 – Exibindo uma contagem crescente
		    public static void contagemCrescente() {
		        System.out.println("\n4 – Exibindo uma contagem crescente:");
		        for (int i = 1; i <= 8; i++) {
		            System.out.println(i);
		        }
		        System.out.println("Pronto!");
		    }

		    // 5 – Mostrando os meses do ano
		    public static void mesesDoAno() {
		        System.out.println("\n5 – Mostrando os meses do ano:");
		        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
		        for (String mes : meses) {
		            System.out.println(mes);
		        }

	}

}
