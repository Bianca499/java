import java.util.Scanner;

public class CONTABANCARIAp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 ContaBancaria conta = new ContaBancaria("Bianca");

	        conta.depositar(500);
	        System.out.println("Saldo após depósito de 500: " + conta.getSaldo());

	        conta.sacar(200);
	        System.out.println("Saldo após saque de 200: " + conta.getSaldo());

	        conta.sacar(400); // saque maior que o saldo
	        System.out.println("Saldo final: " + conta.getSaldo());
	    }
	
	}


