import java.util.Scanner;

public class CarroP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  Carro carro1 = new Carro("Civic", 2022);

	        // Testando aceleração
	        carro1.acelerar(50);
	        carro1.acelerar(30);

	        // Testando frenagem
	        carro1.frear(20);
	        carro1.frear(80); // deve parar em 0

	        System.out.println("-----------------------------");
	        System.out.println("Modelo: " + carro1.getModelo());
	        System.out.println("Ano: " + carro1.getAno());
	        System.out.println("Velocidade final: " + carro1.getVelocidadeAtual() + " km/h");
	    }
	

	}

