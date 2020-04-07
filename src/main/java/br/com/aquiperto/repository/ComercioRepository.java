package br.com.aquiperto.repository;


import br.com.aquiperto.entity.Comercio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ComercioRepository extends JpaRepository<Comercio, Integer> {

//    List<Comercio> findAllByTituloStartsWith(String titulo);

    @Query("from Comercio c where c.latitude = :latitude and c.longitude = :longitude")
    List<Comercio> findByLocalizacao(Double latitude, Double longitude);

}