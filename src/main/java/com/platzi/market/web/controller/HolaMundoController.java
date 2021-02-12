package com.platzi.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mutantes")
public class HolaMundoController {

    @GetMapping("/hola")
    public String saludar(){
        return "Hola Mundo desde SpringBoot";
    }

    @GetMapping("")
    public String mutantes(){
        return "Mutantes MELI";
    }
}
