class Data {
	int dia;
	int mes;
	int ano;
}

class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data dataEntradaBanco;
	String rg;
	
	void recebeAumento(double valor) {
		this.salario += valor;
	}
	
	double calculaGanhoAnual() {
		return this.salario * 12;
	}
	
	void mostra() {
		System.out.println("\n");
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("RG:" + this.rg);
		System.out.println("Data de Entrada: " + this.dataEntradaBanco.dia + "/" + this.dataEntradaBanco.mes + "/" + this.dataEntradaBanco.ano);
		System.out.println("Salario: R$" + this.salario);
		System.out.println("Ganho Anual: R$" + this.calculaGanhoAnual());
		System.out.println("--------------------------------------------------\n");
	}
}

class Programa {
	public static void main(String[] args) {
		Funcionario Joao = new Funcionario();
		
		Joao.nome = "Joao da Silva Ramos";
		Joao.salario = 1000;
		
		System.out.println("\n");
		
		System.out.println("Salario atual do " + Joao.nome + " e " + Joao.salario);
		System.out.println("Ganho anual do " + Joao.nome + " e " + Joao.calculaGanhoAnual());
		System.out.println("--------------------------------------------------\n");
		
		Joao.recebeAumento(400);
		System.out.println(Joao.nome + " ganhou um aumento!");
		System.out.println("--------------------------------------------------\n");
		
		System.out.println("Salario atual do " + Joao.nome + " e " + Joao.salario);
		System.out.println("Ganho anual do " + Joao.nome + " e " + Joao.calculaGanhoAnual());
		System.out.println("--------------------------------------------------\n");
	}
}

class Programa2 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();        
        f1.nome = "Danilo";
        f1.salario = 100;

        Funcionario f2 = new Funcionario();        
        f2.nome = "Danila";
        f2.salario = 1000;

        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");        
        }
	}
}

class Programa3 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Hugo";
		f1.salario = 100;

		Funcionario f2 = f1;

        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");        
        }
	}
}

class Programa4 {
	public static void main(String[] args) {
		Funcionario Joao = new Funcionario();
		
		Joao.nome = "Joao da Silva Ramos";
		Joao.salario = 1000;
		Data entrada = new Data();
		entrada.dia = 10;
		entrada.mes = 11;
		entrada.ano = 2016;
		Joao.dataEntradaBanco = entrada;
		
		System.out.println("\n");
		
		System.out.println("Salario atual do " + Joao.nome + " e " + Joao.salario);
		System.out.println("Ganho anual do " + Joao.nome + " e " + Joao.calculaGanhoAnual());
		System.out.println("--------------------------------------------------\n");
		
		Joao.recebeAumento(400);
		System.out.println(Joao.nome + " ganhou um aumento!");
		System.out.println("--------------------------------------------------\n");
		
		System.out.println("Salario atual do " + Joao.nome + " e " + Joao.salario);
		System.out.println("Ganho anual do " + Joao.nome + " e " + Joao.calculaGanhoAnual());
		System.out.println("--------------------------------------------------\n");
		
		Joao.mostra();
	}
}