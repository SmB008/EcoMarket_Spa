package com.Ecomarket.EcoMarket.Spa.repository;


import com.Ecomarket.EcoMarket.Spa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
}
