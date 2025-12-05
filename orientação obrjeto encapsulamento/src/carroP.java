import java.util.Scanner;

public class carroP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 carro c = new carro();

	        c.setModelo("Onix");
	        c.setAno(2020);

	        System.out.println("Velocidade inicial: " + c.getVelocidadeAtual());

	        c.acelerar(30);
	        System.out.println("Após acelerar 30: " + c.getVelocidadeAtual());

	        c.acelerar(20);
	        System.out.println("Após acelerar mais 20: " + c.getVelocidadeAtual());

	        c.frear(25);
	        System.out.println("Após frear 25: " + c.getVelocidadeAtual());

	        c.frear(100);
	        System.out.println("Após frear 100 (mínimo 0): " + c.getVelocidadeAtual());
	    }

	}


