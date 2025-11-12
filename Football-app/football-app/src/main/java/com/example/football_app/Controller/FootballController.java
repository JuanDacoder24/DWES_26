package com.example.football_app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.football_app.Repository.EquipoRepository;
import com.example.football_app.Repository.FutbolistaRepository;

@Controller
public class FootballController {

    
    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private FutbolistaRepository futbolistaRepository;

    @GetMapping("/equipos")
    public String listarEquipos(Model model) {
        model.addAttribute("equipos", equipoRepository.findAll());
        return "equipos";
    }

    @GetMapping("/futbolistas")
    public String listarFutbolistas(Model model) {

        model.addAttribute("futbolistas", futbolistaRepository.findAll());
        return "futbolistas";
    }
    

}
