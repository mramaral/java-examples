
public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println("a: " + letra);
		
		char valor = 65;
		System.out.println("65: " + valor);
		
		valor = (char) (valor + 1);
		System.out.println("65+1: " + valor);
		
		String palavra = "mramaral.com";
		System.out.println("Meu site é: " + palavra);
		
		palavra = palavra + 443;
		System.out.println(palavra);
	}

}
