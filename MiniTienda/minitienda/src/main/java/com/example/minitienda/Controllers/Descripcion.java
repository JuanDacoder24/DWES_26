package com.example.minitienda.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Descripcion {

    @GetMapping("/description")
    public String saludo() {
        return "Este es mi mini tienda de ropa creada por mi";
    }

}
