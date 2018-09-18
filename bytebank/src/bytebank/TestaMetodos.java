package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		Cliente jose = new Cliente();
		Conta conta1 = new Conta(3456, 0003, jose );
		Conta conta2 = new Conta(0, 00004, jose);
		
		conta1.deposita(300);
		conta2.deposita(200);
		
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
		System.out.println(conta2.transfere(250, conta1));
		System.out.println(conta1.saca(500));
		System.out.println(conta1.transfere(50, conta2));
		System.out.println(conta1.saca(50));
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
	}

}
