package br.com.gpmendes7.exception.model.exceptions;

public class DomainException extends RuntimeException {

    private static final long serialVesionUID = 1L;

    public DomainException(String message) {
        super(message);
    }
}
