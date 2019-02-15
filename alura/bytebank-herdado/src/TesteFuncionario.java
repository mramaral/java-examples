
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario nico = new Funcionario();
		
		nico.setNome("Nico Steppat");
		nico.setCPF("220120956");
		nico.setSalario(2490.85);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
