package com.practice.usuario.domain.model.gateways;

import com.practice.usuario.domain.model.Usuario;

/**
 *  Permite comunicarnos con la tecnologia externa propia del lenguaje
 *  Puerto => se comunica por medio de una interfaz de manera externa
 * */
public interface UsuarioGateway {

    /*
    * como se implemento JPA para comunicar con la BD, entonces se declara lo siguiente para utilizarlo
    * */
    Usuario saveUser(Usuario usuario);

    void deleteUser(Long id);

    Usuario getUserById(Long id);


}
