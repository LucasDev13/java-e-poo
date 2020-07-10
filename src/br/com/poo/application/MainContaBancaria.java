package br.com.poo.application;

import java.util.Scanner;

import br.com.poo.entities.ContaBancaria;

public class MainContaBancaria {

	public static void main(String[] args) {

		ContaBancaria conta;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o numero da conta: ");
		int numConta = sc.nextInt();
		
		System.out.print("Informe o nome do titular: ");
		sc.nextLine();
		String nomeTitular = sc.next();
		
		System.out.print("Você quer depositar um valor inicial: (y/n)");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Informe o valor inicial a se depositar: ");
			double valorInicialDeposito = sc.nextDouble();
			conta = new ContaBancaria(numConta, nomeTitular, valorInicialDeposito);//sobrecarga
		}else {
			conta = new ContaBancaria(numConta, nomeTitular);//sobrecarga
		}
		
		System.out.println();
		System.out.println(conta.toString());
		
		
		System.out.println("Valor para depositar: ");
		double depositValue = sc.nextDouble();
		conta.depositar(depositValue);
		System.out.println("Update account data:");
		System.out.println(conta.toString());
		
		System.out.println();
		System.out.println("Valor do saque: ");
		double withdrawValue = sc.nextDouble();
		conta.sacar(withdrawValue);
		System.out.println(conta.toString());

		sc.close();
	}

}
