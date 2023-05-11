package com.portafolio.PortaBackEnd.service;

import com.portafolio.PortaBackEnd.model.Proyecto;
import com.portafolio.PortaBackEnd.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    ProyectoRepository proRep;
    
    @Override
    public List<Proyecto> verProyectos() {
        return proRep.findAll();
    }

    @Override
    public void agregarProyecto(Proyecto p) {
        proRep.save(p);
    }

    @Override
    public void borrarProyecto(Integer id) {
        proRep.deleteById(id);
    }

    @Override
    public boolean proyectoExists(Integer id) {
        return proRep.existsById(id);
    }

    @Override
    public void updateProyecto(Integer id, Proyecto p) {
        Proyecto proyecto = proRep.findById(id).orElse(null);
        proyecto.setTitulo(p.getTitulo());
        proyecto.setDescripcion(p.getDescripcion());
        proyecto.setLink(p.getLink());
        proRep.save(proyecto);
    }
    
}
