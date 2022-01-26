package br.com.arthurpbelato.sistc.service.service.exceptions;

public class ResourceNotExistsException extends Exception {

    public ResourceNotExistsException(String message) {
        super(message + "não encontrado(a) no sistema");
    }

    public ResourceNotExistsException() {
    }
}
