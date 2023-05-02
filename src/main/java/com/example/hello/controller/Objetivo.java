package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Objetivo {
    @GetMapping("/objetivo")
    public List<String> listaObjetivos() {
        List<String> listaObjetivos = new ArrayList<>();
        listaObjetivos.add("Aprender Spring Boot");
        listaObjetivos.add("Aprender MySql");
        listaObjetivos.add("Aprender Segurança");
        return listaObjetivos;
    }
}
