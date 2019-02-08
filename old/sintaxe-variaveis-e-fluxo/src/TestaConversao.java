
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.70;
		int valor = (int) salario;
		System.out.println(valor);
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		double total = valor1 + valor2;
		System.out.println(total);
		
		float pontoFlutuante = 3.14f;
		float total2 = (float) total + pontoFlutuante;
		System.out.println(total2);
	}

}
