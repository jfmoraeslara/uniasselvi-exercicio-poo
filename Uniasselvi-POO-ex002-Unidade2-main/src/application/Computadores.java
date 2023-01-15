package application;

public class Computadores extends Produtos {
	/*
	 * trabalhando encapsulamento alguns tipos existentes public, private,
	 * protected, em branco
	 */
	private String processador;
	private int memoria;
	private String sistemaOper;
	private int armazenamento;

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getSistemaOper() {
		return sistemaOper;
	}

	public void setSistemaOper(String sistemaOper) {
		this.sistemaOper = sistemaOper;
	}

	public int getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}

	// polimorfismo
	public void promocao() {
		System.out.println("O produto computador está em promoção com 15% de desconto.");
	}
}
