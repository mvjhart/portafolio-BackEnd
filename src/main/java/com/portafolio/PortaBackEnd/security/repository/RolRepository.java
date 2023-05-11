package com.portafolio.PortaBackEnd.security.repository;

import com.portafolio.PortaBackEnd.security.enums.RolNombre;
import com.portafolio.PortaBackEnd.security.model.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);  
}
