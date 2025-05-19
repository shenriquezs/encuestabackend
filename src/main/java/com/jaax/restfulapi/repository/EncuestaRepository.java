package com.jaax.restfulapi.repository;


import com.jaax.restfulapi.entity.Encuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncuestaRepository extends JpaRepository<Encuesta,Long> {

}
