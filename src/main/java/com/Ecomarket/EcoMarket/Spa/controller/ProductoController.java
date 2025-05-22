package com.Ecomarket.EcoMarket.Spa.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.Ecomarket.EcoMarket.Spa.service.ProductoService;
import org.springframework.web.bind.annotation.*;
import com.Ecomarket.EcoMarket.Spa.model.Producto;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
@RequestMapping("/api/usuario")


public class ProductoController {

    @Autowired
    private ProductoService productoService;
    
    
    @PostMapping("path")
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.crearProducto(producto);
    }


    @GetMapping
    public List<Producto> obtenerProducto() {
        return productoService.obtenerProducto();
    }


    @GetMapping("/buscar/{id}")
    public Producto buscarPorId(@PathVariable String id) {
        return productoService.buscarPorId(id)
            .orElseThrow(() -> new RuntimeException("Producto con el id: " + id + " no ha sido encontrado"));
    }
    

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable String id, @RequestBody Producto productoActualizado) {
        try {
            Producto actualizado = productoService.actualizarProducto(id, productoActualizado);
            return ResponseEntity.ok(actualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        
    }


    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminarProducto(@PathVariable String id) {
        productoService.eliminarProductoPorId(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT)
            .body("Producto con el id: " + id + " ha sido eliminado con exito");
    }


    

}



