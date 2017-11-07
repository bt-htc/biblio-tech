package fr.htc.formation.bibliotech.web.controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

import fr.htc.formation.bibliotech.service.PasswordRecovryService;
import fr.htc.formation.bibliotech.web.beans.PasswordRecovryBean;

@Component
@RequestScoped
public class PasswordRecovryController {
	
	
	@Inject
	PasswordRecovryService passwordRecovryService;

	public void recoverPassword(PasswordRecovryBean passwordRecovryBean) {

		try {
			// Je pars du principe que le paramatre est valide
			boolean compteExist = passwordRecovryService.findCompteByEmail(passwordRecovryBean.getEmail());
			// 1- Je verifie l'existance du compte
			if(compteExist == false){
				// Sinon : Message d'erreur       
				 FacesMessage message = new FacesMessage( "Ce comptes n'existe pas !" );
			     FacesContext.getCurrentInstance().addMessage( null, message );
			}
			// 2-Je récupère le password

			// 3 Je prepare le mail

			// 4 j'envoi le mail à l'utilisateur

			// 5- j'informe l'utilisateur que je viens de lui envoyer un mail
			// avec son mot de passe.

		} catch (Exception e) {

		}
	}
}
