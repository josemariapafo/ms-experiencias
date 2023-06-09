package com.portafolio.msexperiencias.services;

import com.portafolio.msexperiencias.domain.Experiencia;

import java.util.List;

public interface ExperienciaService {

    List<Experiencia> obtenerExperienciaPorUsuarioID(Long usuarioID);

    List<Experiencia> obtenerTodasLasExperiencias();
}
