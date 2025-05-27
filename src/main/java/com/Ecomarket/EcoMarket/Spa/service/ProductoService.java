package com.Ecomarket.EcoMarket.Spa.service;


import com.Ecomarket.EcoMarket.Spa.model.Producto;
import com.Ecomarket.EcoMarket.Spa.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service

public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }


    public List<Producto> obtenerProducto() {
        return productoRepository.findAll();
    }


    public Optional<Producto> buscarPorId(Integer id) {
        return productoRepository.findById(id);
    }


    public Producto actualizarProducto(Integer id, Producto productoActualizado) {
        Producto productoExistente = productoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Producto con el id: " + id + " no ha sido encontrado"));


        productoExistente.setNombre(productoActualizado.getNombre());
        productoExistente.setMarca(productoActualizado.getMarca());
        productoExistente.setPrecio(productoActualizado.getPrecio());
        productoExistente.setCantidad(productoActualizado.getCantidad());

        return productoRepository.save(productoExistente);
    }



    public void eliminarProductoPorId(Integer id) {
        Optional<Producto> producto = productoRepository.findById(id);
        producto.ifPresent(productoRepository::delete);
    }
    

    
}

