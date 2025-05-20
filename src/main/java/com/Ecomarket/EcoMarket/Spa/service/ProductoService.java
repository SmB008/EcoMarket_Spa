package com.Ecomarket.EcoMarket.Spa.service;

import com.Ecomarket.EcoMarket.Spa.model.Producto;
import com.Ecomarket.EcoMarket.Spa.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }






}

