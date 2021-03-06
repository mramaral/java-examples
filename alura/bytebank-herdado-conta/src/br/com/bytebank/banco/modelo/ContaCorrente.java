package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override
	public String toString() {
		return "ContaPoupanca: " + super.toString();
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double custo = valor + 0.2;
		super.saca(custo);
	}
	
	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
