import java.util.Scanner;

public class ContaBancariaP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  // Criação da conta
        ContaBancaria conta1 = new ContaBancaria("Carlos Silva");

        // Operações
        conta1.depositar(1000);
        conta1.sacar(300);
        conta1.sacar(800); // tentativa de saque maior que o saldo

        // Exibir resultado final
        System.out.println("-----------------------------");
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo final: R$" + conta1.getSaldo());
    }

	}


