
public class Retângulo {
	 private double largura;
	    private double altura;

	    // Setters
	    public void setLargura(double largura) {
	        this.largura = largura;
	    }

	    public void setAltura(double altura) {
	        this.altura = altura;
	    }

	    // Getters
	    public double getLargura() {
	        return largura;
	    }

	    public double getAltura() {
	        return altura;
	    }

	    // Método para calcular área
	    public double calcularArea() {
	        return largura * altura;
	    }

	    // Método para calcular perímetro
	    public double calcularPerimetro() {
	        return 2 * (largura + altura);
	    }
}
