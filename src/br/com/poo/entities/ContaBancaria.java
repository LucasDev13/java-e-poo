package br.com.poo.entities;

public class ContaBancaria {
	public final int DESCONTO = 5;
	private int numeroConta;// apos criado a conta o valor nunca pode ser alterado, nao vai ter o metodo set
	private String nomeTitularConta;
	private double valorDeposito;
	private double saldoConta;// esse valor nunca pode ser alterado livremente

	// construtor criado para criar uma conta bancaria
	public ContaBancaria(int numeroConta, String nomeTitularConta, double valorInicialDeposito) {
		this.numeroConta = numeroConta;
		this.nomeTitularConta = nomeTitularConta;
		this.saldoConta = valorInicialDeposito;
	}
	
	//construtor que passa so o numero da conta e o nome do titular
	public ContaBancaria(int numeroConta, String nomeTitularConta) {
		this.numeroConta = numeroConta;
		this.nomeTitularConta = nomeTitularConta;
	}

	public double depositar(double valorDeposito) {
		System.out.println("foi!!");
		return this.saldoConta += valorDeposito;
	}
	
	public void sacar(double valorSaque) {
		System.out.println("vai");
		this.saldoConta -= valorSaque ;
		this.saldoConta -= DESCONTO;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitularConta() {
		return nomeTitularConta;
	}

	public void setNomeTitularConta(String nomeTitularConta) {
		this.nomeTitularConta = nomeTitularConta;
	}

	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}
	
	public double getSaldoConta() {
		return saldoConta;
	}
	
	public String toString() {
		return "Dados da conta: "
				+ "Numero da conta: "
				+ numeroConta
				+ ", Nome do titular: "
				+ nomeTitularConta
				+ ", Saldo da conta: "
				+ saldoConta;
	}

}
