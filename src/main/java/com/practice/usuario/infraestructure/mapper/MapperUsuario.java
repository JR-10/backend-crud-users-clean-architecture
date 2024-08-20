package com.practice.usuario.infraestructure.mapper;

import com.practice.usuario.domain.model.Usuario;
import com.practice.usuario.infraestructure.driver_adapter.jpa.entity.UsuarioEntity;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


/**
 * conversion de data
 * */

@Component
@NoArgsConstructor
public class MapperUsuario {

    // tranformas desde el usuarioEntity a una instancia de Usuario
    public Usuario toUsuario(UsuarioEntity usuarioData){
        return new Usuario(
                usuarioData.getId(),
                usuarioData.getNombre(),
                usuarioData.getApellido(),
                usuarioData.getEmail()
        );
    }

    // tranformas desde el usuario a una instancia de UsuarioEntiy
    public UsuarioEntity toData(Usuario usuario){
        return new UsuarioEntity(
                usuario.getId(),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getEmail()
        );
    }

}
