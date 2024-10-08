package entities;

public class PessoaFisica extends Pessoa {
	private final Double TAXA_QUINZE = 0.15;
	private final Double TAXA_VINTE_CINCO = 0.25;
	private Double gastoSaude = 1.0;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}


	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double impostoPago() {
		double imposto = 0;
		if(super.getRendaAnual() < 20000.00) {
			imposto = (super.getRendaAnual() * TAXA_QUINZE) - (gastoSaude * 0.50);
		} else {
			imposto = (super.getRendaAnual() * TAXA_VINTE_CINCO) - (gastoSaude * 0.50);
		}
		return imposto;
	}
	
	@Override
	public String toString() {
		return super.getNome() + ": $ " + String.format("%.2f", impostoPago());
	}
}