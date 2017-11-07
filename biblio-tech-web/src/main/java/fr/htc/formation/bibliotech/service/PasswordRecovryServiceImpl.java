package fr.htc.formation.bibliotech.service;

import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;

@Service
@SessionScoped
public class PasswordRecovryServiceImpl implements PasswordRecovryService {

	@Override
	public boolean findCompteByEmail(String email) {
		return false;
	}
}
