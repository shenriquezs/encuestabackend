package com.jaax.restfulapi.service;

import com.jaax.restfulapi.entity.Encuesta;
import com.jaax.restfulapi.repository.EncuestaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class EncuestaServiceTest {

    @Autowired
    private EncuestaService encuestaService;
    @MockBean
    private EncuestaRepository encuestaRepository;

    @BeforeEach
    void setUp() {
        Encuesta encuesta = Encuesta.builder()
                .id(1L)
                .correo("sh@gmail.com")
                .estiloMusical("Pop")
                .build();

    }


}