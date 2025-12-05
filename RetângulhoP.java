import java.util.Scanner;

public class RetângulhoP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Retângulho r1 = new Retângulho();
	        r1.setLargura(10);
	        r1.setAltura(5);

	        Retângulho r2 = new Retângulho();
	        r2.setLargura(7.5);
	        r2.setAltura(3.2);

	        System.out.println("Retângulo 1:");
	        System.out.println("Área: " + r1.calcularArea());
	        System.out.println("Perímetro: " + r1.calcularPerimetro());

	        System.out.println("\nRetângulo 2:");
	        System.out.println("Área: " + r2.calcularArea());
	        System.out.println("Perímetro: " + r2.calcularPerimetro());
	    }
	


	}


