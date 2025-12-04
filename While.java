package atividade04;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU DE EXERCÍCIOS =====");
            System.out.println("1 - Contador de 10 a 30");
            System.out.println("2 - Soma de 3 números digitados");
            System.out.println("3 - Multiplicação de 5 números digitados");
            System.out.println("4 - Contar até o número informado");
            System.out.println("5 - Soma de 1 a 5");
            System.out.println("6 - Tabuada");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    int num = 10;
                    while (num <= 30) {
                        System.out.println(num);
                        num++;
                    }
                    break;

                case 2:
                    int contador = 1;
                    int soma = 0;

                    while (contador <= 3) {
                        System.out.print("Digite um número inteiro: ");
                        int numero = sc.nextInt();
                        soma += numero;
                        contador++;
                    }
                    System.out.println("A soma total é: " + soma);
                    break;

                case 3:
                    int cont = 1;
                    int multiplicacao = 1;

                    while (cont <= 5) {
                        System.out.print("Digite um número inteiro: ");
                        int numero = sc.nextInt();
                        multiplicacao *= numero;
                        cont++;
                    }
                    System.out.println("Resultado da multiplicação: " + multiplicacao);
                    break;

                case 4:
                    System.out.print("Digite um número inteiro: ");
                    int limite = sc.nextInt();
                    int inicio = 1;

                    while (inicio <= limite) {
                        System.out.println(inicio);
                        inicio++;
                    }
                    break;

                case 5:
                    int i = 1;
                    int somaTotal = 0;

                    while (i <= 5) {
                        somaTotal += i;
                        i++;
                    }
                    System.out.println("A soma de 1 a 5 é: " + somaTotal);
                    break;

                case 6:
                    System.out.print("Digite um número para a tabuada: ");
                    int numeroTabuada = sc.nextInt();
                    int x = 1;

                    while (x <= 10) {
                        System.out.println(numeroTabuada + " x " + x + " = " + (numeroTabuada * x));
                        x++;
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }


	}


