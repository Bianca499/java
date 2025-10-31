import java.util.Scanner;

public class RetânguloP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   Retângulo r1 = new Retângulo();
	        r1.setLargura(5);
	        r1.setAltura(3);

	        Retângulo r2 = new Retângulo();
	        r2.setLargura(8);
	        r2.setAltura(4);

	        System.out.println("Retângulo 1:");
	        System.out.println("Largura: " + r1.getLargura());
	        System.out.println("Altura: " + r1.getAltura());
	        System.out.println("Área: " + r1.calcularArea());
	        System.out.println("Perímetro: " + r1.calcularPerimetro());
	        System.out.println("-----------------------------");
	        System.out.println("Retângulo 2:");
	        System.out.println("Largura: " + r2.getLargura());
	        System.out.println("Altura: " + r2.getAltura());
	        System.out.println("Área: " + r2.calcularArea());
	        System.out.println("Perímetro: " + r2.calcularPerimetro());
	    }

	}


