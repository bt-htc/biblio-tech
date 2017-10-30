package fr.htc.formation.bibliotech.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("upperCaseConverter")
public class UpperCaseConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {

		return value.toLowerCase();
	}
	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {

		return value.toString().toUpperCase();
	}
	
}