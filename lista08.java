package Primeiro;

import java.util.Scanner;

import javax.swing.JSpinner;

public class lista08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolhe um numero 1 a 7 representando um dia da semana:");
		int numero = scanner.nextInt();
		switch (numero) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			System.out.println("Final de semana");
			System.out.println("Domingo e sabado e dia util");
			System.out.println("Dia útil ou dia invarido");
			System.out.println("para numeros fora do intervalo");

			System.out.println(" escolhe um codigo de bebida");
			int numero1 = scanner.nextInt();
			switch (numero) {
			case 1:
				System.out.println("cafe");
				break;
			case 2:
				System.out.println("chá");
				break;
			case 3:
				System.out.println("suco");
				break;
			case 4:
				System.out.println("refrigerante");
				System.out.println("Exiba o preco da bebida");
				System.out.println("cafe R$5,00");
				System.out.println("cha R$3,50");
				System.out.println("suco R$4,00");
				System.out.println("refrigerante R$4,50");
				System.out.println("Exiba o preço da bebida");
				System.out.println("Código inválido");
				System.out.println("O código não corresponder a nenhumma bebida");

				System.out.println(" Peça um código de veículo");
				int codigo = scanner.nextInt();
				switch (codigo) {
				case 1:
					System.out.println("carro");
					break;
				case 2:
					System.out.println("moto");
					break;
				case 3:
					System.out.println("caminhão");
					break;
				case 4:
					System.out.println("Exiba a categoria do veiculo");
					System.out.println("carro leve");
					System.out.println("Moto motocicleta");
					System.out.println("caminhao pesado");
					System.out.println("Exiba a categoria");
					System.out.println("Veiculo invalido para codigos desconhecidos");

					System.out.println(" Peça um código de plano ");
					int plano = scanner.nextInt();
					switch (plano) {
					case 1:
						System.out.println("Básico");
						break;
					case 2:
						System.out.println("lntermediário");
						break;
					case 3:
						System.out.println("Premium");
						break;
					case 4:
						System.out.println("mostrar os beneficos");
						System.out.println("Básico Acesso limitado");
						System.out.println("intermediario acesso");
						System.out.println("suporte");
						System.out.println("padrao");
						System.out.println("premium");
						System.out.println("Acesso total");
						System.out.println("Suporte prioritario");
						System.out.println("Plano invalido");
						System.out.println("codigos invalidos");

System.out.println("site um numero de 1 a 12 estacao");
int estacao = scanner.nextInt();
switch (estacao) {
case 1:
	System.out.println("Exiba a estacao do ano no hemisferio sul");
break;
case 2:
	System.out.println("12,1,2=verao");
	break;
case 3:
	System.out.println("3,4,5=outuno");
	break;
case 4:
	System.out.println("6,7,8=inverno!");
	break;
case 5:
	System.out.println("9,10,11=primavera");
	System.out.println("Mês invalido");
	
	
	System.out.println("Peça um codigo de ingresso");
	int ingresso = scanner.nextInt();
	switch (ingresso) {
	case 1:
		System.out.println("inteira");
		break;
	case 2:
		System.out.println("meia-entrada");
		break;
	case 3:
		System.out.println("vip");
		System.out.println("preço:inteira= R$50,00");
		System.out.println("meia-entrada= R$25,00");
		System.out.println("vip= R$100,00");
		System.out.println("ingresso invalido para codigos desconhecidos");
		
		System.out.println("Peça um codigo de idiona");
		int idiona = scanner.nextInt();
		switch (idiona) {
		case 1:
			System.out.println("Portugues");
			break;
		case 2:
			System.out.println("ingles");
			break;
		case 3:
			System.out.println("Espanhol");
			System.out.println("exiba uma situacao");
			System.out.println("ola ingles=helo");
			System.out.println("Espanhol=hola");
			System.out.println("idiona invalido");
			
			System.out.println("Peça um codigo de nivel");
			int nivel= scanner.nextInt();
			switch (nivel) {
			case 1:
				System.out.println("usuarios");
				break;
			case 2:
				System.out.println("moderador");
				break;
			case 3:
				System.out.println("admirador");
				System.out.println("usuario=Acesso Basico");
				System.out.println("Moderador= Acesso basico + edicao");
				System.out.println("Administador= acesso total");
				
				System.out.println("Nivdel invalido");
				
				System.out.println("Peça um codigo de pagamento");
				int pagamento= scanner.nextInt();
				switch (pagamento) {
				case 1:
					System.out.println("Dinheiro");
					break;
				case 2:
					System.out.println("cartao de credito");
					break;
				case 3:
					System.out.println("Pix");
					Ststem.out.println("dnheiro=pagamento em dinheiro confirmando")
				}
			}
			
		
		}
	}
	}



						
							
					}

				}
			}

		}

	}
}
