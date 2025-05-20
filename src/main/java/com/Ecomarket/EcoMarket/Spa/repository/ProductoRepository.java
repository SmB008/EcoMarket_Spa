package com.Ecomarket.EcoMarket.Spa.repository;


import com.Ecomarket.EcoMarket.Spa.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    
}

