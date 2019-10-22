package br.com.ebix.interceptor;

import br.com.ebix.model.Login;

public interface UserAware {
	
	public void setUser(Login login);
}
