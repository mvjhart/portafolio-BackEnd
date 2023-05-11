package com.portafolio.PortaBackEnd.repository;

import com.portafolio.PortaBackEnd.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {
    
}
