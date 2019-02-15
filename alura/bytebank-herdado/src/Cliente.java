
public class Cliente implements Autenticavel {
	private String nome;
	private String cpf;
	private String profissao;
	private int senha;
	
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
