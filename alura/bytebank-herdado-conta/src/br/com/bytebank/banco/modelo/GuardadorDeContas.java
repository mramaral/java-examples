package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	private Object[] referencias;
	private int posicaoLivre;
	
	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}
	
	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
	
	public GuardadorDeContas() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

}
