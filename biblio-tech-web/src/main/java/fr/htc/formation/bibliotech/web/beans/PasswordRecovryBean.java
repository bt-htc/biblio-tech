package fr.htc.formation.bibliotech.web.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "passwordRecovryBean")
public class PasswordRecovryBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String email;

	public PasswordRecovryBean() {
	}

	public PasswordRecovryBean(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
