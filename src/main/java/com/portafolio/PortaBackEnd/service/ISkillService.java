package com.portafolio.PortaBackEnd.service;

import com.portafolio.PortaBackEnd.model.Skill;
import java.util.List;

public interface ISkillService {

    public List<Skill> verSkills();
    public void agregarSkill(Skill s);
    public void borrarSkill(Integer id);
    public void updateSkill(Integer id,Skill s);
    
}
