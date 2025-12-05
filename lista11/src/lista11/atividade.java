package lista11;

import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int escolha;

        do {
            // Exibe o Menu Principal
            System.out.println("\n=============================================");
            System.out.println("            MENU DE EXERCÍCIOS (do-while)    ");
            System.out.println("=============================================");
            System.out.println("1 - Contador (1 a 31, pulando de 2 em 2)");
            System.out.println("2 - Adivinhação de Número (diferente de 100)");
            System.out.println("3 - Menu Interativo (Continuar/Sair)");
            System.out.println("4 - Classificação de Números (5x)");
            System.out.println("5 - Temperatura do Forno (abaixo de 200°C)");
            System.out.println("6 - Verificação de Bateria (acima de 20%)");
            System.out.println("7 - Deseja fazer uma conta? (Soma)");
            System.out.println("0 - Sair do Programa");
            System.out.println("---------------------------------------------");
            System.out.print("Escolha o número do exercício que deseja rodar: ");

            // Garante que a entrada seja um número
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa a entrada inválida
                System.out.print("Escolha o número do exercício que deseja rodar: ");
            }
            escolha = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha

            System.out.println("\n--- Executando Exercício " + escolha + " ---");

            switch (escolha) {
                case 1:
                    exercicio1();
                    break;
                case 2:
                    exercicio2(scanner);
                    break;
                case 3:
                    exercicio3(scanner);
                    break;
                case 4:
                    exercicio4(scanner);
                    break;
                case 5:
                    exercicio5(scanner);
                    break;
                case 6:
                    exercicio6(scanner);
                    break;
                case 7:
                    exercicio7(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("❌ Opção inválida! Por favor, escolha um número de 0 a 7.");
                    break;
            }

        } while (escolha != 0);

        scanner.close();
    }

    // --- MÉTODOS DOS EXERCÍCIOS ---

    /** 1 - Contador: Mostre a sequência de número de 1 a 31 pulando de 2 em 2 */
    public static void exercicio1() {
        System.out.print("Sequência de números ímpares (1 a 31): ");
        int contador = 1;

        do {
            System.out.print(contador);
            if (contador < 31) {
                System.out.print(", ");
            }
            contador += 2; // Pula de 2 em 2
        } while (contador <= 31);

        System.out.println("\n");
    }

    /** 2 - Adivinhação de número: Peça um número para o usuário, enquanto o número for diferente de 100 continue pedindo */
    public static void exercicio2(Scanner scanner) {
        int numero;
        System.out.println("Tente adivinhar o número secreto (100).");

        do {
            System.out.print("Digite um número: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
                System.out.print("Digite um número: ");
            }
            numero = scanner.nextInt();

            if (numero != 100) {
                System.out.println("Número incorreto! Tente novamente.");
            }

        } while (numero != 100);

        System.out.println("Parabéns! Você acertou o número secreto: 100.\n");
    }

    /** 3 - Menu interativo: 1 - Continuar, 2 - Sair, mostrando o menu novamente*/
    public static void exercicio3(Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n--- Menu de Opções ---");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida. Digite 1 ou 2.");
                scanner.next();
                System.out.print("Escolha uma opção: ");
            }
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu continuar!");
                    break;
                case 2:
                    System.out.println("Encerrando o Menu Interativo...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha 1 ou 2.");
                    break;
            }
        } while (opcao != 2);
        System.out.println();
    }

    /** 4 - Classificação de números: 5 vezes (Tipo A < 10, Tipo B < 20, senão Fora) */
    public static void exercicio4(Scanner scanner) {
        int i = 1; // Contador de iterações
        int numero;

        System.out.println("Classificação de números (5 iterações):");

        do {
            System.out.printf("Digite o %dº número: ", i);
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
                System.out.printf("Digite o %dº número: ", i);
            }
            numero = scanner.nextInt();

            String classificacao;

            if (numero < 10) {
                classificacao = "**Tipo A**";
            } else if (numero < 20) {
                classificacao = "**Tipo B**";
            } else {
                classificacao = "**Fora da Categoria**";
            }

            System.out.printf("O número %d é classificado como: %s\n", numero, classificacao);
            i++;
        } while (i <= 5); // Repete 5 vezes
        System.out.println();
    }

    /** 5 - Temperatura do forno: Continua pedindo até estar abaixo de 200°C (faixa segura) */
    public static void exercicio5(Scanner scanner) {
        int temperatura;

        System.out.println("--- Monitoramento de Temperatura do Forno ---");

        do {
            System.out.print("Digite a temperatura atual (°C): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite a temperatura em números inteiros.");
                scanner.next();
                System.out.print("Digite a temperatura atual (°C): ");
            }
            temperatura = scanner.nextInt();

            if (temperatura > 200) {
                System.out.println("⚠️ **ALERTA**: Temperatura muito alta! Está acima de 200°C. Faça nova leitura.");
            }

        } while (temperatura > 200);

        System.out.printf("✅ Temperatura segura! (%d°C).\n\n", temperatura);
    }

    /** 6 - Verificação de bateria: Continua pedindo até estar acima de 20% */
    public static void exercicio6(Scanner scanner) {
        int nivelBateria;

        System.out.println("--- Verificação de Nível de Bateria ---");

        do {
            System.out.print("Digite o nível atual da bateria (%): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite o nível em números inteiros (%).");
                scanner.next();
                System.out.print("Digite o nível atual da bateria (%): ");
            }
            nivelBateria = scanner.nextInt();

            if (nivelBateria <= 20) {
                System.out.println("🔋 **BATERIA BAIXA**: Nível em ou abaixo de 20%. Por favor, carregue.");
            }

        } while (nivelBateria <= 20);

        System.out.printf("✅ Nível de bateria seguro! (%d%%).\n\n", nivelBateria);
    }

    /** 7 - Deseja fazer uma conta?: Se "sim", pede dois números e soma */
    public static void exercicio7(Scanner scanner) {
        String resposta;

        do {
            System.out.print("Deseja fazer uma conta de soma? (sim/não): ");
            resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("sim")) {
                double num1, num2;

                System.out.print("Digite o primeiro número: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Entrada inválida. Digite um número.");
                    scanner.next();
                    System.out.print("Digite o primeiro número: ");
                }
                num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Entrada inválida. Digite um número.");
                    scanner.next();
                    System.out.print("Digite o segundo número: ");
                }
                num2 = scanner.nextDouble();
                scanner.nextLine(); // Consome o resto da linha

                double soma = num1 + num2;
                System.out.printf("O resultado da soma (%.2f + %.2f) é: **%.2f**\n", num1, num2, soma);
            } else if (!resposta.equals("não")) {
                System.out.println("Resposta inválida. Por favor, responda 'sim' ou 'não'.");
            }

        } while (resposta.equals("sim") || !resposta.equals("não")); // Continua se for "sim" OU se a resposta for inválida (e não for "não")

        System.out.println("Operação encerrada.\n");
    }


	}


