package com.jaax.restfulapi.controller;

import com.jaax.restfulapi.entity.Encuesta;
import com.jaax.restfulapi.service.EncuestaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EncuestaController {

    @Autowired
    EncuestaService encuestaService;

    @GetMapping("/findAllEncuesta")
    public List<Encuesta> findAllEncuesta(){
        return encuestaService.findAllEncuesta();
    }

    @PostMapping("/saveEncuesta")
    public Encuesta saveEncuesta(@Valid @RequestBody Encuesta encuesta){
        return encuestaService.saveEncuesta(encuesta);
    }


}
