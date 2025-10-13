package com.example.minitienda.Controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Fecha {


    @GetMapping("/date")
    public String fecha() {
        return "Hoy es" + LocalDateTime.now();
    }
    

}
