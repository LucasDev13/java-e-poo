package br.com.estruturasequencial;

import java.util.Locale;

public class SaidaDados {

	public static void main(String[] args) {
		
		System.out.print("Bom dia!");//sem quebra de linha
		System.out.println("Bom dia!");//com quebra de lina
		System.out.println("Bom dia!");//com quebra de lina

		int y = 32;
		
		System.out.println(y);
		
		double x = 10.35784;
		
		System.out.println("Sem formatação: " + x);//sem formatação
		System.out.printf("Duas casas: " + "%.2f%n", x);//com formatação de duas casas decimais
		System.out.printf("Três casas: " + "%.3f%n", x);//com formatação de três casas decimais
		System.out.printf("Quatro casas: " + "%.4f%n", x);//com formatação de quatro casas decimais
		
		Locale.setDefault(Locale.US);//confiração do separador de virgula (,) para ponto (.)
		System.out.printf("Com separador de ponto (.) -> " + "%.4f%n", x);//com formataçao de quatro casas decimais e com separador com ponto(.)
		
	}

}
