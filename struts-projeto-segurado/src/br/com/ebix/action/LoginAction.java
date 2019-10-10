package br.com.ebix.action;

import com.opensymphony.xwork2.ActionSupport;

import br.com.ebix.model.Login;
import br.com.ebix.persistence.LoginDao;

public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password; 
	
	public String execute() {
		Login login = new Login(username, password);
		LoginDao ld = new LoginDao();
		try {
			ld.loginExiste(login);
			return SUCCESS;
		}catch(Exception ex){
			addActionError(getText("error.login"));
			return ERROR;
		}
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
