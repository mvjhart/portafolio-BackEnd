package com.portafolio.PortaBackEnd.controller;

import com.portafolio.PortaBackEnd.model.About;
import com.portafolio.PortaBackEnd.service.IAboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/about")
public class AboutController {

    @Autowired
    IAboutService aboutServ;
   
    @CrossOrigin(origins = "http://localhost:4200/about")
    @GetMapping("/ver/{id}")
    @ResponseBody 
    public About verAbout(@PathVariable Integer id){
        return aboutServ.verAbout(id);
    }
    
    
    @CrossOrigin(origins = "http://localhost:4200/about")   
    @PutMapping("/update/{id}")
    public void updateAbout(@PathVariable Integer id,@RequestBody About a){
        aboutServ.updateAbout(id, a);
    }  

    
}
