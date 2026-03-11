package com.paulo.usermanagementapi.exception;

import com.paulo.usermanagementapi.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

 @ExceptionHandler(UsuarioNaoEncontradoException.class)
    public ResponseEntity<ErrorResponse> handleUsuarioNaoEncontrado(UsuarioNaoEncontradoException ex){
     ErrorResponse error = new ErrorResponse(
             HttpStatus.NOT_FOUND.value(),
             ex.getMessage(),
             LocalDateTime.now()
     );
     return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
 }

 @ExceptionHandler(UsuarioJaDesativadoException.class)
     public ResponseEntity<ErrorResponse> handleUsuarioJaDesativado(UsuarioJaDesativadoException ex){
     ErrorResponse error = new ErrorResponse(
             HttpStatus.BAD_REQUEST.value(),
             ex.getMessage(),
             LocalDateTime.now()
     );
     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
 }

 @ExceptionHandler(EmailJaCadastradoException.class)
     public ResponseEntity<ErrorResponse> handleEmailJaCadastrado(EmailJaCadastradoException ex) {
     ErrorResponse error = new ErrorResponse(
             HttpStatus.CONFLICT.value(),
             ex.getMessage(),
             LocalDateTime.now()
     );
     return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
 }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleErroGenerico(Exception ex){
        ex.printStackTrace();
        ErrorResponse error = new ErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                ex.getMessage(),
                LocalDateTime.now()
        );

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }
 }



























