package com.personal.demo.http.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prueba")
public class PruebaController {
    

    @GetMapping("mensaje")
    public String mensaje(){
        return "Hola Mundo";
    }

    @PostMapping("suma")
    public Double suma(Double num1, Double n2){
        
        return num1+n2;
    }


}
