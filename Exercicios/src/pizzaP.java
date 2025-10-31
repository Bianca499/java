import java.util.Scanner;

public class pizzaP {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  Pizza pizza1 = new Pizza();
	        pizza1.sabor = "Calabresa";
	        pizza1.tamanho = "Grande";
	        pizza1.bordaRecheada = true;

	        Pizza pizza2 = new Pizza();
	        pizza2.sabor = "Mussarela";
	        pizza2.tamanho = "Média";
	        pizza2.bordaRecheada = false;

	        pizza1.preparar();
	        pizza1.assando();
	        pizza1.mostrarInformacoes();

	        pizza2.preparar();
	        pizza2.assando();
	        pizza2.mostrarInformacoes();
	    }
	    }

		
	

		
	


