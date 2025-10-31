
public class ContaBancaria {
	  private String titular;
	    private double saldo;

	    // Construtor
	    public ContaBancaria(String titular) {
	        this.titular = titular;
	        this.saldo = 0.0;
	    }

	    // Retorna o titular
	    public String getTitular() {
	        return titular;
	    }

	    // Retorna o saldo atual
	    public double getSaldo() {
	        return saldo;
	    }

	    // Depositar valor na conta
	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Valor inválido para depósito!");
	        }
	    }

	    // Sacar valor da conta
	    public void sacar(double valor) {
	        if (valor > 0 && valor <= saldo) {
	            saldo -= valor;
	            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Saque inválido! Verifique o valor ou saldo disponível.");
	        }
	    }
	}

