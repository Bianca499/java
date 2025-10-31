import java.util.Scanner;

public class ProdutoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  Produto p1 = new Produto();
	        p1.setNome("Camiseta");
	        p1.setPreco(49.90);
	        p1.setEstoque(10);

	        Produto p2 = new Produto();
	        p2.setNome("Tênis");
	        p2.setPreco(199.90);
	        p2.setEstoque(5);

	        System.out.println("Produto 1: " + p1.getNome() + " | Preço: R$" + p1.getPreco() + " | Estoque: " + p1.getEstoque());
	        System.out.println("Produto 2: " + p2.getNome() + " | Preço: R$" + p2.getPreco() + " | Estoque: " + p2.getEstoque());
	    }
	

	}


