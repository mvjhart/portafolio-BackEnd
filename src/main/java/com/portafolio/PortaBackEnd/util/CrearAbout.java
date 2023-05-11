package com.portafolio.PortaBackEnd.util;

import com.portafolio.PortaBackEnd.model.About;
import com.portafolio.PortaBackEnd.service.IAboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CrearAbout implements CommandLineRunner {
    
    @Autowired
    IAboutService aboutServ;

    @Override
    public void run(String... args) throws Exception {
        About aboutUnico = new About("Ria","acá pone un mini intro acerca de vos","Pone acá tus goals","ria@min.com","Argentina","Reasons to contact you");
        aboutServ.save(aboutUnico);
    }
    
    
}
