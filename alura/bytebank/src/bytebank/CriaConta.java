package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		segundaConta.deposita(50);
		
		System.out.println("Primeira conta tem: " + primeiraConta.getSaldo() + " - " + primeiraConta);
		System.out.println("Segunda conta tem: " + primeiraConta.getSaldo() + " - " + segundaConta);
	}

}
