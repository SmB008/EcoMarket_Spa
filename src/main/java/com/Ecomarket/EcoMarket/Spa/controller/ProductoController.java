package com.Ecomarket.EcoMarket.Spa.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.Ecomarket.EcoMarket.Spa.service.ProductoService;
import com.Ecomarket.EcoMarket.Spa.model.Producto;




@RestController
@RequestMapping("/api/usuarios")


public class ProductoController {

    @Autowired
    private ProductoService productoService;
    
    
    @PostMapping("path")
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.crearProducto(producto);
    }



}



