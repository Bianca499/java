import java.util.Scanner;

public class VIDEOGAMESP {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		VIDEOGAMES vg = new VIDEOGAMES();
        vg.marca = "Sony";
        vg.modelo = "PlayStation 5";

        vg.verificarStatus();
        vg.ligar();
        vg.verificarStatus();
        vg.desligar();
        vg.verificarStatus();
    }
}
