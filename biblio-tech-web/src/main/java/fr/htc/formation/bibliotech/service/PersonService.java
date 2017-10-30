package fr.htc.formation.bibliotech.service;

import java.util.List;

import fr.htc.formation.bibliotech.web.beans.PersonBean;
 
public interface PersonService {
 
    public void addPerson(PersonBean personBean);
    public List<PersonBean> listPersons();
     
}