package com.practice.usuario.infraestructure.driver_adapter.jpa;

import com.practice.usuario.domain.model.Usuario;
import com.practice.usuario.domain.model.gateways.UsuarioGateway;
import com.practice.usuario.infraestructure.driver_adapter.jpa.repository.UsuarioDataJpaRepository;
import com.practice.usuario.infraestructure.mapper.MapperUsuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * vamos a implementar desde el dominio
 * */
@Repository // esta clase es de tipo Repository
@RequiredArgsConstructor
public class UsuarioDataGatewayImpl implements UsuarioGateway {

    private final MapperUsuario mapperUsuario; //
    private final UsuarioDataJpaRepository usuarioDataJpaRepository;


    /*
    * Vamos a recibir el usuario y lo vamos a almacenar en el repository
    * */
    @Override
    public Usuario saveUser(Usuario usuario) {
        var data = mapperUsuario.toData(usuario);
        return mapperUsuario.toUsuario(usuarioDataJpaRepository.save(data));
    }

    @Override
    public void deleteUser(Long id) {
        usuarioDataJpaRepository.deleteById(id);
    }

    @Override
    public Usuario getUserById(Long id) {
        var usuario = usuarioDataJpaRepository.findById(id);
        return mapperUsuario.toUsuario(usuario.get());
    }
}
