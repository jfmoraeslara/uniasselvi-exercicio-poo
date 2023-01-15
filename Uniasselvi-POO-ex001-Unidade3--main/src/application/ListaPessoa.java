package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListaPessoa {
	
	public static void main(String[] args) {
		
		List<Pessoa> lista = new ArrayList<>();
		
		Pessoa p1 = new Pessoa("João", 18);
		Pessoa p2 = new Pessoa("Maria", 30);
		Pessoa p3 = new Pessoa("Pedro", 23);
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		for (Pessoa p : lista) {
			System.out.println("Nome: " + p.getNome() + " e idade: " + p.getIdade());	
		}
		
		System.out.println("--------------------------");
		//método sort para fazer a ordenação
		Collections.sort(lista);
		for (Pessoa p: lista) {
			System.out.println("Nome: " + p.getNome() + " e idade: " + p.getIdade());
		}
	}
}
