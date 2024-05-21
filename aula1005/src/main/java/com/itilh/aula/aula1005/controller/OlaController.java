package com.itilh.aula.aula1005.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class OlaController {

    @GetMapping("/")
    public String olaMethod() {
        return "Servidor Ativo!!!";
    }

}
