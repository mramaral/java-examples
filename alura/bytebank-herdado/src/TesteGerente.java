
public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Marco");
		g1.setCPF("29748601");
		g1.setSalario(6000.0);
		
		System.out.println("--Gerente--");
		System.out.println("Nome: " + g1.getNome());
		System.out.println("CPF: " + g1.getCPF());
		System.out.println("Salario: " + g1.getSalario());
		System.out.println("Bonificação: " + g1.getBonificacao());
		
		g1.setSenha(4242);
		System.out.println("Autenticação: " + g1.autentica(4222));
	}

}
