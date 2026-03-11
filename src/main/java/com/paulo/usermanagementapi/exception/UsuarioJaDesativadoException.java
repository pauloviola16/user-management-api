package com.paulo.usermanagementapi.exception;

public class UsuarioJaDesativadoException extends RuntimeException {
    public UsuarioJaDesativadoException(String message) {
        super(message);
    }
}
