package br.com.estruturasequencial;

public class ProcessamentoDados {
	public static void main(String[] args) {
		int x, y;
		x = 5;
		
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		int a;
		a = 5;
		double c;
		c = 2 * x;
		
		System.out.println(a);
		System.out.println(c);
		
		System.out.println("-----------------------------------------------------------------");
		
		//calculo de area
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		System.out.println("Area: " + area);
		
		System.out.println("-----------------------------------------------------------------");
		
		int var1;
		int var2;
		double resultado;
		var1=5; var2=2;
		//resultado = var1/var2;// o resultado desse calculo será 2.0, porque são numeros int e o compilador irá descartar o resto do resultado
		resultado = (double) var1/var2;//o processo de colocar o (double) se chama casting
		System.out.println("resultado: " + resultado);
				
		System.out.println("-----------------------------------------------------------------");
		
		double var3;
		int var4;
		var3 = 5.0;
		//var4 = var3;//nesta linha o compilador entede que você terá uma perca de informação e mostra que tem um erro
		var4 = (int) var3;//esta linha esta sendo feito um casting de double (var3) para int (var4) sem se importar com a perca de dados.
 		System.out.println(var4);
		
	}
}
