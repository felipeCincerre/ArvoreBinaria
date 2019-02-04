package principal;

import model.No;

public class Principal {

	private static No raiz;
	
	public static void main(String[] args) {
		inserir(raiz, 10);
		inserir(raiz, 4);
		inserir(raiz, 5);
		inserir(raiz, 20);
		inserir(raiz, 2);
		inserir(raiz, 15);
		int qtde = 0;
		qtde = soma(raiz);
		System.out.println("Soma dos nós: " + qtde);
	}

	public static void inserir(No node, int valor) {
		if(node == null){
			raiz = new No(valor);
			System.out.println("Raiz: " + 10);
		}else{
			if(valor < node.getValue()){
				if(node.getNoEsquerda() != null){
					inserir(node.getNoEsquerda(), valor);

				}else{
					System.out.println("Inserindo " + valor + " à esquerda de " + node.getValue());
					node.setNoEsquerda(new No(valor));
				}
			}else{
				if(node.getNoDireita() != null){
					inserir(node.getNoDireita(), valor);
				}else{
					System.out.println("Inserindo " + valor + " à direita de " + node.getValue());
					node.setNoDireita(new No(valor));
				}
			}
		}
	}
	
	public static int soma(No node) {
		if(node == null){
			return 0;
		}
		return node.getValue() + soma(node.getNoEsquerda()) + soma(node.getNoDireita());
	}
}
