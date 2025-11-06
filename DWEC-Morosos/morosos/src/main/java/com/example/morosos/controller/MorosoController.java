package com.example.morosos.controller;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.RestController;

import com.example.morosos.model.Moroso;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class MorosoController {

    LinkedList <Moroso> lista = new LinkedList<>();

    @GetMapping("/api/morosos/principal")
    public LinkedList <Moroso> getMethodName() {
        return lista;
    }

    @PostMapping("/api/morosos")
    public Moroso postMethodName(@RequestBody Moroso moroso) {
    if (moroso.getId() == null) {
        long nuevoId = lista.isEmpty() ? 1L : lista.getLast().getId() + 1;
        moroso.setId(nuevoId);
    }
    lista.add(moroso);
    return moroso;
    }
    
    @DeleteMapping("/api/morosos/{id}")
    public String deleteMoroso(@PathVariable long id) {
    boolean eliminado = lista.removeIf(m -> m.getId() == id);
    if (eliminado) {
        return "Moroso con ID " + id + " eliminado correctamente.";
    } else {
        return "No se encontró ningún moroso con el ID " + id;
    }
}

    

    
    
    
    
    

}
