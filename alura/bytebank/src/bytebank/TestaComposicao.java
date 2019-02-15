package bytebank;

public class TestaComposicao {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.setTitular(new Cliente());
		conta1.getTitular().nome = "Marcos";
		
		Cliente clienteA = new Cliente();
		clienteA.nome = "Marcela";
		Conta conta2 = new Conta();
		conta2.setTitular(clienteA);
		
		System.out.println("O titular da primeira conta é: " + conta1.getTitular().nome);
		System.out.println("O titular da segunda conta é: " + conta2.getTitular().nome);

	}

}
