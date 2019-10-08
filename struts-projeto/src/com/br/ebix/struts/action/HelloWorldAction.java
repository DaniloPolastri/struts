package com.br.ebix.struts.action;

import com.br.ebix.struts.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private static int helloCount = 0;
	private MessageStore messageStore;
	private String userName;
	
	public String execute(){
		messageStore = new MessageStore();
		helloCount++;
		
		if (userName != null) {
		    messageStore.setMessage( messageStore.getMessage() + " " + userName);
		}
		
		return SUCCESS;
	}
	
	public int getHelloCount() {
	    return helloCount;
	}
	
	public MessageStore getMessageStore() {	
		return messageStore;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
