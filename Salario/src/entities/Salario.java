package entities;

public class Salario {
	
	private String nome;
	private Double salarioBruto;
	private Double taxa;
	
	public Salario() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salarioBruto;
	}
	public void setSalario(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public Double getTaxa() {
		return taxa;
	}
	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double salarioLiquido() {
		return (this.salarioBruto - this.taxa);
	}
	
	public Double incrementoSalarial(Double percentual) {
		return (this.salarioBruto * (percentual / 100));
	}
	
}
