
public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 14;
		int pessoas = 1;
		boolean acompanhado;
		
		if (pessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Pode entrar!");
		}else {
			System.out.println("Vai pra casa moleque!");
		}
	}
}
