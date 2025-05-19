package com.jaax.restfulapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "encuesta")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Encuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Porfavor agregue un correo")
    private String correo;
    private String estiloMusical;
}
