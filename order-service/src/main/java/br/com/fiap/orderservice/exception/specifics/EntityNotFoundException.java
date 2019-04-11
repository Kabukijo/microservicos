package br.com.fiap.orderservice.exception.specifics;

import br.com.fiap.orderservice.exception.Exceptions;

public class EntityNotFoundException extends Exception {

	public EntityNotFoundException(Class clazz, String... searchParamsMap) {
		super(Exceptions.generateMessage(clazz.getSimpleName(), Exceptions.toMap(String.class, String.class, searchParamsMap)));
	}

}
