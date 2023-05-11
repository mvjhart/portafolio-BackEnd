package com.portafolio.PortaBackEnd.repository;

import com.portafolio.PortaBackEnd.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer>{
    
}
