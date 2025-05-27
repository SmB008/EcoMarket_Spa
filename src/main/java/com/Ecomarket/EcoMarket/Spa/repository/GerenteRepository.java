package com.Ecomarket.EcoMarket.Spa.repository;

import com.Ecomarket.EcoMarket.Spa.model.Gerente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GerenteRepository extends JpaRepository<Gerente, Integer> {
    
    Optional<Gerente> findByRut(String rut);
    
}
