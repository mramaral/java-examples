
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 15;
		int qtdPessoas = 4;
		
		if(idade >= 18) {
			System.out.println("Você tem mais que 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (qtdPessoas >= 2) {
				System.out.println("Voce nao tem 18 anos, mas pode entrar, pois está acompanhado");
			} else {
				System.out.println("Infelizmente voce nao pode entrar");
			}
		}
	}

}
