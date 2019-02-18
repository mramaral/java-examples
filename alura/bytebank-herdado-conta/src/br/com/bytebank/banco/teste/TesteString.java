package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Luigi"; //object literal
		String outro = new String("Alura"); //má prática, sempre prefira a sintaxe literal
		
		String novo = outro.replace("A", "a");
		System.out.println(novo);
		
		novo = nome.toLowerCase();
		System.out.println(novo);
		
		novo = outro.toUpperCase();
		System.out.println(novo);
		
		char c = nome.charAt(3); //char i
		System.out.println(c);
		
		int pos = nome.indexOf("ig");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

	}

}
