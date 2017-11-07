package fr.htc.formation.bibliotech.web.beans;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import fr.htc.formation.bibliotech.web.security.SessionContextHelper;

@ManagedBean(name = "loginBean")
@SessionScoped
/**
 *
 * @author User
 */
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String password;
	private String message, uname;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String loginProject() {
		boolean result = true;
		if (result) {
			// get Http Session and store username
			HttpSession session = SessionContextHelper.getSession();
			session.setAttribute("username", uname);

			return "home";
		} else {

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Invalid Login!", "Please Try Again!"));

			// invalidate session, and redirect to other pages

			// message = "Invalid Login. Please Try Again!";
			return "login";
		}
	}

	public String logout() {
		HttpSession session = SessionContextHelper.getSession();
		session.invalidate();
		return "login";
	}
}