package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta teste1 = new Conta();
		Conta teste2 = new Conta();
		Conta teste3 = new Conta();
		
		teste1.deposita(300.0);
		teste2.deposita(500);
		teste3.deposita(300+500);
		
		teste1.saca(100);
		teste2.saca(1000.0);
		
		teste3.transfere(1000, teste2);
		teste2.transfere(400, teste1);
		
		System.out.println("Saldo da Primeira Conta: " + teste1.saldo);
		System.out.println("Saldo da Segunda Conta: " + teste2.saldo);
		System.out.println("Saldo da Terceira Conta: " + teste3.saldo);
	}

}
