import java.util.Scanner;

public class ContaBancariaP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   ContaBancaria conta = new ContaBancaria();
	        conta.titular = "Ana Souza";
	        conta.saldo = 500.00;

	        conta.mostrarSaldo();
	        conta.depositar(200.00);
	        conta.sacar(100.00);
	        conta.sacar(700.00);
	        conta.mostrarSaldo();
	    }

	}


