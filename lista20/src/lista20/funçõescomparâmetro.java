package lista20;

import java.util.Scanner;

public class funçõescomparâmetro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
	//Funções com Parâmetro
    // ===============================

    // 1 – Verificando divisibilidade
    public static void verificarDivisivelPor5(int numero) {
        System.out.println("\n1 – Verificando divisibilidade:");
        if (numero % 5 == 0) {
            System.out.println(numero + " é divisível por 5");
        } else {
            System.out.println(numero + " não é divisível por 5");
        }
    }

    // 2 – Mensagem de despedida
    public static void mensagemDespedida(String nome) {
        System.out.println("\n2 – Mensagem de despedida:");
        System.out.println("Até logo, " + nome + "!");
    }

    // 3 – Unindo nomes
    public static void unirNomes(String primeiroNome, String sobrenome) {
        System.out.println("\n3 – Unindo nomes:");
        System.out.println("Nome completo: " + primeiroNome + " " + sobrenome);
    }

    // 4 – Verificando maior que 100
    public static void maiorQue100(int numero) {
        System.out.println("\n4 – Verificando maior que 100:");
        if (numero > 100) {
            System.out.println(numero + " é maior que 100");
        } else {
            System.out.println(numero + " não é maior que 100");
        }
    }

    // 5 – Classificando velocidade
    public static void classificarVelocidade(int velocidade) {
        System.out.println("\n5 – Classificando velocidade:");
        if (velocidade < 40) {
            System.out.println("Lenta");
        } else if (velocidade <= 80) {
            System.out.println("Normal");
        } else {
            System.out.println("Rápida");
        }
    }

    // 6 – Saudação por dia da semana
    public static void saudacaoDiaSemana(String dia) {
        System.out.println("\n6 – Saudação por dia da semana:");
        System.out.println("Tenha uma ótima " + dia + "!");
    }

    // 7 – Verificando situação de estoque
    public static void situacaoEstoque(int quantidade) {
        System.out.println("\n7 – Verificando situação de estoque:");
        if (quantidade >= 10) {
            System.out.println("Estoque suficiente");
        } else if (quantidade >= 5) {
            System.out.println("Estoque baixo");
        } else {
            System.out.println("Estoque crítico");
        }
    }
}
	


