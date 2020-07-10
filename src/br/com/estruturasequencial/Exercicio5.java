package br.com.estruturasequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/**
		 *  Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
			hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
			decimais.*/
		
		int numeroFuncionario;
		double horasTrabalhadas;
		double valorHora;
		double salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero do funcionario: ");
		numeroFuncionario = sc.nextInt();
		
		System.out.println("informe o numero de horas: ");
		horasTrabalhadas = sc.nextDouble();
		
		System.out.println("informe o valor da hora: ");
		valorHora = sc.nextDouble();
		
		salario = valorHora * horasTrabalhadas;
		
		System.out.println("salario do funcionario " + numeroFuncionario + " é: " + salario);
		
		
		
	}
}

