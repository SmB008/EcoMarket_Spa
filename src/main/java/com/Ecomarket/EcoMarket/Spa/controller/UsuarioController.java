package com.Ecomarket.EcoMarket.Spa.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.Ecomarket.EcoMarket.Spa.service.UsuarioService;
import com.Ecomarket.EcoMarket.Spa.model.Usuario;




@RestController
@RequestMapping("/api/usuarios")


public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    
    
    @PostMapping("path")
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioService.crearUsuario(usuario);
    }
    




}
