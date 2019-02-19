/**
 * Classe que representa uma conta no ByteBank
 * @author Matheus Rodrigues do Amaral
 * @version 0.5
 */
package br.com.bytebank.banco.modelo;

public abstract class Conta implements Comparable<Conta>{
	protected double saldo;
	private double limite;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * @param agencia
	 * @param numero
	 */
	protected Conta(int agencia, int numero) {
		//System.out.println("Criando uma conta");
		this.agencia = agencia;
		//System.out.print(".");
		this.numero = numero;
		//System.out.print(".");
		this.saldo = 0; //toda conta comeca com 0 reais
		//System.out.print(".");
		this.limite = 0; //toda conta comeca com limite 0
		//System.out.print(".");
		//System.out.println("Conta Criada!");
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public double getLimite() {
		return this.limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + " - Agencia: " + this.agencia;
	}
	
	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;
		if(this.agencia != outra.agencia) {
			return false;
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser menor ou igual ao saldo
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException{
		if((this.saldo + this.limite) >= valor) {
			this.saldo -= valor;
		}else {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
	}

}
