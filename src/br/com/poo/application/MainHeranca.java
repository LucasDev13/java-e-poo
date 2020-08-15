package br.com.poo.application;

import br.com.poo.entities.Account;
import br.com.poo.entities.BusinessAccount;
import br.com.poo.entities.SavingsAccount;

public class MainHeranca {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Lucas", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Thais", 0.0, 500.0);
		
		//UPCASTING - atribuir um objeto da subclasse para a super-classe
		Account acc1 = bacc;//Atribuo o objeto bacc para acc1; //isso é possivel porque businessAccount é uma Account
		acc1.getBalance();
		
		Account acc2 = new BusinessAccount(1003, "Maria", 0.0, 5000.0);//não da nenhum erro porque estou atribuindo um objeto da subclasse para a super-classe
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.10);//não da nenhum erro porque estou atribuindo um objeto da subclasse para a super-classe
		
		//DOWNCASTING - Converter um objeto para super-classe para a sub-classe
		
		BusinessAccount bacc1 = (BusinessAccount) new Account();//precisa fazer o casting de Account para BusinessAccount
		SavingsAccount sacc = (SavingsAccount) new Account();
	}

}
