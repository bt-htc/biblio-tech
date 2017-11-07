package fr.htc.formation.bibliotech.web.controller;

import javax.enterprise.context.RequestScoped;

import org.springframework.stereotype.Component;

import fr.htc.formation.bibliotech.web.beans.PasswordRecovryBean;

@Component
@RequestScoped
public class PasswordRecovryController {

	public void recoverPassword(PasswordRecovryBean passwordRecovryBean) {

		try {
			// Je pars du principe que le paramatre est valide

			// 1- Je verifie l'existance du compte
			// Sinon : Message d'erreur
			// 2-Je récupère le password

			// 3 Je prepare le mail

			// 4 j'envoi le mail à l'utilisateur

			// 5- j'informe l'utilisateur que je viens de lui envoyer un mail
			// avec son mot de passe.

		} catch (Exception e) {

		}
	}
}
