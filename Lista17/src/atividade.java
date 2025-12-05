import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- INÍCIO DOS EXERCÍCIOS DE MATRIZES ---");

        // 1. Criando uma matriz simples (2x3)
        exercicio1(sc);
        
        // 2. Nomes em uma tabela (3x2)
        exercicio2(sc);
        
        // 3. Mostrando a diagonal principal (3x3)
        exercicio3(sc);

        // 4. Procurando um número (3x3)
        exercici4o(sc);

        // 5. Elementos maiores que 10 (4x3)
        exercicio5(sc);
        
        // ** Observação: Em ambientes como IDEs, fechar o Scanner pode ser feito aqui.
        // sc.close(); 
        
        System.out.println("\n--- FIM DOS EXERCÍCIOS DE MATRIZES ---");
    }

	private static void exercicio5(Scanner sc) {
		System.out.println("\n=================================================");
        System.out.println("### 5. Elementos Maiores que 10 (4x3) ###");
        int[][] matriz = new int[4][3]; 
        int contador = 0; 

        System.out.println("\n-> Preencha a Matriz:");
        // Preencher
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print("Digite o valor para E[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Verificar e Exibir
        System.out.println("\n-> Valores Maiores que 10:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > 10) { 
                    System.out.println("Valor: **" + matriz[i][j] + "** na posição [" + i + "][" + j + "]");
                    contador++;
                }
            }
        }
        
        System.out.println("\n-> Total de **" + contador + "** elementos maiores que 10.");
    }

		
	

	private static void exercici4o(Scanner sc) {
		System.out.println("\n=================================================");
        System.out.println("### 4. Procurando um Número na Matriz (3x3) ###");
        int[][] matriz = new int[3][3]; 
        int numeroBusca;
        int linhaEncontrada = -1;
        int colunaEncontrada = -1;
        
        System.out.println("\n-> Preencha a Matriz:");
        // Preencher
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para D[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("\n-> Digite o número que deseja buscar: ");
        numeroBusca = sc.nextInt();

        // Procurar (otimizando para parar no primeiro encontrado)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == numeroBusca) {
                    linhaEncontrada = i;
                    colunaEncontrada = j;
                    // Quebra o loop interno
                    break; 
                }
            }
            // Verifica se o loop interno encontrou e quebra o loop externo
            if (linhaEncontrada != -1) {
                break;
            }
        }

        // Resultado
        System.out.println("\n-> Resultado da Busca:");
        if (linhaEncontrada != -1) {
            System.out.println("O número **" + numeroBusca + "** foi encontrado na posição **[" + linhaEncontrada + "][" + colunaEncontrada + "]**.");
        } else {
            System.out.println("O número **" + numeroBusca + "** não foi encontrado na matriz.");
        }
    }
		
	

	private static void exercicio3(Scanner sc) {
		System.out.println("\n=================================================");
        System.out.println("### 3. Mostrando a Diagonal Principal (3x3) ###");
        int[][] num = new int[3][3]; 

        System.out.println("\n-> Preencha a Matriz:");
        // Preencher
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para C[" + i + "][" + j + "]: ");
                num[i][j] = sc.nextInt();
            }
        }

        // Exibir Diagonal Principal
        System.out.println("\n-> Elementos da Diagonal Principal de C:");
        // A diagonal principal ocorre quando i (linha) == j (coluna)
        for (int i = 0; i < 3; i++) {
            System.out.println("Elemento [" + i + "][" + i + "]: **" + num[i][i] + "**"); 
        }
    }
		
	

	private static void exercicio2(Scanner sc) {
		System.out.println("\n=================================================");
        System.out.println("### 2. Nomes em uma Tabela (3x2) de Strings ###");
        // Limpa o buffer do scanner para Strings
        if (sc.hasNextLine()) sc.nextLine(); 
        String[][] nomes = new String[3][2]; 

        System.out.println("\n-> Preencha a Matriz de Nomes:");
        // Preencher
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 2; j++) { 
                System.out.print("Digite o nome para B[" + i + "][" + j + "]: ");
                nomes[i][j] = sc.nextLine(); 
            }
        }

        // Exibir como Tabela
        System.out.println("\n-> Tabela de Nomes B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                // Usa tabulação para alinhamento
                System.out.print(nomes[i][j] + "\t\t"); 
            }
            System.out.println(); 
        }
    }
        

        
		
	

	private static void exercicio1(Scanner sc) {
		System.out.println("\n=================================================");
        System.out.println("### 1. Criando uma Matriz Simples (2x3) de Inteiros ###");
        int[][] matriz = new int[2][3]; 

        System.out.println("\n-> Preencha a Matriz:");
        // Preencher
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print("Digite o valor para A[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Exibir
        System.out.println("\n-> Matriz Completa A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t"); 
            }
            System.out.println(); 
        }
    }
		
	}


    
   
