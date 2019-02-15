
public class Administrador extends Funcionario implements Autenticavel{
	private int senha;

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(senha == this.senha) {
			return true;
		}else {
			return false;
		}
	}

}
