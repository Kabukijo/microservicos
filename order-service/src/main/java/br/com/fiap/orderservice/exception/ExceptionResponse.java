package br.com.fiap.orderservice.exception;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ExceptionResponse {

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timestamp;
	private String message;
	private String details;

	public ExceptionResponse(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}
