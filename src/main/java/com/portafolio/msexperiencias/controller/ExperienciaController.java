package com.portafolio.msexperiencias.controller;

import com.portafolio.msexperiencias.domain.Experiencia;
import com.portafolio.msexperiencias.services.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("experiencia")
public class ExperienciaController {

    @Autowired
    private ExperienciaService experienciaService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<Experiencia>> obtenerExperienciasUsuario(@PathVariable Long userId) {
        return ResponseEntity.ok().body(experienciaService.obtenerExperienciaPorUsuarioID(userId));
    }

    @GetMapping
    public ResponseEntity<List<Experiencia>> obtenerTodasExperiencias() {
        return ResponseEntity.ok().body(experienciaService.obtenerTodasLasExperiencias());
    }
}
