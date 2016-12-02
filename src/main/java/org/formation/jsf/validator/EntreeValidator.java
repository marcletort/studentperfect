package org.formation.jsf.validator;

import java.util.Collection;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class EntreeValidator implements Validator {

	@Override
	public void validate(FacesContext fcx, UIComponent arg1, Object arg2) throws ValidatorException {
		String entree = (String) arg2;
		if (entree.length() < 3) {

			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"please enter at least three caracters", "please enter at least three caracters"));
		}

	}

}
