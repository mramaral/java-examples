
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 321);
		cc.deposita(300);
		
		ContaPoupanca cp = new ContaPoupanca(248, 163);
		cp.deposita(300.0);
		
		cc.transfere(15, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
