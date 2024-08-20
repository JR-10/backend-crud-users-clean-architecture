package com.practice.usuario.domain.usecase;

import com.practice.usuario.domain.model.Usuario;
import com.practice.usuario.domain.model.gateways.UsuarioGateway;
import lombok.RequiredArgsConstructor;

/**
 * En los casos de uso es donde va la logica de negocio
 * */

@RequiredArgsConstructor // crear un contructor
public class UsuarioUseCase {

    private final UsuarioGateway usuarioGateway; // uso del gateway para comunicar

    public Usuario saveUser(Usuario usuario) throws Exception {
        // validacion
        if (usuario.getId() == null) {
            throw new Exception();
        }
        return usuarioGateway.saveUser(usuario);
    }


    public void deleteUser(Long id) {
        try {
            usuarioGateway.deleteUser(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Usuario getUserById(Long id) {
        try {
            return usuarioGateway.getUserById(id);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return new Usuario();
        }
    }

}
