package com.Ecomarket.EcoMarket.Spa.controller;



import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.Ecomarket.EcoMarket.Spa.service.GerenteService;
import com.Ecomarket.EcoMarket.Spa.model.Gerente;




@RestController
@RequestMapping("/api/usuario")


public class GerenteController {

    @Autowired
    private GerenteService gerenteService;
    
    
    @PostMapping("path")
    public Gerente crearGerente(@RequestBody Gerente gerente) {
        return gerenteService.crearGerente(gerente);
    }
    


    @GetMapping
    public List<Gerente> obtenerGerente() {
        return gerenteService.obtenerGerente();
    }


}

