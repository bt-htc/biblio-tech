package fr.htc.formation.bibliotech.dao;

import java.util.List;

import fr.htc.formation.bibliotech.dao.model.Person;

public interface PersonDAO {

	public void addPerson(Person p);

	public List<Person> listPersons();
}