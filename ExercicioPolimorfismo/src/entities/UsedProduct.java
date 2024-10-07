package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
	private DateTimeFormatter  sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public StringBuilder priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName() + " (Usado) $ " + super.getPrice() + " (Data fabricação: " + sdf.format(manufactureDate) + ")");
		return sb;
	}

}
