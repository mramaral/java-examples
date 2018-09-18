
public class TestaLaco2 {
	public static void main(String[] args) {
		for(int linha = 1; linha <= 4; linha++) {
			for(int coluna = 1; coluna <=4; coluna++) {
				if(coluna > linha) {
					System.out.print("0");;
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int linha = 1; linha <= 10; linha++) {
			for(int coluna = 1; coluna < linha; coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
