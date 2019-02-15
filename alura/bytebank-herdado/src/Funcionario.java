
public abstract class Funcionario {
	String nome;
	String cpf;
	double salario;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return this.cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonificacao();

}
