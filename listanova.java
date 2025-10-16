package Primeiro;

import java.util.Scanner;

public class listanova {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 // ===== 1 - Intervalo numérico =====
	        System.out.print("Digite um número: ");
	        int numero = sc.nextInt();

	        if (numero >= 10 && numero <= 20) {
	            System.out.println("Número dentro do intervalo.");
	        } else {
	            System.out.println("Fora do intervalo.");
	        }

	        System.out.println("-------------------------------");

	        // ===== 2 - Acesso à festa =====
	        System.out.print("Digite sua idade: ");
	        int idade = sc.nextInt();
	        sc.nextLine(); // limpa o buffer
	        System.out.print("Possui convite? (sim/não): ");
	        String convite = sc.nextLine().toLowerCase();

	        if (idade >= 18 && convite.equals("sim")) {
	            System.out.println("Entrada permitida!");
	        } else {
	            System.out.println("Entrada não permitida.");
	        }

	        System.out.println("-------------------------------");

	        // ===== 3 - Categoria de esporte =====
	        System.out.print("Digite sua idade: ");
	        int idadeEsporte = sc.nextInt();

	        if (idadeEsporte < 12 || idadeEsporte > 60) {
	            System.out.println("Categoria especial.");
	        } else {
	            System.out.println("Categoria normal.");
	        }

	        System.out.println("-------------------------------");

	        // ===== 4 - Desconto no produto =====
	        System.out.print("Digite o valor do produto: ");
	        double valor = sc.nextDouble();
	        sc.nextLine();
	        System.out.print("Forma de pagamento (avista/cartão): ");
	        String pagamento = sc.nextLine().toLowerCase();

	        if (valor > 100 && pagamento.equals("avista")) {
	            double desconto = valor * 0.9;
	            System.out.println("Valor com desconto: R$ " + desconto);
	        } else {
	            System.out.println("Valor sem desconto: R$ " + valor);
	        }

	        System.out.println("-------------------------------");

	        // ===== 5 - Triagem médica =====
	        System.out.print("Digite a temperatura corporal: ");
	        double temp = sc.nextDouble();
	        sc.nextLine();
	        System.out.print("Possui sintomas? (sim/não): ");
	        String sintomas = sc.nextLine().toLowerCase();

	        if (temp >= 38 || sintomas.equals("sim")) {
	            System.out.println("Recomenda-se procurar um médico.");
	        } else {
	            System.out.println("Sem sinais preocupantes.");
	        }

	        System.out.println("-------------------------------");

	        // ===== 6 - Votação =====
	        System.out.print("Digite sua idade: ");
	        int idadeVoto = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Você é brasileiro? (sim/não): ");
	        String brasileiro = sc.nextLine().toLowerCase();

	        if (idadeVoto >= 16 && brasileiro.equals("sim")) {
	            System.out.println("Pode votar.");
	        } else {
	            System.out.println("Não pode votar.");
	        }

	        System.out.println("-------------------------------");

	        // ===== 7 - Bônus de funcionário =====
	        System.out.print("Digite a quantidade de horas extras: ");
	        int horasExtras = sc.nextInt();
	        System.out.print("Digite o número de faltas: ");
	        int faltas = sc.nextInt();

	        if (horasExtras > 20 && faltas < 5) {
	            System.out.println("Ganha bônus!");
	        } else {
	            System.out.println("Não ganha bônus.");
	        }

	        System.out.println("-------------------------------");

	        // ===== 8 - Autorização para dirigir =====
	        System.out.print("Digite sua idade: ");
	        int idadeDirigir = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Possui carteira de motorista? (sim/não): ");
	        String carteira = sc.nextLine().toLowerCase();

	        if (idadeDirigir >= 18 && carteira.equals("sim")) {
	            System.out.println("Pode dirigir.");
	        } else {
	            System.out.println("Não pode dirigir.");
	        }

	        System.out.println("-------------------------------");

	        // ===== 9 - Elegibilidade para Bolsa de Estudos =====
	        System.out.print("Digite sua nota média (0 a 10): ");
	        double nota = sc.nextDouble();
	        System.out.print("Digite sua frequência (%): ");
	        double frequencia = sc.nextDouble();

	        if (nota >= 8 && frequencia >= 80) {
	            System.out.println("Bolsa concedida.");
	        } else {
	            System.out.println("Bolsa não concedida.");
	        }

	        System.out.println("-------------------------------");

	        // ===== 10 - Verificação de Temperatura Ambiente =====
	        System.out.print("Digite a temperatura ambiente (°C): ");
	        double temperatura = sc.nextDouble();
	        System.out.print("Digite a umidade do ar (%): ");
	        double umidade = sc.nextDouble();

	        if ((temperatura < 18 || temperatura > 26) && umidade > 60) {
	            System.out.println("Ajustar climatização.");
	        } else {
	            System.out.println("Climatização não necessária.");
	        }

	        sc.close();

	}

}
