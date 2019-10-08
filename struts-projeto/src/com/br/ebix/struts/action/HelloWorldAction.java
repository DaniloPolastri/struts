package com.br.ebix.struts.action;

import com.br.ebix.struts.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private static int helloCount = 0;
	private MessageStore messageStore;
	
	public String execute(){
		messageStore = new MessageStore();
		helloCount++;
		
		return SUCCESS;
	}
	
	public int getHelloCount() {
	    return helloCount;
	}
	
	public MessageStore getMessageStore() {
		return messageStore;
	}
	
}
