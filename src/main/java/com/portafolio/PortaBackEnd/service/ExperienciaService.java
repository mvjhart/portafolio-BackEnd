package com.portafolio.PortaBackEnd.service;

import com.portafolio.PortaBackEnd.model.Experiencia;
import com.portafolio.PortaBackEnd.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    ExperienciaRepository exRep;

    @Override
    public List<Experiencia> verExperiencias() {
        return exRep.findAll();
    }

    @Override
    public void agregarExperiencia(Experiencia e) {
        exRep.save(e);
    }

    @Override
    public void borrarExperiencia(Integer id) {
        exRep.deleteById(id);
    }

    @Override
    public void updateExperiencia(Integer id, Experiencia e) {
        Experiencia experiencia = exRep.findById(id).orElse(null);
        experiencia.setRol(e.getRol());
        experiencia.setYearStart(e.getYearStart());
        experiencia.setYearEnd(e.getYearEnd());
        experiencia.setCompany(e.getCompany());
        exRep.save(experiencia);
        
    }
    
}
