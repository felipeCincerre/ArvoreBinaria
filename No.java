package model;

public class No {
	private int value;
	private No noEsquerda;
	private No noDireita;
	
	public No(int valor){
		this.value = valor;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public No getNoEsquerda() {
		return noEsquerda;
	}
	public void setNoEsquerda(No noEsquerda) {
		this.noEsquerda = noEsquerda;
	}
	public No getNoDireita() {
		return noDireita;
	}
	public void setNoDireita(No noDireita) {
		this.noDireita = noDireita;
	}
	
}
