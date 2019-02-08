package bytebank;

public class TestaCliente {
	public static void main(String[] args) {
		Cliente Joao = new Cliente();
		Joao.setNome("Joal Dias Amaral");
		Conta contaDoJoao = new Conta(10123, 5, Joao);
		contaDoJoao.setTitular(Joao);
		System.out.println(contaDoJoao.getTitular().getNome());
	}
}
