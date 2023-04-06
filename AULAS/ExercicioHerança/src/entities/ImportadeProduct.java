package entities;

public class ImportadeProduct extends Product{
	private Double customsFee;
	
	public String priceTag() {
		return " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
	}
	
	public ImportadeProduct() {
		super();
	}

	public ImportadeProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
}	
