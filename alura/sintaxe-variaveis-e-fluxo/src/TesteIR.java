
public class TesteIR {
	public static void main(String[] args) {
		double salario = 4000.0;
		
		if(salario <= 2800.0 && salario >= 1900) {
			System.out.println("aliquota 7%");
			System.out.println("IR: " + salario*0.07);
			System.out.println("deducao: 142");
		}else if(salario <= 3751.0) {
			System.out.println("aliquota 15%");
			System.out.println("IR: " + salario*0.15);
			System.out.println("deducao: 350");
		}else if(salario <= 4664.0) {
			System.out.println("aliquota 22.5%");
			System.out.println("IR: " + salario*0.225);
			System.out.println("deducao: 636");
		}
	}

}
