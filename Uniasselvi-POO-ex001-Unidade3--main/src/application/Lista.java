package application;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("João");
		lista.add("Maria");
		lista.add("Pedro");

		for (String s : lista) {
			System.out.println("Nome: " + s);
		}
		
		System.out.println("------------------");
		lista.remove("João");
		for (String s : lista) {
			System.out.println("Nome: " + s);
		}		
	}
}
