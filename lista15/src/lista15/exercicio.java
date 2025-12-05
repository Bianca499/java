package lista15;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);


	System.out.println(" exercicío 1: Vetor de Frutas");
String[] frutas = new String[5];
System.out.print("Digite 5 nomes de frutas:");

for (int i = 0; i < 5; i++) {
    System.out.println("Fruta [" + i + "]: ");
    frutas[i] = sc.next();
}

System.out.print("Frutas Armazenadas:");
for (int i = 0; i < 5; i++) {
    System.out.println(frutas[i]);
}
	}


//2 - Vetor de números inteiros
public static void exercicio2(Scanner sc) {
    System.out.println("--- EXERCÍCIO 2: Vetor de Números Inteiros (10 posições) ---");

    // Criação do vetor de inteiros com 10 posições
    int[] numeros = new int[10];

    System.out.println("Digite 10 números inteiros:");
    // Loop para ler os 10 números
    for (int i = 0; i < 10; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        numeros[i] = sc.nextInt();
    }

    System.out.println("\nValores digitados:");
    // Loop para exibir os valores
    for (int i = 0; i < 10; i++) {
        System.out.println("-> " + numeros[i]);
    }
}

//3 - Mostrando os valores na ordem inversa
public static void exercicio3(Scanner sc) {
    System.out.println("--- EXERCÍCIO 3: Mostrando os Valores na Ordem Inversa (7 posições) ---");
    
    // Criação do vetor de inteiros com 7 posições
    int[] valores = new int[7];

    System.out.println("Digite 7 números:");
    // Loop para ler os 7 números
    for (int i = 0; i < 7; i++) {
        System.out.print("Valor " + (i + 1) + ": ");
        valores[i] = sc.nextInt();
    }

    System.out.println("\nValores na ordem inversa:");
    // Loop para mostrar os valores na ordem inversa (de 6 até 0)
    for (int i = 6; i >= 0; i--) {
        System.out.println("-> " + valores[i]);
    }
    System.out.println("\n------------------------------------------------\n");
}

// 4 - Maiores que 100
public static void exercicio4(Scanner sc) {
    System.out.println("--- EXERCÍCIO 4: Maiores que 100 (10 números) ---");
    
    System.out.println("Digite 10 números:");
    // Apenas para demonstração, vamos ler e verificar sem armazenar em vetor
    // (embora a prática com vetores seja recomendada)
    
    for (int i = 0; i < 10; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        int numero = sc.nextInt();

        // Verificação condicional
        if (numero > 100) {
            System.out.println("   [MENSAGEM] O número " + numero + " é maior do que 100!");
        }
    }
}
//5 - Procurando um valor no vetor
public static void exercicio5(Scanner sc) {
    System.out.println("--- EXERCÍCIO 5: Procurando um Valor no Vetor (8 posições) ---");

    int[] numeros = new int[8];
    boolean encontrado = false;

    System.out.println("Digite 8 números para preencher o vetor:");
    // Loop para ler os 8 números
    for (int i = 0; i < 8; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        numeros[i] = sc.nextInt();
    }

    System.out.print("\nDigite o número EXTRA que você deseja procurar: ");
    int numeroProcurado = sc.nextInt();

    // Loop para procurar o número no vetor
    for (int i = 0; i < 8; i++) {
        if (numeros[i] == numeroProcurado) {
            encontrado = true;
            break; // Encontrou, pode parar de procurar
        }
    }

    // Exibe o resultado
    if (encontrado) {
        System.out.println("O número " + numeroProcurado + " existe no vetor.");
    } else {
        System.out.println("O número " + numeroProcurado + " NÃO existe no vetor.");
    }
    System.out.println("\n------------------------------------------------\n");
}

// 6 - Nome e idade de 5 pessoas
public static void exercicio6(Scanner sc) {
    System.out.println("--- EXERCÍCIO 6: Nome e Idade de 5 Pessoas (Vetores paralelos) ---");

    String[] nomes = new String[5];
    int[] idades = new int[5];

    System.out.println("Digite o nome e a idade de 5 pessoas:");
    // Loop para ler os dados
    for (int i = 0; i < 5; i++) {
        System.out.println("\n*** Dados da " + (i + 1) + "ª pessoa ***");
        System.out.print("Nome: ");
        nomes[i] = sc.next();
        System.out.print("Idade: ");
        idades[i] = sc.nextInt();
    }

    System.out.println("\nPessoas cadastradas:");
    // Loop para mostrar os nomes e as idades juntas
    for (int i = 0; i < 5; i++) {
        System.out.println("-> " + nomes[i] + " tem " + idades[i] + " anos.");
    }
    System.out.println("\n------------------------------------------------\n");
}

// 7 - Identificação de idade
public static void exercicio7(Scanner sc) {
    System.out.println("--- EXERCÍCIO 7: Identificação de Idade (10 idades) ---");

    // Criação do vetor de inteiros (idades) com 10 posições
    int[] idades = new int[10];

    System.out.println("Digite 10 idades:");
    // Loop para ler as 10 idades
    for (int i = 0; i < 10; i++) {
        System.out.print("Idade " + (i + 1) + ": ");
        idades[i] = sc.nextInt();

        // Verificação condicional
        if (idades[i] < 18) {
            System.out.println("   [MENSAGEM] Você é menor de idade!");
        }
    }
    System.out.println("\n------------------------------------------------\n");
}

// 8 - Aumento em massa
public static void exercicio8(Scanner sc) {
    System.out.println("--- EXERCÍCIO 8: Aumento em Massa (7 salários) ---");

    // Criação do vetor de doubles (salários) com 7 posições
    double[] salarios = new double[7];

    System.out.println("Digite 7 salários:");
    // Loop para ler os 7 salários
    for (int i = 0; i < 7; i++) {
        System.out.print("Salário " + (i + 1) + ": R$ ");
        salarios[i] = sc.nextDouble();

        // Verificação condicional
        if (salarios[i] <= 2500.00) {
            System.out.println("   [MENSAGEM] Você receberá um aumento!");
        }
    }
    System.out.println("\n------------------------------------------------\n");
}
}

