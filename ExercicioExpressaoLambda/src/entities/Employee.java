package entities;

public class Employee {
	private String name;
	private String mail;
	private Double salary;
	
	public Employee(String name, String mail, Double salary) {
		this.name = name;
		this.mail = mail;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
