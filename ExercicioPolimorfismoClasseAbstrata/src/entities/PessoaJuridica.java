package entities;

public class PessoaJuridica extends Pessoa {
	private static Double TAXA_DEZESSEIS = 0.16;
	private static Double TAXA_QUATORZE = 0.14;
	private Integer funcionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double impostoPago() {
		double imposto = 0;
		if (funcionarios > 10) {
			imposto = super.getRendaAnual() * TAXA_QUATORZE;
		} else {
			imposto = super.getRendaAnual() * TAXA_DEZESSEIS; 
		}
		return imposto;
	}

	@Override
	public String toString() {
		return super.getNome() + ": $ " + String.format("%.2f", impostoPago());
	}
}