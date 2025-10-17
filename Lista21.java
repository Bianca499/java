package Primeiro;

import java.util.Scanner;

public class Lista21 {
		
		public static void main(String[] args) {

	        System.out.println("=== Teste das Funções ===\n");

	        System.out.println("1 - Somar: " + somar(5, 3));
	        System.out.println("2 - Subtrair: " + subtrair(10, 4));
	        System.out.println("3 - Multiplicar: " + multiplicar(6, 7));
	        System.out.println("4 - Dividir: " + dividir(10, 0));
	        System.out.println("5 - Média: " + calcularMedia(7.5, 8.0));
	        System.out.println("6 - Verificar aprovação: " + verificarAprovacao(5.5, 8.0));
	        System.out.println("7 - Maior número: " + maiorNumero(9, 9));
	        System.out.println("8 - Celsius → Fahrenheit: " + converterCelsiusParaFahrenheit(25));
	        System.out.println("9 - Área do retângulo: " + calcularAreaRetangulo(5, 3));
	        System.out.println("10 - Gerar mensagem: " + gerarMensagem("Bianca"));
	        System.out.println("11 - Juntar nomes: " + juntarNomes("Bianca", "Soares"));
	        System.out.println("12 - Avaliar idade: " + avaliarIdade(17));
	    }

	    // 1 - Soma
	    public static int somar(int a, int b) {
	        return a + b;
	    }

	    // 2 - Subtração
	    public static int subtrair(int a, int b) {
	        return a - b;
	    }

	    // 3 - Multiplicação
	    public static int multiplicar(int a, int b) {
	        return a * b;
	    }

	    // 4 - Divisão com verificação
	    public static String dividir(int a, int b) {
	        if (b == 0) {
	            return "Não é possível dividir por 0";
	        }
	        return "Resultado: " + (a / (double) b);
	    }

	    // 5 - Média
	    public static double calcularMedia(double n1, double n2) {
	        return (n1 + n2) / 2;
	    }

	    // 6 - Verificar aprovação
	    public static String verificarAprovacao(double n1, double n2) {
	        double media = calcularMedia(n1, n2);
	        if (media >= 6) {
	            return "Aprovado";
	        } else {
	            return "Reprovado";
	        }
	    }

	    // 7 - Maior número
	    public static String maiorNumero(int a, int b) {
	        if (a > b) {
	            return a + " é o maior número";
	        } else if (b > a) {
	            return b + " é o maior número";
	        } else {
	            return "Eles são iguais";
	        }
	    }

	    // 8 - Converter Celsius para Fahrenheit
	    public static double converterCelsiusParaFahrenheit(double celsius) {
	        return (celsius * 9 / 5) + 32;
	    }

	    // 9 - Calcular área do retângulo
	    public static double calcularAreaRetangulo(double base, double altura) {
	        return base * altura;
	    }

	    // 10 - Gerar mensagem
	    public static String gerarMensagem(String nome) {
	        return "Olá, " + nome + "!";
	    }

	    // 11 - Juntar nomes
	    public static String juntarNomes(String nome1, String nome2) {
	        return nome1 + " " + nome2;
	    }

	    // 12 - Avaliar idade
	    public static String avaliarIdade(int idade) {
	        if (idade < 12) {
	            return "Criança";
	        } else if (idade < 18) {
	            return "Adolescente";
	        } else if (idade < 60) {
	            return "Adulto";
	        } else {
	            return "Idoso";
	        }
			
		
}
}