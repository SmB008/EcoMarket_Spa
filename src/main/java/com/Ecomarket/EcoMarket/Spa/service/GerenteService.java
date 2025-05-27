package com.Ecomarket.EcoMarket.Spa.service;



import com.Ecomarket.EcoMarket.Spa.model.Gerente;
import com.Ecomarket.EcoMarket.Spa.repository.GerenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Gerente actualizarGerente(String rut, Gerente gerenteActualizado) {
        Gerente gerenteExistente = gerenteRepository.findByRut(rut)
            .orElseThrow(() -> new RuntimeException("Gerente con el rut: " + rut + " no existe"));


        gerenteExistente.setCorreo(gerenteActualizado.getCorreo());
        gerenteExistente.setDireccion(gerenteActualizado.getDireccion());
        gerenteExistente.setTelefono(gerenteActualizado.getTelefono());
        

        return gerenteRepository.save(gerenteExistente);
    }

    public void eliminarGerentePorRut(String rut) {
        Optional<Gerente> gerente = gerenteRepository.findByRut(rut);
        gerente.ifPresent(gerenteRepository::delete);
    }


}

