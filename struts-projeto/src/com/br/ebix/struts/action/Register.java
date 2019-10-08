package com.br.ebix.struts.action;

import com.br.ebix.struts.model.Person;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Person personBean;

	public String execute() throws Exception {
		// call Service class to store personBean's state in database

		return SUCCESS;
	}

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person person) {
		personBean = person;
	}

	public void validate() {
		if (personBean.getFirstName().length() == 0) {
			addFieldError("personBean.firstName", "Primeiro nome obrigatório.");
		}

		if (personBean.getEmail().length() == 0) {
			addFieldError("personBean.email", "Email obrigatório.");
		}

		if (personBean.getAge() < 18) {
			addFieldError("personBean.age", "Idade obrigatória e deve ter 18 anos ou mais");
		}
	}
}
