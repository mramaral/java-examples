package br.com.bytebank.banco.modelo;

public class CalculadorDeImposto {
	private double totalImposto;
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
	public void registro(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}

}
