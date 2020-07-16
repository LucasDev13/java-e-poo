package br.com.poo.entities;

public class Product {
	
	private String nomeProduto;
	private double preco;
	private int quantidade;
	private int estoqueMaximo;
	private int estoqueMinimo;
	
	public Product() {
	}
	
	//contrutor com todos os parametros
	public Product (String nomeProduto, double preco, int quantidade) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//sobrecarga de construtor sem o atributo de quantidade
	public Product (String nomeProduto, double preco) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}
	
	
	//metodos getters e setters
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuanidade() {
		return quantidade;
	}
	
	//servira para inserir a primeira quantidade no estoque
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double totalValorEmEstoque() {
		return preco * quantidade;
	}
	
	/**
	 * Esse método trabalho com a inclusao de mais produtos no estoque 
	 * e trabalha com limite de estoque que e de 20. Verificanco qual e o limite e nao deixando incluir mais itens
	 * 
	 * 
	 * @param quantidade
	 */
	public Product[] addProdutos(Product[] vect, int i, int quantidade, String nomeProduto, double preco) {
		int cont = 0;
		System.out.println("vai comecar.");//essa verificação será quando o estoque estivar no maximo.
		if(this.quantidade <= quantidade) {
			System.out.println("inserido...");
			if(cont > i || cont == 0) {
				//esse vetor está ficando localmente com apenas um valor.
				//colocar um return ???
				
				//não está atualizando o indice do vetor.
				vect[i] = new Product(nomeProduto, preco, quantidade);
			}
			//this.quantidade += quantidade;
		}else {
			System.out.println("EXCEDEU O LIMITE DO ESTOQUE!");
		}
		return vect;//precisa retornar no final do método.
	}
	
	/**
	 * Esee método trabalha com a exclusao de itens do estoque
	 * e com estoque minimo que é de 5. Verificando o estoque minimo e nao deixando excluir intens alem da cota minima.
	 * @param quantidade
	 */
	public void removeProdutos(int quantidade) {
		//quanto o estoque for igual a 20, nao conseguimos excluir itens, nem que seja somente 1.
		if(quantidade >= estoqueMinimo) {
		this.quantidade -= quantidade;
		}else {
			System.out.println("EXCEDEU O ESTOQUE MINIMO, EXCLUSÃO NÃO PERMITIDA!");
		}
	}

	/**
	 *@Override indica que este método sobrescreve o metodo toString da classe Object
	 *Assim pode ser feito alterações neste método 
	 */
	@Override
	public String toString() {
		return "Dados do produto: "
				+ "Nome: "
				+ nomeProduto
				+ ", Valor: $"
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " unidades, Valor total em estoque: $ "
				+ String.format("%.2f", totalValorEmEstoque());
	}
	
	
}
