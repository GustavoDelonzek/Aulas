package entities;

public abstract class Pessoa {
	private String name;
	private Double annualIncome;
	
	public abstract Double impost();
	
	public Pessoa() {
		
	}
	
	public Pessoa(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	public Double getAnnualIncome() {
		return annualIncome;
	}
	
	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
