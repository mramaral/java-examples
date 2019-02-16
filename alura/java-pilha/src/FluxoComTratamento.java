
public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		}catch(ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exeção: " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Ini do metodo 1");
		System.out.println("--- Try dentro do metodo 2 ---");
		metodo2();
		System.out.println("--- Try dentro do metodo 1 ---");
		try {
			metodo3();
		}catch(ArithmeticException ex) {
			String msg = ex.getMessage();
			System.out.println("ArithmeticException: " + msg);
			ex.printStackTrace();
		}
		System.out.println("--- Metodo 4 ---");
		metodo4();
		System.out.println("Fim do metodo 1");
	}
	
	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try{
				int a = i / 0;
				System.out.println(a);
			}catch(ArithmeticException ex) {
				System.out.println("ArithmeticException");
			}
		}
		System.out.println("Fim do metodo2");
	}
	
	private static void metodo3() {
		System.out.println("Ini do metodo2");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			int a = i / 0;
			System.out.println(a);
		}
		System.out.println("Fim do metodo2");
	}
	
	private static void metodo4() {
		System.out.println("Ini do metodo2");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			//Conta c = null;
			//c.deposita();
		}
		System.out.println("Fim do metodo2");
	}

}
