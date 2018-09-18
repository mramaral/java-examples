// 1.903,98 Isento
//2.826,65 7,5 142,80
//3.751,05 15 354,80
//4.664,68 22,5 636,13
//>4.664,68 27,5 869,36


public class TesteIR {
	public static void main(String[] args) {
		double salario = 3300.0;
		boolean isento = false;
		double deduzir = 0.0;
		double aliquota = 0.0;
		
		if (salario <= 1903.98) {
			isento = true;
		}else {
			if (salario <= 2826.65) {
				deduzir = 142.0;
				aliquota = 7.5;
			}
			else {
				if (salario <= 3751.05) {
					deduzir = 354.80;
					aliquota = 15.0;
				}
				else {
					if (salario <= 4664.68) {
						deduzir = 636.13;
						aliquota = 22.5;
					}
					else {
						deduzir = 869.36;
						aliquota = 27.5;
					}
				}
			}
		}
		if (isento) {
			System.out.println("Você é Isento de Imposto de renda");
		}
		else {
			System.out.println("Sua alíquota é " + aliquota + "% e você pode deduzir " + deduzir);
		}
	}
}
