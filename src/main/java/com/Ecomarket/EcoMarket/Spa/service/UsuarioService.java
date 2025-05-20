package com.Ecomarket.EcoMarket.Spa.service;


import com.Ecomarket.EcoMarket.Spa.model.Usuario;
import com.Ecomarket.EcoMarket.Spa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }






}
