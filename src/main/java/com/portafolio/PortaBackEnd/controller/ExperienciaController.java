package com.portafolio.PortaBackEnd.controller;

import com.portafolio.PortaBackEnd.model.Experiencia;
import com.portafolio.PortaBackEnd.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/experiencias")
public class ExperienciaController {

    @Autowired
    IExperienciaService exServ;
    
    
//    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping("/lista")
    @ResponseBody  
    public List<Experiencia> verExperiencias(){
        return exServ.verExperiencias();
    }
    
    
//    @CrossOrigin(origins = "http://localhost:4200/")    
    @PostMapping("/agregar")
    public void agregarExperiencia(@RequestBody Experiencia e){  
        exServ.agregarExperiencia(e);
    }
     
//    @CrossOrigin(origins = "http://localhost:4200/")       
    @DeleteMapping ("/borrar/{id}") 
    public void borrarExperiencia(@PathVariable Integer id){
        exServ.borrarExperiencia(id);
    }
    
    
//    @CrossOrigin(origins = "http://localhost:4200/")   
    @PutMapping("/update/{id}")
    public void updateExperiencia(@PathVariable Integer id,@RequestBody Experiencia e){
        exServ.updateExperiencia(id, e);
    }
}
