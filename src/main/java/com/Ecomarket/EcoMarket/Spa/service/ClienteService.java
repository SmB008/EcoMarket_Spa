package com.Ecomarket.EcoMarket.Spa.service;


import com.Ecomarket.EcoMarket.Spa.model.Cliente;
import com.Ecomarket.EcoMarket.Spa.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente crearUsuario(Cliente usuario) {
        return clienteRepository.save(usuario);
    }


    public List<Cliente> obtenerCliente() {
        return clienteRepository.findAll();
    }


    public Cliente actualizarCliente(String rut, Cliente clienteActualizado) {
        Cliente clienteExistente = clienteRepository.findByRut(rut)
            .orElseThrow(() -> new RuntimeException("Cliente con el rut: " + rut + " no existe"));


        clienteExistente.setCorreo(clienteActualizado.getCorreo());
        clienteExistente.setDireccion(clienteActualizado.getDireccion());
        clienteExistente.setTelefono(clienteActualizado.getTelefono());
        

        return clienteRepository.save(clienteExistente);
    }


    public void eliminarClientePorRut(String rut) {
        Optional<Cliente> cliente = clienteRepository.findByRut(rut);
        cliente.ifPresent(clienteRepository::delete);
    }

}
