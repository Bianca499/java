package Primeiro;

import java.util.Scanner;

public class lista03 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        
	 
		
		// Resutado  de ois numero 
		int numero1;
		int numero2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inforne um numero");
		numero1 = scanner.nextInt();
		System.out.println("Inforne outro numero");
		numero2 = scanner.nextInt();
		
		int soma = numero1+ numero2;
		int substacao = numero1 - numero2;
		int multiplicacao  = numero1 * numero2;
		int divisao = numero1 / numero2;
		System.out.println("A soma desses numeros resuta em:" + soma +"; a subtacao");
		
		// Divisao e resto:
		 System.out.print("Digite o primeiro número: ");
	        int num1 = sc.nextInt();
	        
	        System.out.print("Digite o segundo número: ");
	        int num2 = sc.nextInt();
	        
	        int divisao1 = num1 / num2;
	        int resto = num1 % num2;
	        
	        System.out.println("Resultado da divisão inteira: " + divisao1);
	        System.out.println("Resto da divisão: " + resto);
	        
	        //Perímimetro de um triângulo
	        
	        System.out.print("Digite o lado 1: ");
	        double lado1 = sc.nextDouble();
	        
	        System.out.print("Digite o lado 2: ");
	        double lado2 = sc.nextDouble();
	        
	        System.out.print("Digite o lado 3: ");
	        double lado3 = sc.nextDouble();
	        
	        double perimetro = lado1 + lado2 + lado3;
	        
	        System.out.printf("Perímetro do triângulo: %.2f%n", perimetro);
	        
	        //Calculadora de Gorjeta
	        System.out.print("Digite o valor da conta: ");
	        double conta = sc.nextDouble();
	        
	        System.out.print("Digite a porcentagem da gorjeta: ");
	        double porcentagem = sc.nextDouble();
	        
	        double gorjeta = conta * (porcentagem / 100);
	        double total = conta + gorjeta;
	        
	        System.out.printf("Gorjeta: %.2f%n", gorjeta);
	        System.out.printf("Total a pagar: %.2f%n", total);
	        
	        //calculadora de área de circulo
	        final double PI = 3.14159;
	        
	        System.out.print("Digite o raio do círculo (em metros): ");
	        double raio = sc.nextDouble();
	        
	        double area = PI * raio * raio;
	        
	        System.out.printf("Área do círculo: %.2f m²%n", area);
	        
	        //Conversor de idade em dias
	        System.out.print("Digite a idade em anos: ");
	        int anos = sc.nextInt();
	        
	        System.out.print("Digite os meses: ");
	        int meses = sc.nextInt();
	        
	        System.out.print("Digite os dias: ");
	        int dias = sc.nextInt();
	        
	        int totalDias = (anos * 365) + (meses * 30) + dias;
	        
	        System.out.println("Total de dias vividos: " + totalDias);
	        
	        //Calculadora de pagamento por hora
	        System.out.print("Digite o número de horas trabalhadas: ");
	        double horas = sc.nextDouble();
	        
	        System.out.print("Digite o valor pago por hora: ");
	        double valorHora = sc.nextDouble();
	        
	        double salarioBruto = horas * valorHora;
	        double imposto = salarioBruto * 0.10;
	        double salarioLiquido = salarioBruto - imposto;
	        
	        System.out.printf("Salário bruto: %.2f%n", salarioBruto);
	        System.out.printf("Imposto (10%%): %.2f%n", imposto);
	        System.out.printf("Salário líquido: %.2f%n", salarioLiquido);
	       
	    }
	    
	    
}
	    
	

		
		
		



