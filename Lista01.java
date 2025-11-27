package Primeiro;

import java.util.Scanner;

public class Lista01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //java.util
		  // 1 - Cálculo para empresa
        double instalacao = 300.00;
        double limpeza = 150.00;
        double manutencao = 499.99;
        double totalEmpresa = instalacao + limpeza + manutencao;
        System.out.println("1 - Total a pagar para a empresa: R$ " + totalEmpresa);
        
        // 2 - Cálculo de salário
        double valorHora = 35.00;
        int horasTrabalhadas = 8;
        double salarioDia = valorHora * horasTrabalhadas;
        System.out.println("2 - Salário por dia de Joaquim: R$ " + salarioDia);

        // 3 - Caixas de bombons
        int bombonsPorCaixa = 27;
        int caixasCompradas = 16;
        int totalBombons = bombonsPorCaixa * caixasCompradas;
        System.out.println("3 - Total de bombons: " + totalBombons + " unidades");
        
        // 4 - Garrafas de água
        int garrafasVendidas = 300;
        int garrafasPorCaixa = 20;
        int totalCaixas = garrafasVendidas / garrafasPorCaixa;
        System.out.println("4 - Total de caixas utilizadas: " + totalCaixas);
        
        // 5 - Cálculo para camisetas
        int camisetasCompradas = 120;
        int camisetasVendidas = 80;
        int camisetasRestantes = camisetasCompradas - camisetasVendidas;
        int novasCamisetas = 50;
        int totalCamisetas = camisetasRestantes + novasCamisetas;
        double faturamento = camisetasVendidas * 30.00;
        System.out.println("5 - Total de camisetas agora: " + totalCamisetas);
        System.out.println("5 - Faturamento com as vendas: R$ " + faturamento);
        
        // 6 - Dobro e Metade
        double numero = 50; // você pode trocar esse valor
        double dobro = numero * 2;
        double metade = numero / 2;
        System.out.println("6 - Número: " + numero);
        System.out.println("   Dobro: " + dobro);
        System.out.println("   Metade: " + metade);
        
        

        
        


	}
	

}
