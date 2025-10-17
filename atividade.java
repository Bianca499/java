package Primeiro;

import java.util.Scanner;

public class atividade {

	
	
		public static void main(String[] args) {
			  repetirSaudacao();
		        linha();
		        desenharRetangulo();
		        linha();
		        multiplosDeCinco();
		        linha();
		        contagemCrescente();
		        linha();
		        mostrarMeses();
		        linha();

		        // ======== Funções com parâmetro ========
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Digite um número para verificar se é divisível por 5:");
		        int numero = sc.nextInt();
		        verificarDivisibilidade(numero);
		        linha();

		        sc.nextLine(); // limpa buffer
		        System.out.println("Digite seu nome:");
		        String nome = sc.nextLine();
		        despedida(nome);
		        linha();

		        System.out.println("Digite o primeiro nome:");
		        String primeiro = sc.nextLine();
		        System.out.println("Digite o sobrenome:");
		        String sobrenome = sc.nextLine();
		        unirNomes(primeiro, sobrenome);
		        linha();

		        System.out.println("Digite um número para verificar se é maior que 100:");
		        int valor = sc.nextInt();
		        verificarMaiorQue100(valor);
		        linha();

		        System.out.println("Digite a velocidade:");
		        int velocidade = sc.nextInt();
		        classificarVelocidade(velocidade);
		        linha();

		        sc.nextLine(); // limpa buffer
		        System.out.println("Digite o dia da semana:");
		        String dia = sc.nextLine();
		        saudacaoDia(dia);
		        linha();

		        System.out.println("Digite a quantidade em estoque:");
		        int quantidade = sc.nextInt();
		        verificarEstoque(quantidade);

		        sc.close();
		    }

		    // ============================
		    // FUNÇÕES SEM PARÂMETRO
		    // ============================

		    public static void repetirSaudacao() {
		        for (int i = 0; i < 5; i++) {
		            System.out.println("Bom dia!");
		        }
		    }

		    public static void linha() {
		        System.out.println("----------------------------");
		    }

		    public static void desenharRetangulo() {
		        for (int i = 0; i < 3; i++) {
		            System.out.println("*****");
		        }
		    }

		    public static void multiplosDeCinco() {
		        for (int i = 5; i <= 25; i += 5) {
		            System.out.println(i);
		        }
		    }

		    public static void contagemCrescente() {
		        for (int i = 1; i <= 8; i++) {
		            System.out.println(i);
		        }
		        System.out.println("Pronto!");
		    }

		    public static void mostrarMeses() {
		        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
		        for (String mes : meses) {
		            System.out.println(mes);
		        }
		    }

		    // ============================
		    // FUNÇÕES COM PARÂMETRO
		    // ============================

		    public static void verificarDivisibilidade(int numero) {
		        if (numero % 5 == 0) {
		            System.out.println(numero + " é divisível por 5.");
		        } else {
		            System.out.println(numero + " não é divisível por 5.");
		        }
		    }

		    public static void despedida(String nome) {
		        System.out.println("Até logo, " + nome + "!");
		    }

		    public static void unirNomes(String primeiroNome, String sobrenome) {
		        System.out.println("Nome completo: " + primeiroNome + " " + sobrenome);
		    }

		    public static void verificarMaiorQue100(int numero) {
		        if (numero > 100) {
		            System.out.println(numero + " é maior que 100.");
		        } else {
		            System.out.println(numero + " não é maior que 100.");
		        }
		    }

		    public static void classificarVelocidade(int velocidade) {
		        if (velocidade < 40) {
		            System.out.println("Lenta");
		        } else if (velocidade <= 80) {
		            System.out.println("Normal");
		        } else {
		            System.out.println("Rápida");
		        }
		    }

		    public static void saudacaoDia(String dia) {
		        System.out.println("Tenha uma ótima " + dia + "!");
		    }

		    public static void verificarEstoque(int quantidade) {
		        if (quantidade >= 10) {
		            System.out.println("Estoque suficiente");
		        } else if (quantidade >= 5) {
		            System.out.println("Estoque baixo");
		        } else {
		            System.out.println("Estoque crítico");
		        }
		    }
		
	
			



			
	}

}
