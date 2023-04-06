package entities;

public class PessoaJuridica extends Pessoa{
	private Integer numberEmployees;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double impost() {
		if(numberEmployees > 10) {
			return super.getAnnualIncome() * 0.14;
		} else {
			return super.getAnnualIncome() * 0.16;
		}
		
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	
	
}
