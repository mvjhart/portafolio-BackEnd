package com.portafolio.PortaBackEnd.service;

import com.portafolio.PortaBackEnd.model.About;

public interface IAboutService {
    
    public void save(About a);
    public About verAbout(Integer id);
    public void updateAbout(Integer id,About a);   
}
