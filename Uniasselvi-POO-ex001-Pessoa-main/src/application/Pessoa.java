package application;

public class Pessoa {
	// criando atributos e m�todos para a classe Pessoa
	String nome;
	int idade;
	
	void falar() {
		System.out.println("Ol�, tudo bem?");
	}

	public static void main(String[] args) {
		// criando uma inst�ncia ou objeto
		Pessoa p1 = new Pessoa();
		p1.nome = "Ana";
		p1.idade = 19;
		
		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade: " + p1.idade);
		p1.falar();
		
		System.out.println("-------------------------");
		Pessoa p2 = new Pessoa();
		p2.nome = "Paulo";
		p2.idade = 30;
		
		System.out.println("Nome: " + p2.nome);
		System.out.println("Idade: " + p2.idade);
		p2.falar();

	}
}
