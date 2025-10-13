package com.example.minitienda.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.minitienda.model.Producto;


@RestController
public class Lista {

    @GetMapping("/products")
    public List<Producto> listaProducto() {

        List<Producto> productos = Arrays.asList(
            new Producto("Laptop Dell", 1200.0, "Laptop de alta gama"),
            new Producto("Mouse Logitech", 25.0, "Mouse inalámbrico"),
            new Producto("Teclado Mecánico", 80.0, "Teclado RGB")
        );
        
        return productos; 
    }
    

}
