package com.Ecomarket.EcoMarket.Spa.repository;


import com.Ecomarket.EcoMarket.Spa.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    

    Optional<Producto> findById(Integer id);
}

