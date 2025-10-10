package Primeiro;

import java.util.Scanner;

public class cinema02 {


	public class SistemaCinema {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        String[] classificacoes = {"Livre", "10", "12", "14", "16"};
	        String[] filmes = {"Toy Story", "Detona Ralph", "Homem-Aranha", "Pantera Negra", "Deadpool"};
	        
	        System.out.println("=== Bem-vindo ao Cinema ===");
	        System.out.println("\nFilmes disponíveis:");
	        for (int i = 0; i < filmes.length; i++) {
	            System.out.println((i + 1) + " - " + filmes[i] + " (Classificação: " + classificacoes[i] + ")");
	        

	        System.out.print("Digite sua idade: ");
	        int idade = sc.nextInt();
	        sc.nextLine();
	        
	      
	        System.out.print("Você é estudante? (S/N): ");
	        String estudante = sc.nextLine().trim().toUpperCase();

	        
	        System.out.println("\nTipos de filme disponíveis:");
	        System.out.println("1 - Filme Normal (R$ 20,00)");
	        System.out.println("2 - Filme 3D (R$ 30,00)");
	        System.out.print("Digite o número do tipo de filme desejado: ");
	        int tipoFilme = sc.nextInt();

	      
	        System.out.println("\nEscolha um dos filmes disponíveis:");
	        for (int i1 = 0; i1 < filmes.length; i1++) {
	            System.out.println((i1 + 1) + " - " + filmes[i1] + " (Classificação: " + classificacoes[i1] + ")");
	        }
	        System.out.print("Digite o número do filme escolhido: ");
	        int opcaoFilme = sc.nextInt();

	        String classificacaoEscolhida = classificacoes[opcaoFilme - 1];
	        String filmeEscolhido = filmes[opcaoFilme - 1];

	        
	        boolean permitido = false;
	        switch (classificacaoEscolhida) {
	            case "Livre":
	                permitido = true;
	                break;
	            case "10":
	                permitido = idade >= 10;
	                break;
	            case "12":
	                permitido = idade >= 12;
	                break;
	            case "14":
	                permitido = idade >= 14;
	                break;
	            case "16":
	                permitido = idade >= 16;
	                break;
	        }

	        if (!permitido) {
	            System.out.println("\nIdade não permitida para ver esse filme.");
	        } else {
	          
	            System.out.print("\nQuantos ingressos deseja comprar? ");
	            int qtdIngressos = sc.nextInt();

	       
	            double preco = (tipoFilme == 1) ? 20.0 : 30.0;
	            String tipo = (tipoFilme == 1) ? "Normal" : "3D";

	            double valorTotal = qtdIngressos * preco;

	       
	            if (idade < 12 || idade > 60 || estudante.equals("S")) {
	                valorTotal *= 0.5;
	            }

	         
	            System.out.println("\n=== RESUMO DA COMPRA ===");
	            System.out.println("Filme escolhido: " + filmeEscolhido);
	            System.out.println("Tipo de filme: " + tipo);
	            System.out.println("Quantidade de ingressos: " + qtdIngressos);
	            System.out.printf("Valor total com descontos aplicados: R$ %.2f\n", valorTotal);
	        }

	        sc.close();
	    }
	}

	      
	       

	}

} 
}
