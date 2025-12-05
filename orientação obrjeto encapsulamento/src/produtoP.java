import java.util.Scanner;

public class produtoP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 produto p1 = new produto();
	        p1.setNome("Caderno");
	        p1.setPreco(15.50);
	        p1.setEstoque(30);

	        produto p2 = new produto();
	        p2.setNome("Caneta");
	        p2.setPreco(2.00);
	        p2.setEstoque(100);

	        produto p3 = new produto();
	        p3.setNome("Lápis");
	        p3.setPreco(1.20);
	        p3.setEstoque(80);

	        System.out.println("Produto: " + p1.getNome() + " | Preço: " + p1.getPreco() + " | Estoque: " + p1.getEstoque());
	        System.out.println("Produto: " + p2.getNome() + " | Preço: " + p2.getPreco() + " | Estoque: " + p2.getEstoque());
	        System.out.println("Produto: " + p3.getNome() + " | Preço: " + p3.getPreco() + " | Estoque: " + p3.getEstoque());
	    }
	

	}


