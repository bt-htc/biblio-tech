package fr.htc.formation.bibliotech.web.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "personBean")
public class PersonBean {

	private int id;
	private String name;
	private String country;

	public PersonBean() {

	}

	public PersonBean(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
