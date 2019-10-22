package br.com.ebix.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import br.com.ebix.model.Login;

public class MyLoggingInterceptor implements Interceptor {
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("Destroying MyLoggingInterceptor...");

	}

	@Override
	public void init() {
		System.out.println("Initializing MyLoggingInterceptor...");

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("inside auth interceptor");
		Map<String, Object> sessionAttributes = invocation.getInvocationContext().getSession();
		
		Login user = (Login) sessionAttributes.get("USER");
		
		if(user == null){
			return Action.LOGIN;
		}else{
			Action action = (Action) invocation.getAction();
			if(action instanceof UserAware){
				((UserAware) action).setUser(user);
			}
			return invocation.invoke();
		}
	}

}
