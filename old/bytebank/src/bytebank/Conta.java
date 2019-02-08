package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int conta;
	private Cliente titular;
	
	private static int total = 0;
	
	public Conta(int agencia, int conta, Cliente titular) {
		if (agencia > 0) {
			this.agencia = agencia;
		}else {
			this.agencia = 0;
			System.out.println("Valor da agencia inválido, alterar com urgencia");
		}
		if (conta > 0) {
			this.conta = conta;
		}else {
			this.conta = 0;
			System.out.println("Valor da conta inválido, alterar com urgencia");
		}
		this.titular = titular;
		this.saldo = 0.1;
		total ++;
		System.out.println("Criei uma conta");
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int numero) {
		if (numero > 0) {
			this.agencia = numero;
		}else {
			System.out.println("Valor da agencia deve ser positivo e maior que zero!");
		}
		
	}
	
	public int getConta() {
		return this.conta;
	}
	public void setConta(int conta) {
		if (conta > 0) {
		this.conta = conta;
		}else {
			System.out.println("Valor da conta deve ser positivo e maior que zero!");
		}
	}
	
	public Cliente getTitular(){
		return this.titular;
	}
	public void setTitular(Cliente cliente) {
		this.titular = cliente;
	}
	
	public int getTotal() {
		return Conta.total;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(valor > this.saldo) {
			return false;
		}else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public boolean transfere(double valor, Conta conta) {
		if(valor > this.saldo) {
			return false;
		}else {
			this.saldo -= valor;
			conta.deposita(valor);
			return true;
		}
	}
	
}
