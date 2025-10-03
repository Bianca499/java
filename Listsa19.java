package Primeiro;

import java.util.Scanner;

public class Listsa19 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        classificarValor(-10);
	        separador();

	        maioridade(17);
	        separador();

	        boasVindas("Fernanda");
	        separador();

	        tabuada(7);
	        separador();

	        juntarPalavras("Java", "Legal");
	        separador();

	        verificarParOuImpar(13);
	        separador();

	        classificarTemperatura(22);
	        separador();

	        saudacaoPorTurno("tarde");
	        separador();

	        calcularMedia(7.5, 8.0, 6.5);
	        separador();

	        verificarAprovacao(6.8);
	        separador();

	        sc.close();
	    }

	    // 1 – Classificando valores
	    public static void classificarValor(int numero) {
	        if (numero > 0) {
	            System.out.println(numero + " é positivo");
	        } else if (numero < 0) {
	            System.out.println(numero + " é negativo");
	        } else {
	            System.out.println("O número é zero");
	        }
	    }

	    // 2 – Maioridade
	    public static void maioridade(int idade) {
	        if (idade >= 18) {
	            System.out.println("Maior de idade");
	        } else {
	            System.out.println("Menor de idade");
	        }
	    }

	    // 3 – Boas Vindas
	    public static void boasVindas(String nome) {
	        System.out.println("Bem-vindo(a), " + nome + "!");
	    }

	    // 4 – Tabuada
	    public static void tabuada(int numero) {
	        System.out.println("Tabuada de " + numero + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	    }

	    // 5 – Juntando palavras
	    public static void juntarPalavras(String p1, String p2) {
	        System.out.println("Palavras concatenadas: " + p1 + " " + p2);
	    }

	    // 6 – Verificando par ou ímpar
	    public static void verificarParOuImpar(int numero) {
	        if (numero % 2 == 0) {
	            System.out.println(numero + " é par");
	        } else {
	            System.out.println(numero + " é ímpar");
	        }
	    }

	    // 7 – Classificando temperatura
	    public static void classificarTemperatura(int temp) {
	        if (temp < 15) {
	            System.out.println("Frio");
	        } else if (temp <= 25) {
	            System.out.println("Agradável");
	        } else {
	            System.out.println("Quente");
	        }
	    }

	    // 8 – Saudação por turno
	    public static void saudacaoPorTurno(String turno) {
	        switch (turno.toLowerCase()) {
	            case "manhã":
	                System.out.println("Bom dia!");
	                break;
	            case "tarde":
	                System.out.println("Boa tarde!");
	                break;
	            case "noite":
	                System.out.println("Boa noite!");
	                break;
	            default:
	                System.out.println("Turno inválido");
	        }
	    }

	    // 9 – Calculando média
	    public static void calcularMedia(double n1, double n2, double n3) {
	        double media = (n1 + n2 + n3) / 3;
	        System.out.println("Média = " + media);
	    }

	    // 10 – Verificando aprovação
	    public static void verificarAprovacao(double notaFinal) {
	        if (notaFinal >= 7) {
	            System.out.println("Aprovado");
	        } else if (notaFinal >= 5) {
	            System.out.println("Em recuperação");
	        } else {
	            System.out.println("Reprovado");
	        }
	    }

	    // Função separadora (extra)
	    public static void separador() {
	        System.out.println("--------------------");
	    }
	



}


