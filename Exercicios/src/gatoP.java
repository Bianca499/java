import java.util.Scanner;

public class gatoP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		gato g1 = new gato();
		g1.nome = "Frederico";
		g1.raca = "Persa";
		g1.idade = 1;
		
		gato g2 = new gato();
		g2.nome = "Laura";
		g2.raca = "Siamês";
		g1.idade = 3;
		
		g1.mostrarInformacoes();
		g1.miar();
		g1.comer();
		
		System.out.println("---------------------");
		g2.mostrarInformacoes();
		g2.miar();
		g2.comer();
		

	}

}
