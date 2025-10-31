
public class Carro {
	private String modelo;
    private int ano;
    private int velocidadeAtual;

    // Construtor
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0; // velocidade inicial
    }

    // Método para acelerar
    public void acelerar(int valor) {
        if (valor > 0) {
            velocidadeAtual += valor;
            System.out.println("Acelerando " + valor + " km/h. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Valor inválido para acelerar!");
        }
    }

    // Método para frear
    public void frear(int valor) {
        if (valor > 0) {
            velocidadeAtual -= valor;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
            System.out.println("Freando " + valor + " km/h. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Valor inválido para frear!");
        }
    }

    // Getter para velocidade atual
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // Getter para modelo e ano
    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}


