package br.com.aula15;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		
		System.out.println("Informe um o valor da semana: ");
		int dia = scaner.nextInt();
		
		/*switch (dia) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda");
			break;
		case 3:
			System.out.println("terça");
			break;
		case 4:
			System.out.println("quarta");
			break;
		case 5:
			System.out.println("quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;
		case 7:
			System.out.println("sabado");
			break;
		default: System.out.println("Não é um dia da semana");
			break;
		}*/
		
		switch (dia) {
		case 1:
			System.out.println("domingo");
			
		case 2:
			System.out.println("segunda");
			
		case 3:
			System.out.println("terça");
			
		case 4:
			System.out.println("quarta");
			
		case 5:
			System.out.println("quinta");
			break; //ira mostrar todos os outros dias da semana ate encontrar o break.
		case 6:
			System.out.println("sexta");
			
		case 7:
			System.out.println("sabado");
			
		default: System.out.println("Não é um dia da semana");
			break;
		}
		
		
	}
}
