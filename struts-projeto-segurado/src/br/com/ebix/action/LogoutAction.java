package br.com.ebix.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		session.remove("USER");
		return SUCCESS;
	}
}
