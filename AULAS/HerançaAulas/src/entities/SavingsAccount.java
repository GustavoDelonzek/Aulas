package entities;

public final class SavingsAccount extends Account{
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.setInterestRate(interestRate);
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updatedBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(Double amount) {
		balance -= amount;
	}
	
}
