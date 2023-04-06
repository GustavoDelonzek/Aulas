package entities;

public class PessoaFisica extends Pessoa{
	private Double healthExpenses;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double impost() {
		if(super.getAnnualIncome() < 20000) {
			return (super.getAnnualIncome()  * 0.15) - (healthExpenses * 0.50); 
 		} else {
			return (super.getAnnualIncome()  * 0.25) - (healthExpenses * 0.50);
		}
	}
	
	
	
}
