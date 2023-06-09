package com.portafolio.msexperiencias.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {

    List<Experiencia> findByUser(User user);
}
