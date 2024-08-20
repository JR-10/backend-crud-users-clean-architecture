package com.practice.usuario.infraestructure.entry_points;


import com.practice.usuario.domain.model.Usuario;
import com.practice.usuario.domain.usecase.UsuarioUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Clase de tipo Controlador
 * */
@RestController // indica que la clase es de tipo controlador
@RequestMapping("/api/v1/usuario") // para indicar la ruta padre del servicio
@RequiredArgsConstructor
public class UsuarioController {

    // inyectar caso de uso
    private final UsuarioUseCase usuarioUseCase;


    @GetMapping("/get")
    public ResponseEntity<Usuario> findById(@RequestParam("id") Long id) {
        var usuario = usuarioUseCase.getUserById(id);
        if(usuario.getId() != null){
            return new ResponseEntity<>(usuario, HttpStatus.OK);
        }
        return new ResponseEntity<>(usuario, HttpStatus.NOT_FOUND);
    }


}
