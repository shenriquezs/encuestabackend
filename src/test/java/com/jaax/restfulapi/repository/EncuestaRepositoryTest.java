package com.jaax.restfulapi.repository;

import com.jaax.restfulapi.entity.Encuesta;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;


@DataJpaTest
class EncuestaRepositoryTest {

    @Autowired
    EncuestaRepository encuestaRepository;
    @Autowired
    TestEntityManager testEntityManager;

    @BeforeEach
    void setUp() {
        Encuesta encuesta =
                Encuesta.builder()
                        .correo("sh@gmail.com")
                        .estiloMusical("Pop")
                        .build();
        testEntityManager.persist(encuesta);
    }



}