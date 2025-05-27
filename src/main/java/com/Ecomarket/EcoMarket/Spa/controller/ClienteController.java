package com.Ecomarket.EcoMarket.Spa.controller;



import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.Ecomarket.EcoMarket.Spa.service.ClienteService;
import com.Ecomarket.EcoMarket.Spa.model.Cliente;


import java.util.List;




@RestController
@RequestMapping("/api/usuario/cliente")


public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    
    
    @PostMapping("/crear")
    public Cliente crearUsuario(@RequestBody Cliente usuario) {
        return clienteService.crearUsuario(usuario);
    }


    @GetMapping
    public List<Cliente> obtenerCliente() {
        return clienteService.obtenerCliente();
    }
    

    @PutMapping("/actualizar/{rut}")
    public ResponseEntity<Cliente> actualizarCliente(@PathVariable String rut, @RequestBody Cliente clienteActualizado) {
        try {
            Cliente actualizado = clienteService.actualizarCliente(rut, clienteActualizado);
            return ResponseEntity.ok(actualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        
    }
    

    @DeleteMapping("/eliminar/{rut}")
    public ResponseEntity<String> eliminarCliente(@PathVariable String rut) {
        clienteService.eliminarClientePorRut(rut);
        return ResponseEntity.status(HttpStatus.NO_CONTENT)
            .body("El cliente con el rut: " + rut + " ha sido eliminado con exito");
    }
    



}
