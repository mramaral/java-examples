
public class TesteAutenticavel {

	public static void main(String[] args) {
		int senha = 8163264;
		
		Gerente g1 = new Gerente();
		Cliente c1 = new Cliente();
		Administrador a1 = new Administrador();
		SistemaInterno si = new SistemaInterno();
		
		g1.setSenha(128256);
		c1.setSenha(8163264);
		a1.setSenha(863264);
		
		System.out.println("--- g1 ---");
		si.autentica(g1);
		System.out.println("--- c1 ---");
		si.autentica(c1);
		System.out.println("--- a1 ---");
		si.autentica(a1);

	}

}
