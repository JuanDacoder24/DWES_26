package com.example.gestionpistas.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.gestionpistas.Pista;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;


@Controller
    public class HomeController {

    public List<Pista> listaPista = new ArrayList<Pista>();

    @GetMapping("/")
    public String mostrarPistas(Model model) {
        return "index";
    }
         
    @PostMapping("/addPista")
    public RedirectView añadirPista(@RequestParam(name="nombrePista") String nombrePista) {
        

        return new RedirectView("/");
    }
    
}
