package fr.htc.formation.bibliotech.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.SessionScoped;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.htc.formation.bibliotech.dao.PersonDAO;
import fr.htc.formation.bibliotech.dao.model.Person;
import fr.htc.formation.bibliotech.web.beans.PersonBean;

@Service
@SessionScoped
public class PersonServiceImpl implements PersonService {

	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	@Transactional
	public void addPerson(PersonBean personBean) {

		Person person = new Person();
		person.setName(personBean.getName());
		person.setCountry(personBean.getCountry());
		this.personDAO.addPerson(person);
	}

	@Override
	@Transactional
	public List<PersonBean> listPersons() {
		List<Person> persons = personDAO.listPersons();

		List<PersonBean> personBeans = new ArrayList<PersonBean>();

		for (Person person : persons) {
			PersonBean personBean = new PersonBean();
			BeanUtils.copyProperties(person, personBean);
			personBeans.add(personBean);
		}

		return personBeans;
	}

}
