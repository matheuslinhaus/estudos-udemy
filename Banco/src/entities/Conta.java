package entities;

public class Conta {
	
	private static final double TAXA = 5.00;
	
	private int id;
	private String nome;
	private double saldo;
	
	public Conta(int id, String nome, double depositoInicial) {
		this.id = id;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public Conta(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		if (saldo > valor+5) {
			saldo = saldo - (valor + TAXA);
		} else {
			System.out.println("SALDO INSUFICIENTE");
		}
	}

	@Override
	public String toString() {
		return "Conta: " + id + ", Nome: " + nome + ", Saldo: " + saldo;
	}
}
