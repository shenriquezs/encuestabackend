package com.jaax.restfulapi.controller;

import com.jaax.restfulapi.entity.Encuesta;
import com.jaax.restfulapi.service.EncuestaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EncuestaController.class)
class EncuestaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EncuestaService encuestaService;

    private Encuesta encuesta;

    @BeforeEach
    void setUp() {
        encuesta = Encuesta.builder()
                .id(1L)
                .correo("sh@gmail.com")
                .estiloMusical("Pop")
                .build();
    }


    @Test
    public void saveEncuesta() throws Exception{
        Encuesta postEncuesta = Encuesta.builder()
                .correo("sh@gmail.com")
                .estiloMusical("Pop")
                .build();
        Mockito.when(encuestaService.saveEncuesta(postEncuesta)).thenReturn(encuesta);
        mockMvc.perform(post("/saveEncuesta").contentType(MediaType.APPLICATION_JSON)
                        .content("{\n" +
                                "    \"correo\":\"sh@gmail.com\",\n" +
                                "    \"estiloMusical\": \"Pop\"\n" +
                                "}"))
                .andExpect(status().isOk());
    }

}
