
public abstract class Conta {
	protected double saldo;
	private double limite;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public Conta(int agencia, int numero) {
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
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if((this.saldo + this.limite) >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}

}
