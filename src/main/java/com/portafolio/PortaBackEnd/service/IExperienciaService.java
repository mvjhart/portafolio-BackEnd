package com.portafolio.PortaBackEnd.service;

import com.portafolio.PortaBackEnd.model.Experiencia;
import java.util.List;

public interface IExperienciaService {

    public List<Experiencia> verExperiencias();
    public void agregarExperiencia(Experiencia e);
    public void borrarExperiencia(Integer id);
    public void updateExperiencia(Integer id,Experiencia e);
}
