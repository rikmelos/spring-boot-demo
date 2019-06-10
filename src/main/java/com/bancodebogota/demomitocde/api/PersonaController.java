package com.bancodebogota.demomitocde.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {

    @GetMapping(value = "/hola")
    public List<String> saludar(){
        List<String> lista = new ArrayList<>();
        lista.add("primer");
        lista.add("servicio expuesto en una lista");
        return lista;
    }
}
