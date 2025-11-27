package Primeiro;

import java.util.Scanner;

public class Lista04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*1. Verificar Maioridade*/
        System.out.println("Qual é a sua idade?");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você tem " + idade + " anos e é **maior de idade**");
        } else {
            System.out.println("Você tem " + idade + " anos e é **menor de idade**");
            
            
            /*2.Comparar Dois Números*/
            System.out.println("Digite o primeiro número (Num1):");
            double num1 = scanner.nextDouble();
            System.out.println("Digite o segundo número (Num2):");
            double num2 = scanner.nextDouble();

            if (num1 > num2) {
                System.out.println("**O primeiro número é maior**");
            } else {
                System.out.println("**O segundo número é maior ou eles são iguais**");
                
                /*3 - Aprovação por nota*/
                System.out.println("Digite a nota do aluno:");
                double nota = scanner.nextDouble();

                if (nota > 7.0) {
                    System.out.println("**Aprovado**: sua nota foi " + nota);
                } else {
                    System.out.println("**Reprovado**: sua nota foi " + nota);
                    
                    /*4. Verificar Número Positivo*/
                    System.out.println("Digite um número:");
                    double numero = scanner.nextDouble();

                    if (numero > 0) {
                        System.out.println("**O número é positivo**");
                    } else {
                        System.out.println("**O número é negativo ou zero**");
                        
                    /*5. Cálculo de Frete*/
                        System.out.println("Digite a distância de entrega em km:");
                        double distancia = scanner.nextDouble();
                        double frete;

                        if (distancia <= 50) {
                            frete = 10.00;
                        } else {
                            frete = distancia * 0.50;
                        }

                        // Usamos String.format para garantir duas casas decimais
                        System.out.println("Valor do frete: R$ " + String.format("%.2f", frete));
                        
                    /*6. O Número é 10?*/
                        System.out.println("Digite um número:");
                        int numero10 = scanner.nextInt();

                        if (numero10 == 10) {
                            System.out.println("**O número é 10**");
                        } else {
                            System.out.println("**O número não é 10**");
                        }
                    /*7. Desconto para Associados*/
                        System.out.println("Você é associado da loja? (sim/não):");
                        String resposta = scanner.next();

                        if (resposta.equalsIgnoreCase("sim")) {
                            System.out.println("**Você tem desconto**");
                        } else {
                            System.out.println("**Você não tem desconto**");
                            
                     /*8.Cálculo de bônus por horas extras*/
                            System.out.println("Digite o número de horas extras trabalhadas:");
                            int horasExtras = scanner.nextInt();
                            double bonus;

                            if (horasExtras < 10) {
                                bonus = horasExtras * 20.00;  // R$ 20.00 por hora
                            } else {
                                bonus = horasExtras * 15.00;  // R$ 15.00 por hora
                            }

                            // Usamos String.format para garantir duas casas decimais
                            System.out.println("Bônus por hora extra R$ " + String.format("%.2f", bonus));

                            scanner.close(); // Sempre feche o Scanner quando terminar
                        }
                    }
                } }
        }
	}
}
        
                        

                        
                        
                        
                        
                        
                

            
        
	


