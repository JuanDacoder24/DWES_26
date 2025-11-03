package com.example.morosos.controller;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.RestController;

import com.example.morosos.model.Moroso;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MorosoController {

    LinkedList <Moroso> lista = new LinkedList<>();

    @GetMapping("/principal")
    public LinkedList <Moroso> getMethodName() {
        return lista;
    }

    
    
    
    
    

}
