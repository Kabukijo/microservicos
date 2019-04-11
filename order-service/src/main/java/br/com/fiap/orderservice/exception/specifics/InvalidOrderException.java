package br.com.fiap.orderservice.exception.specifics;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidOrderException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidOrderException(String message) {
		super(message);
	}

	public void userNotFoundException(String message) throws RuntimeException {
		throw new RuntimeException(message);
	}
}
