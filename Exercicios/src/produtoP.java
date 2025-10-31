import java.util.Scanner;

public class produtoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 produto p1 = new produto();
	        p1.nome = "Teclado Mecânico";
	        p1.preco = 350.00;
	        p1.estoque = 10;

	        produto p2 = new produto();
	        p2.nome = "Mouse Gamer";
	        p2.preco = 150.00;
	        p2.estoque = 5;

	        p1.mostrarInformacoes();
	        p1.vender(3);
	        p1.mostrarInformacoes();

	        p2.vender(6);
	        p2.mostrarInformacoes();
	    }
		    
		}


