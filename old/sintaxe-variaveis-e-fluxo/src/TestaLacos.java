
public class TestaLacos {
	public static void main(String[] args) {
		for(int multiplicador = 0; multiplicador <= 10; multiplicador++) {
			for(int multiplicado = 0; multiplicado <= 10; multiplicado++) {
				int resultado = multiplicado * multiplicador;
				System.out.println(multiplicador + " X " + multiplicado + " = " + resultado);
			}
		}
	}

}
