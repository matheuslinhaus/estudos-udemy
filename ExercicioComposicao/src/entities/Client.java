package entities;

import java.time.LocalDate;

public class Client {

	private String nome;
	private String email;
	private LocalDate nascimento;

	public Client() {
	}

	public Client(String nome, String email, LocalDate nascimento) {
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
}