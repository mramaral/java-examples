package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Cliente jose = new Cliente();
		
		Conta primeiraConta = new Conta(1323, 0001, jose);
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(1323, 0002, jose);
		segundaConta.deposita(50);
		System.out.println(segundaConta.getSaldo());
		
		System.out.println("A primeira conta " + primeiraConta + " tem " + primeiraConta.getSaldo());
		System.out.println("A segunda conta " + segundaConta + " tem " + segundaConta.getSaldo());
	}

}
