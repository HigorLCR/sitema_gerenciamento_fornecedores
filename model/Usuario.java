package model;

public class Usuario {
	private String login;
	private String senha;

	public Usuario(String l, String s) {
		login=l;
		senha=s;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean validacao(String l, String s) {
		if(l.equals("user") && s.equals("12345"))
			return true;
		else
			return false;
	}

}
