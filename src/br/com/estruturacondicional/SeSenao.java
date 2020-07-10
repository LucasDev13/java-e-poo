package br.com.estruturacondicional;

import java.util.Scanner;

public class SeSenao {

	public static void main(String[] args) {
		
		int horario;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe um horario: ");
		horario = sc.nextInt();
		
		/**
		 * Sintaxe da estrutura condicional simples
		 */
		/*if (horario < 12) {
			System.out.println("Bom dia");
		}*/
		
		
		/**
		 * Sintaxe da estrutura condicional composta
		 */
		/*if (horario < 12 ) {
			System.out.println("Bom dia");
		}
		
		else {
			System.out.println("Boa tarde");
		}*/

		/**
		 *Sinta do encadeamento de estruturas condicionais
		 */
		if (horario < 12) {
			System.out.println("Bom dia");
		}else {
			if (horario < 18) {
				System.out.println("Boa tarde");
			}else {
				System.out.println("Boa noite");
			}
		}
		
		
		sc.close();
		
	}

}
