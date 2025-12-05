package lista16;

import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}

//--- Exercicio 1: Vetor de Cores ---
public static void exercicio1VetorDeCores(Scanner sc) {
    System.out.println("\n## 1. Criando um vetor de cores");
    String[] cores = new String[6];

    // Lendo as 6 cores
    for (int i = 0; i < 6; i++) {
        System.out.print("Digite a cor " + (i + 1) + "/6: ");
        cores[i] = sc.next(); // Uso do Scanner já inicializado
    }

    System.out.println(" Cores Armazenadas:");
    // Mostrando as 6 cores
    for (String cor : cores) {
        System.out.println(cor);
    }
    System.out.println("----------------------------------------");
}

//--- Exercicio 2: Vetor de números decimais ---
public static void exercicio2VetorDeDecimais(Scanner sc) {
    System.out.println("\n## 2. Vetor de números decimais (double)");
    double[] decimais = new double[8];

    // Lendo os 8 números decimais
    for (int i = 0; i < 8; i++) {
        System.out.print("Digite o " + (i + 1) + "º número decimal/8: ");
        decimais[i] = sc.nextDouble(); // Uso do Scanner já inicializado
    }

    System.out.println(" Valores Decimais Digitados:");
    // Exibindo os valores
    for (double valor : decimais) {
        System.out.println(valor);
    }
    System.out.println("----------------------------------------");
}

//--- Exercicio 3: Mostrando apenas os pares ---
public static void exercicio3MostrandoApenasPares(Scanner sc) {
    System.out.println("\n## 3. Mostrando apenas os pares");
    int[] numerosPares = new int[10];

    // Lendo os 10 números inteiros
    for (int i = 0; i < 10; i++) {
        System.out.print("Digite o " + (i + 1) + "º número inteiro/10: ");
        numerosPares[i] = sc.nextInt(); // Uso do Scanner já inicializado
    }

    System.out.println("Números Pares Digitados:");
    // Verificando e mostrando apenas os pares
    for (int numero : numerosPares) {
        if (numero % 2 == 0) {
            System.out.println(numero);
        }
    }
    System.out.println("----------------------------------------");
}

//--- Exercicio 4: Menores que 50 ---
public static void exercicio4MenoresQueCinquenta(Scanner sc) {
    System.out.println("\n## 4. Menores que 50");
    int valorLido;
    
    // Lendo 12 números e verificando na hora
    for (int i = 0; i < 12; i++) {
        System.out.print("Digite o " + (i + 1) + "º número/12: "); // Correção do índice
        valorLido = sc.nextInt();
        
        if (valorLido < 50) {
            System.out.println("✅ menor que 50");
        } 
        // Caso contrário, apenas continua (não faz nada)
    }
    System.out.println("----------------------------------------");
}

//--- Exercicio 5: Procurando um nome no vetor ---
public static void exercicio5ProcurandoNome(Scanner sc) {
    System.out.println("\n## 5. Procurando um nome no vetor");
    String[] nomes = new String[5];
    boolean nomeEncontrado = false;
    
    // Lendo os 5 nomes
    for (int i = 0; i < 5; i++) {
        System.out.print("Digite o " + (i + 1) + "º nome/5: "); // Correção do índice
        nomes[i] = sc.next();
    }
    
    System.out.print("\nDigite um nome extra para procurar: ");
    String nomeBusca = sc.next();
    
    // Procurando o nome no vetor
    for (String nome : nomes) {
        if (nome.equalsIgnoreCase(nomeBusca)) { // Usa equalsIgnoreCase para ser flexível
            nomeEncontrado = true;
            break; 
        }
    }
    
    // Exibindo o resultado
    if (nomeEncontrado) {
        System.out.println("✅ O nome '" + nomeBusca + "' existe no vetor.");
    } else {
        System.out.println("❌ O nome '" + nomeBusca + "' NÃO existe no vetor.");
    }
    System.out.println("----------------------------------------");
}

//--- Exercicio 6: Produto e preço ---
public static void exercicio6ProdutoEPreco(Scanner sc) {
    System.out.println("\n## 6. Produto e preço (Vetores Paralelos)");
    String[] produtos = new String[4];
    double[] precos = new double[4];
    
    // Lendo os dados de 4 produtos
    for (int i = 0; i < 4; i++) {
        System.out.print("Digite o nome do " + (i + 1) + "º produto/4: "); // Correção do índice
        produtos[i] = sc.next();
        System.out.print("Digite o preço do " + (i + 1) + "º produto/4: R$"); // Correção do índice
        precos[i] = sc.nextDouble();
    }
    
    System.out.println("\n✅ Listagem de Produtos e Preços:");
    // Mostrando os dados formatados
    for (int i = 0; i < 4; i++) {
        // Usa o índice 'i' para acessar os vetores
        System.out.printf("O produto %s custa R$%.2f\n", produtos[i], precos[i]); 
    }
    System.out.println("----------------------------------------");
}

//--- Exercicio 7: Verificação de notas ---
public static void exercicio7VerificacaoDeNotas(Scanner sc) {
    System.out.println("\n## 7. Verificação de notas (Aprovação)");
    double[] notas = new double[6];
    
    // Lendo as 6 notas
    for (int i = 0; i < 6; i++) {
        System.out.print("Digite a " + (i + 1) + "ª nota/6: "); // Correção do índice
        notas[i] = sc.nextDouble();
    }
    
    System.out.println("\n✅ Situação dos Alunos:");
    // Verificando a situação de cada nota
    for (double nota : notas) {
        System.out.printf("Nota %.2f: ", nota);
        // Reorganização da lógica para evitar "recuperação" em aprovados:
        // 1. Reprovado (< 6.0)
        // 2. Aprovado (>= 7.0)
        // 3. Recuperação (resto, que é >= 6.0 E < 7.0)
        if (nota < 6.0) {
            System.out.println("aluno reprovado");
        } else if (nota >= 7.0) { // Prioriza a aprovação
            System.out.println("aluno aprovado");
        } else { // Deve ser o caso entre 6.0 e 7.0 (>= 6.0 e < 7.0)
            System.out.println("aluno em recuperação");
        }
    }
    System.out.println("----------------------------------------");
}

//--- Exercicio 8: Promoção de ingressos ---
public static void exercicio8PromocaoDeIngressos(Scanner sc) {
    System.out.println("\n## 8. Promoção de ingressos");
    double[] precosIngressos = new double[5];
    
    // Lendo os 5 preços de ingressos
    for (int i = 0; i < 5; i++) {
        System.out.print("Digite o preço do " + (i + 1) + "º ingresso/5: R$");
        precosIngressos[i] = sc.nextDouble();
    }
    
    System.out.println("\n✅ Verificação de Promoções:");
    // Verificando e mostrando a promoção
    for (double preco : precosIngressos) {
        System.out.printf("R$%.2f: ", preco);
        if (preco > 100.0) {
            System.out.println("Ingresso com promoção disponível!");
        } else {
             System.out.println("Preço normal.");
        }
    }
    System.out.println("----------------------------------------");
}
}