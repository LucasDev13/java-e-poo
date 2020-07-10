package br.com.estruturasequencial;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);//Utilizado para pegar o valor com ponto e apresentar no console o resultado com ponto.
		//Leitura de dados por meio do teclado
		//Leitura de uma unica palavra
		Scanner sc = new Scanner(System.in);
//		System.out.print("Digite uma palavra: ");
//		String a;
//		a = sc.next();
//		System.out.println("Valor: " + a);
//		
//		//leitura de número inteiro
//		System.out.print("Digite um numero inteiro: ");
//		int b;
//		b = sc.nextInt();
//		System.out.println("Valor: " + b);
//		
//		//Leitura de ponto flutuante
//		System.out.print("Digite um número com ponto flutuante: ");
//		double c;
//		c = sc.nextDouble();
//		System.out.printf("Valor: %.2f%n", c);
//		
//		//Leitura de caracter
//		System.out.print("Digite uma letra ou palavra: ");
//		char d;
//		d = sc.next().charAt(2);//ira dar erro se for digitado somente uma letra, caso contrario sera pego a letra da palavra digitada apartir do indice.
//		System.out.println("Valor: " + d);
//
//		//Leitura de vários dados na mesma linha
//		System.out.print("Digite uma palavra, um inteiro e um ponto flutuante: ");
//		String e; int f; double g;
//		e = sc.next();
//		f = sc.nextInt();
//		g = sc.nextDouble();
//		System.out.println("Valores1: " + e + ", Valor2: " + f + ", Valor3: " + g );
		
		int h;
		String s1, s2, s3;
		h = sc.nextInt();
		sc.nextLine();//para evitar o buffer de leitura ou quebra de linha pendente
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		
		System.out.println("Dados digitados: ");
		System.out.println(h);		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		sc.close();
	}

}
