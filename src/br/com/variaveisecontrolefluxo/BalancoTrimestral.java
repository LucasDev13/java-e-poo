package br.com.variaveisecontrolefluxo;

public class BalancoTrimestral {
	public static void main(String[] args) {
		
		/**
		 * Exercicio de soma de valores gastos e a sua média 
		 */
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestrais = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("Gastos trimestrais: " + gastosTrimestrais);
		
		int mediaMensal = gastosTrimestrais / 3;
		System.out.println("Media mensal: " + mediaMensal);
	}
}
