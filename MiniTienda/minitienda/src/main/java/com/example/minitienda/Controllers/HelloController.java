package com.example.minitienda.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String saludo() {
        return "Bienvenido a MiniTienda";
    }
}