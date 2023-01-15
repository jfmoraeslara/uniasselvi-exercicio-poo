package excecoes;

public class Excecoes {
	
	static int numeros[] = new int[5];
	
	static void popularVetor() {
		for (int i = 0; i <= numeros.length; i++) {
			try {
				numeros[i] = i+1; 
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Erro neste método - popular");
			}			
		}
		System.out.println("Terminou o método popularVetor");
	}
	
	static void mostrarVetor() {
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i]);
			} catch (Exception e) {
				System.err.println("Erro neste método - mostrar");
			}
			
		}
		System.out.println("Terminou o método mostrarVetor");
	}

	public static void main(String[] args) {
		
		popularVetor();
		mostrarVetor();
		System.out.println("Fim do programa");
		
	}
}
