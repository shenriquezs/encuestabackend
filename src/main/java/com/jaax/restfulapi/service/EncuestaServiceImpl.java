package com.jaax.restfulapi.service;

import com.jaax.restfulapi.entity.Encuesta;
import com.jaax.restfulapi.repository.EncuestaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EncuestaServiceImpl implements EncuestaService{

    @Autowired
    EncuestaRepository encuestaRepository;

    @Override
    public List<Encuesta> findAllEncuesta() {
        return encuestaRepository.findAll();
    }

    @Override
    public Encuesta saveEncuesta(Encuesta encuesta) {
        return encuestaRepository.save(encuesta);
    }

}
