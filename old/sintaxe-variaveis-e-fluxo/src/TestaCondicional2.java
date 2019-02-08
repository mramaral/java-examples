
public class TestaCondicional2 {
	public static void main(String[] args) {
				System.out.println("Testando condicionais");
				
				int idade = 14;
				int pessoas = 1;
				boolean acompanhado = pessoas >=2;
				
				if (idade >= 18 || acompanhado) {
					System.out.println("Pode entrar!");
				}else {
					System.out.println("Vai pra casa moleque!");
				}
	}
}
