package atributosestaticos;

public class Cidades {
	
	public static String cidade = "Curitiba";

	public static void main(String[] args) {
		
		Cidades c1 = new Cidades();
		Cidades c2 = new Cidades();		
		
		System.out.println(c1.cidade);
		System.out.println(c2.cidade);
		
		System.out.println("---------------");
		c1.cidade = "S�o Paulo";
		
		System.out.println(c1.cidade);
		System.out.println(c2.cidade);
		
		System.out.println("---------------");
		c1.cidade = "S�o Paulo";
		c2.cidade = "Rio de Janeiro";
		
		System.out.println(c1.cidade);
		System.out.println(c2.cidade);
		System.out.println(Cidades.cidade);

	}
}
