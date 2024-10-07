package entities;

public class ImportedProduct extends Product{
	
	private Double customFee;
	
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public double totalPrice() {
		return customFee + super.price;
	}
	
	@Override
	public StringBuilder priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName() + " $ " + totalPrice() + " Taxa importação: $ " + customFee);
		return sb;
	}
}
