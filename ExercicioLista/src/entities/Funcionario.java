package entities;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;

	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void percentualAumentaSalario(Double percentual) {
		salario += (salario * (percentual / 100));
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", " + salario;
	}

}
