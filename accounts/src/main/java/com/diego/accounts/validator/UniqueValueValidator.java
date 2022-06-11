package com.diego.accounts.validator;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class UniqueValueValidator implements ConstraintValidator<UniqueValue, Object>{
	
	private String domainAttribute;
	private Class<?> klazz;
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void initialize(UniqueValue params) {
		this.domainAttribute = params.fieldName();
		this.klazz = params.domainClass();
	}
	
	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		var query = manager.createQuery("select 1 from "+klazz.getName()+" "
				+ "where "+domainAttribute+"=:value and "+domainAttribute+" <> '' ");
		query.setParameter("value", value);
		List<?> list = query.getResultList();
		return list.isEmpty();
		
	}

}
