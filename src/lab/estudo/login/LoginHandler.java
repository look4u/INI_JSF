package lab.estudo.login;

import java.io.Serializable;

public class LoginHandler implements Serializable {

	private static final long serialVersionUID = -6745740658516029417L;
	
	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		System.out.println("Mudando o login para : " + login);
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	

}
