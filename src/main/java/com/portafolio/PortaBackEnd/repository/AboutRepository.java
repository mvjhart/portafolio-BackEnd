package com.portafolio.PortaBackEnd.repository;

import com.portafolio.PortaBackEnd.model.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository<About,Integer>{
    
}
