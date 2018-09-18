class BalancoTrimestral {
	public static void main(String[] args) {
		int gastosJaneiro = 150000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastoTrimeste= gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("Gasto do Trimestre foi: " + gastoTrimeste + "\n");
		int mediaMensal = gastoTrimeste / 3;
		System.out.println("Valor da media mensal =" + mediaMensal);
	}
}

class Numeros {
	public static void main(String[] args) {
		int i = 150;
		while ( i < 300 ) {
			System.out.println("Numero = " + i);
			i++;
		}
	}
}

class Somatorio {
	public static void main(String[] args){
		int s = 0;
		int i = 1;
		
		while ( i <= 1000 ) {
			s = s + i;
			i++;
		}
		
		System.out.println("Somatorio = " + s);
	}
}

class Multiplos {
	public static void main(String[] args) {
		int i = 0;
		int f = 100;
		int m = 3;
		
		while ( i%m != 0) {
			i++;
		}
		
		for (int v = i; v <= f; v = v + m) {
			System.out.println("Multiplo -> " + v);
		}
	}
}

class Fatoriais {
	public static void main(String[] args) {
		int min = 1;
		int max = 20;
		
		while (min <= max) {
			int fat = 1;
			for (int i = fat; i <= min; i++) {
				fat = fat * i;
			}
			System.out.println("O fatorial de " + min + " e " + fat);
			min++;
		}
	}
}

class FatoriaisLong {
	public static void main(String[] args) {
		long min = 1;
		long max = 20;
		
		while (min <= max) {
			long fat = 1;
			for (long i = fat; i <= min; i++) {
				fat = fat * i;
			}
			System.out.println("O fatorial de " + min + " e " + fat);
			min++;
		}
	}
}

class NovoX {
	public static void main(String[] args){
		int x = 13;
		System.out.println(">");
		while ( x =! 1) {
			if (x%2 == 0) {
				x = x/2;
			}
			else {
				x = 3 * (x +1);
			}
			System.out.println(x)