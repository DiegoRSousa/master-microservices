package com.diego.accounts.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.diego.accounts.dto.CustomerRequest;

@Component
public class CustomerValidate implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return CustomerRequest.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		CustomerRequest request = (CustomerRequest) target;
		
		if(request.mobileNumberIsNotValid())
			errors.rejectValue("mobileNumber", null, "is mandatory when email is blank");
		
	}
	
	

}
