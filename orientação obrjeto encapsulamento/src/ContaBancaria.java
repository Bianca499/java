
public class ContaBancaria {
	 private String titular;
	    private double saldo;

	    public ContaBancaria(String titular) {
	        this.titular = titular;
	        this.saldo = 0; // saldo inicial
	    }

	    public String getTitular() {
	        return titular;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	        } else {
	            System.out.println("Valor de depósito inválido!");
	        }
	    }

	    public void sacar(double valor) {
	        if (valor > saldo) {
	            System.out.println("Saldo insuficiente!");
	        } else if (valor <= 0) {
	            System.out.println("Valor de saque inválido!");
	        } else {
	            saldo -= valor;
	        }
	    }
	}

