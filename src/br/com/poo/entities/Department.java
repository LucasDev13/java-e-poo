package br.com.poo.entities;

public class Department {
	private String name;

	public Department() {
	}

	public Department(String name) {
		this.name = name;
	}

	// método get retorno um valor
	public String getName() {
		return name;
	}

	// método set nao retorna valor nenhum e guarda no atributo a valor passado por
	// parametro
	public void setName(String name) {
		this.name = name;
	}
}
