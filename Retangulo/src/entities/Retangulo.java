package entities;

public class Retangulo {
	
	private Double altura;
	private Double largura;
	
	public Retangulo() {

	}
	
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getLargura() {
		return largura;
	}
	public void setLargura(Double largura) {
		this.largura = largura;
	}
	
	public Double area() {
		return this.altura * this.largura;
	}

	public Double perimetro() {
		return 2 * (this.altura + this.largura);
	}
	
	public Double diagonal() {
		return Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.largura, 2));
	}
	
	
	
}
