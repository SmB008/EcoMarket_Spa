package com.Ecomarket.EcoMarket.Spa.service;



import com.Ecomarket.EcoMarket.Spa.model.Gerente;
import com.Ecomarket.EcoMarket.Spa.repository.GerenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class GerenteService {
    @Autowired
    private GerenteRepository gerenteRepository;

    public Gerente crearGerente(Gerente gerente) {
        return gerenteRepository.save(gerente);
    }


    public List<Gerente> obtenerGerente() {
        return gerenteRepository.findAll();
    }




}

