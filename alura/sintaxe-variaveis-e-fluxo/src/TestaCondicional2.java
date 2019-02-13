
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 15;
		int qtdPessoas = 4;
		boolean acompanhado = qtdPessoas >= 2;
		
		System.out.println("------Maior de 18 OU acompanhado-----");
		
		if(idade >= 18 || qtdPessoas >= 2) {
			System.out.println("Seja bem vindo");
		} else {
				System.out.println("Infelizmente voce nao pode entrar");
		}
		
		System.out.println("------Maior de 18 E acompanhado-----");
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}
	}
}
