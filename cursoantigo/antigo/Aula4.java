class Empresa {
	String nome;
	String cnpj;
	Funcionario funcionarios;
	int livre = 0;
	
	void adicionar(Funcionario f){
		this.funcionarios[livre] = f;
		livre++
	}
}

class TestaEmpresa {
	
		Empresa amil = new Empresa();
		amil.funcionarios = new Funcionario[10];
}