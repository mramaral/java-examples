package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(123, 321);
		cc.deposita(300);
		
		ContaPoupanca cp = new ContaPoupanca(248, 163);
		cp.deposita(300.0);
		
		try {
			cc.transfere(400, cp);
		}catch(SaldoInsuficienteException ex) {
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
