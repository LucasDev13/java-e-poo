package br.com.poo.entities;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	public BusinessAccount () {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);//chama os atributos da super classe ou classe mãe.
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	
	
}
