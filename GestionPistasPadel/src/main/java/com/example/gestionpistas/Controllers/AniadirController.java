package com.example.gestionpistas.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.gestionpistas.Pista;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AniadirController {

    public List<Pista> listaPista = new ArrayList<Pista>();

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    

}
