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
		//System.out.println("Data de Entrada: " + this.dataEntradaBanco.dia + "/" + this.dataEntradaBanco.mes + "/" + this.dataEntradaBanco.ano);
		System.out.println("Salario: R$" + this.salario);
		System.out.println("Ganho Anual: R$" + this.calculaGanhoAnual());
		System.out.println("--------------------------------------------------\n");
	}
}

class Empresa {
	String nome;
	String cnpj;
	Funcionario[] funcionarios = new Funcionario[10];
	int livre = 0;
	
	void adicionar(Funcionario f){
		this.funcionarios[livre] = f;
		livre++;
	}
	
	void mostraEmpregados() {
		for (int i = 0; i < this.funcionarios.length; i++) {
					this.funcionarios[i].mostra();
				}
	}
}

class TestaEmpresa {
	public static void main(String[] args) {
				Empresa amil = new Empresa();
				
				for (int i = 0; i < 5; i++) {
					Funcionario f = new Funcionario();
					f.salario = 1000 + i * 100;
					amil.adicionar(f);
				}
				
				for (int i = 0; i < 5; i++) {
					amil.funcionarios[i].mostra();
				}
		}
}

class TestaEmpresa2 {
	public static void main(String[] args) {
				Empresa amil = new Empresa();
				
				for (int i = 0; i < 5; i++) {
					Funcionario f = new Funcionario();
					f.salario = 1000 + i * 100;
					amil.adicionar(f);
				}
				
				amil.mostraEmpregados();
		}
}