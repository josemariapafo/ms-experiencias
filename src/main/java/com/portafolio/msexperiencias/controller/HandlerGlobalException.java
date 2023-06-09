package com.portafolio.msexperiencias.controller;

import com.portafolio.msexperiencias.domain.Problem;
import com.portafolio.msexperiencias.exceptions.ExperienciaNoEncontrada;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerGlobalException {

    @ExceptionHandler(value = {ExperienciaNoEncontrada.class})
    public ResponseEntity<Problem> resourceNotFoundException(ExperienciaNoEncontrada error) {
        Problem problem = Problem.builder().title("Experiencia no encontrado").description(error.getMessage()).statusCode("404").build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(problem);
    }
}
