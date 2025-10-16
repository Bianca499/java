package Primeiro;

import java.util.Scanner;

public class lista05 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  
		//1-Classificação de idade
		 System.out.print("Digite a idade: ");
	        int idade = sc.nextInt();

	        if (idade < 12) {
	            System.out.println("Criança");
	        } else if (idade < 17) {
	            System.out.println("Adolescente");
	        } else if (idade < 59) {
	            System.out.println("Adulto");
	        } else {
	            System.out.println("Idoso");
	        }
	        System.out.println("-------------------------------");
	        //2Avaliação de temperatura
	        System.out.print("Digite a temperatura em °C: ");
	        double temp = sc.nextDouble();

	        if (temp < 10) {
	            System.out.println("Muito Frio");
	        } else if (temp < 20) {
	            System.out.println("Frio");
	        } else if (temp < 30) {
	            System.out.println("Agradável");
	        } else {
	            System.out.println("Muito Quente");
	        }
	        System.out.println("-------------------------------");
	        //3-Sistema de Notas Escolares
	        System.out.print("Digite a nota: ");
	        double nota = sc.nextDouble();

	        if (nota > 90) {
	            System.out.println("A");
	        } else if (nota > 80) {
	            System.out.println("B");
	        } else if (nota > 70) {
	            System.out.println("C");
	        } else if (nota > 60) {
	            System.out.println("D");
	        } else {
	            System.out.println("F");
	        }
	        System.out.println("-------------------------------");
	        // ===== 4 - Verificação de Senha =====
	        sc.nextLine(); // limpa o buffer
	        System.out.print("Digite a senha: ");
	        String senha = sc.nextLine();

	        if (senha.equals("admin")) {
	            System.out.println("Acesso permitido!");
	        } else {
	            System.out.println("Acesso negado!");
	        }

	        System.out.println("-------------------------------");

	        // ===== 5 - Comparação de Nomes =====
	        System.out.print("Digite o primeiro nome: ");
	        String nome1 = sc.nextLine();

	        System.out.print("Digite o segundo nome: ");
	        String nome2 = sc.nextLine();

	        if (nome1.equalsIgnoreCase(nome2)) {
	            System.out.println("Os nomes são iguais.");
	        } else {
	            System.out.println("Os nomes são diferentes.");
	        }

	        System.out.println("-------------------------------");

	        // ===== 6 - Jogo da Cor Favorita =====
	        System.out.print("Digite sua cor favorita: ");
	        String cor = sc.nextLine().toLowerCase();

	        switch (cor) {
	            case "azul":
	                System.out.println("Boa escolha!");
	                break;
	            case "vermelho":
	                System.out.println("Cor vibrante!");
	                break;
	            case "verde":
	                System.out.println("Cor da natureza!");
	                break;
	            default:
	                System.out.println("Cor não cadastrada.");
	        }

	        System.out.println("-------------------------------");

	        // ===== 7 - Verificação de Vogal =====
	        System.out.print("Digite uma letra: ");
	        String letra = sc.nextLine().toLowerCase();

	        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
	            System.out.println("É uma vogal.");
	        } else {
	            System.out.println("Não é vogal.");
	        }

	        sc.close();
	    }
	}
		
	}

}
