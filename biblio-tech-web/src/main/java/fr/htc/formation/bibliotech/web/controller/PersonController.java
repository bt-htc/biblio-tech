package fr.htc.formation.bibliotech.web.controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

import fr.htc.formation.bibliotech.service.PersonService;
import fr.htc.formation.bibliotech.web.beans.PersonBean;

@Component
@RequestScoped
public class PersonController {

	@Inject
	PersonService personService;

	public void addPerson(PersonBean personBean) {

		personService.addPerson(personBean);
		System.out.println(personBean.getName() + " " + personBean.getCountry());
		System.out.println(personService);

	}

	public List<PersonBean> listPersons() {
		return personService.listPersons();
	}

}
