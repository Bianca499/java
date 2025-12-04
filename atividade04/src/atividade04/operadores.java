package atividade04;

import java.util.Scanner;

public class operadores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1 — Classificação de Filme
        System.out.print("Exercício 1 — Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade < 16 || idade > 70) {
            System.out.println("Classificação especial");
        } else {
            System.out.println("Classificação regular");
        }

        // 2 — Promoção de Produto
        System.out.print("Exercício 2 — Digite o valor do produto: ");
        double valor = sc.nextDouble();
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();
        double total = valor * quantidade;
        if (total > 200 && quantidade > 5) {
            double desconto = total * 0.15;
            System.out.println("Desconto aplicado! Total com desconto: " + (total - desconto));
        } else {
            System.out.println("Sem desconto. Total: " + total);
        }

        // 3 — Alerta de Saúde
        System.out.print("Exercício 3 — Digite a frequência cardíaca (bpm): ");
        int frequencia = sc.nextInt();
        sc.nextLine();  // consumir newline
        System.out.print("Sente tontura? (sim ou não): ");
        String tontura = sc.nextLine().trim().toLowerCase();
        if (frequencia >= 100 || tontura.equals("sim")) {
            System.out.println("Procure atendimento médico");
        } else {
            System.out.println("Sem sinais de alerta");
        }

        // 4 — Participação em Concurso
        System.out.print("Exercício 4 — Digite sua idade: ");
        int idadeC = sc.nextInt();
        sc.nextLine();
        System.out.print("É residente do estado? (sim ou não): ");
        String residente = sc.nextLine().trim().toLowerCase();
        if ((idadeC >= 18 && idadeC <= 30) && residente.equals("sim")) {
            System.out.println("Elegível para o concurso");
        } else {
            System.out.println("Não elegível para o concurso");
        }

        // 5 — Recompensa por Desempenho
        System.out.print("Exercício 5 — Projetos concluídos: ");
        int projetos = sc.nextInt();
        System.out.print("Erros reportados: ");
        int erros = sc.nextInt();
        if (projetos > 10 && erros < 3) {
            System.out.println("Recompensa concedida");
        } else {
            System.out.println("Sem recompensa");
        }

        // 6 — Autorização para Viagem
        System.out.print("Exercício 6 — Digite sua idade: ");
        int idadeV = sc.nextInt();
        sc.nextLine();
        System.out.print("Possui passaporte válido? (sim ou não): ");
        String passaporte = sc.nextLine().trim().toLowerCase();
        if (idadeV >= 18 && passaporte.equals("sim")) {
            System.out.println("Viagem autorizada");
        } else {
            System.out.println("Viagem não autorizada");
        }

        // 7 — Aprovação em Curso Online
        System.out.print("Exercício 7 — Digite sua nota final (0 a 100): ");
        double nota = sc.nextDouble();
        System.out.print("Número de aulas assistidas (0 a 50): ");
        int aulas = sc.nextInt();
        if (nota >= 70 && aulas >= 40) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // 8 — Controle de Irrigação
        System.out.print("Exercício 8 — Umidade do solo (%): ");
        double umidade = sc.nextDouble();
        System.out.print("Temperatura (°C): ");
        double temperatura = sc.nextDouble();
        if (umidade < 30 || temperatura > 30) {
            System.out.println("Irrigação necessária");
        } else {
            System.out.println("Irrigação não necessária");
        }

        // 9 — Inscrição em Feira Profissional
        System.out.print("Exercício 9 — Digite sua idade: ");
        int idadeF = sc.nextInt();
        sc.nextLine();
        System.out.print("Possui experiência prévia? (sim ou não): ");
        String experiencia = sc.nextLine().trim().toLowerCase();
        if ((idadeF >= 20 && idadeF <= 40) && experiencia.equals("sim")) {
            System.out.println("Inscrição aceita");
        } else {
            System.out.println("Inscrição não permitida");
        }

        sc.close();
    }



	}


