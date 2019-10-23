package br.com.ebix.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import br.com.ebix.model.Login;
import br.com.ebix.persistence.LoginDao;

public class LoginAction extends ActionSupport implements SessionAware, ModelDriven<Login> {
	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private Login login = new Login();
	private Map<String, Object> sessionAttributes = null;

	public String execute() throws Exception {
		Login login = new Login(username, password);
		LoginDao ld = new LoginDao();

		if (ld.loginExiste(login)) {
			sessionAttributes.put("USER", login);
			return SUCCESS;
		} else {
			addActionError(getText("error.login"));
			return INPUT;
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

	@Override
	public Login getModel() {
		return login;
	}

	@Override
	public void setSession(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;

	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

}