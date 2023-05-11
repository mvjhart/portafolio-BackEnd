package com.portafolio.PortaBackEnd.service;

import com.portafolio.PortaBackEnd.model.Skill;
import com.portafolio.PortaBackEnd.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {
    
    @Autowired
    SkillRepository skillRep;

    @Override
    public List<Skill> verSkills() {
        return skillRep.findAll();
    }

    @Override
    public void agregarSkill(Skill s) {
        skillRep.save(s);
    }

    @Override
    public void borrarSkill(Integer id) {
        skillRep.deleteById(id);
    }

    @Override
    public void updateSkill(Integer id, Skill s) {
        Skill skill = skillRep.findById(id).orElse(null);
        skill.setName(s.getName());
        skill.setTipo(s.getTipo());
        skill.setNivel(s.getNivel());
        skillRep.save(skill);
    }
    
}
