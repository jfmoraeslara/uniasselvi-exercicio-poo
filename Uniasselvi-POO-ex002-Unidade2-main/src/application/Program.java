package application;

public class Program {

	public static void main(String[] args) {
		
		Computadores comp = new Computadores();
		comp.setPreco(1200.00);
		comp.setMarca("Dell");
		comp.setMemoria(4);
		
		Microondas micro = new Microondas();
		micro.setPreco(1000.50);
		micro.setMarca("LG");
		micro.setAutolimpante(true);
		
		/*System.out.println("Computador");
		System.out.println("Preço: " + comp.getPreco());
		System.out.println("Marca: " + comp.getMarca());
		System.out.println("Memória: " + comp.getMemoria());
		
		System.out.println("----------------------------------");
		System.out.println("Microondas");
		System.out.println("Preço: " + micro.getPreco());
		System.out.println("Marca: " + micro.getMarca());*/
		
		//polimorfismo
		comp.promocao();
		micro.promocao();
		
	}
}
