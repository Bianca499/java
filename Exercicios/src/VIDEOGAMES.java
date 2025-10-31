import java.util.Scanner;

public class VIDEOGAMES {
	Scanner sc = new Scanner(System.in);
	 String marca;
	    String modelo;
	    boolean ligado = false;

	    void ligar() {
	        ligado = true;
	        System.out.println("O console está ligado.");
	    }

	    void desligar() {
	        ligado = false;
	        System.out.println("O console foi desligado.");
	    }

	    void verificarStatus() {
	        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));

	
}
}
