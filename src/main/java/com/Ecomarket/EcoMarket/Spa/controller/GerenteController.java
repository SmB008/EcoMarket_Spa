package com.Ecomarket.EcoMarket.Spa.controller;



import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.Ecomarket.EcoMarket.Spa.service.GerenteService;
import com.Ecomarket.EcoMarket.Spa.model.Gerente;




@RestController
@RequestMapping("/api/usuario/gerente")


public class GerenteController {

    @Autowired
    private GerenteService gerenteService;
    
    
    @PostMapping("/crear")
    public Gerente crearGerente(@RequestBody Gerente gerente) {
        return gerenteService.crearGerente(gerente);
    }
    


    @GetMapping
    public List<Gerente> obtenerGerente() {
        return gerenteService.obtenerGerente();
    }

    @PutMapping("/actualizar/{rut}")
    public ResponseEntity<Gerente> actualizarGerente(@PathVariable String rut, @RequestBody Gerente gerenteActualizado) {
        try {
            Gerente actualizado = gerenteService.actualizarGerente(rut, gerenteActualizado);
            return ResponseEntity.ok(actualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        
    }


    @DeleteMapping("/eliminar/{rut}")
    public ResponseEntity<String> eliminarGerente(@PathVariable String rut) {
        gerenteService.eliminarGerentePorRut(rut);
        return ResponseEntity.status(HttpStatus.NO_CONTENT)
            .body("El gerente con el rut: " + rut + " ha sido eliminado con exito");
    }

}

