package com.portafolio.msexperiencias.services;

import com.portafolio.msexperiencias.domain.Experiencia;
import com.portafolio.msexperiencias.domain.ExperienciaRepository;
import com.portafolio.msexperiencias.domain.User;
import com.portafolio.msexperiencias.exceptions.ExperienciaNoEncontrada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienciaService{

    @Autowired
    private ExperienciaRepository experienciaRepository;

    @Override
    public List<Experiencia> obtenerExperienciaPorUsuarioID(Long usuarioID) {

        System.out.println("Hellooo");
        User user = User.builder().id(usuarioID).build();
        List<Experiencia> experiencias = experienciaRepository.findByUser(user);
        System.out.println("2222222");
        System.out.println(experiencias);
        if(!(experiencias.size() > 0)) {
            System.out.print("No hay experierncias");
            throw new ExperienciaNoEncontrada();
        }
        return experiencias;
    }

    @Override
    public List<Experiencia> obtenerTodasLasExperiencias() {
        return experienciaRepository.findAll();
    }


}
