package metodosestaticos;

public class MetodoEstatico {
	
	public static int somar(int n1, int n2) {
		return n1 + n2;
	}	

	public static void main(String[] args) {
		
		// quando definimos um médoto como static ele não pertence mais ao objeto e sim a classe.
		//MetodoEstatico m = new MetodoEstatico();
		//System.out.println(m.somar(6, 4));
		
		System.out.println(MetodoEstatico.somar(6, 4));

	}
}
