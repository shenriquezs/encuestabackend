package com.jaax.restfulapi.service;

import com.jaax.restfulapi.entity.Encuesta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EncuestaService {

    List<Encuesta> findAllEncuesta();
    Encuesta saveEncuesta(Encuesta encuesta);
}
