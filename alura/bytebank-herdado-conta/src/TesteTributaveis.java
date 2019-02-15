
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente(333, 999);
		SeguroDeVida sv1 = new SeguroDeVida();
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		cc1.deposita(500.0);
		
		calc.registro(cc1);
		calc.registro(sv1);
		
		System.out.println("Total de Imposto: " + calc.getTotalImposto());

	}

}
