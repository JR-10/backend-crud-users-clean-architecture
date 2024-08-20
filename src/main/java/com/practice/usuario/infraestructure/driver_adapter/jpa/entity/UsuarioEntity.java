package com.practice.usuario.infraestructure.driver_adapter.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase que es una Entidad para el mapeo de la tabla en la BD
 * */

@Entity // indica que estamos trabajando con JPA
@Table(name = "usuario_tbl" ) // definir el nombre que va a tener nuestra tabla
@NoArgsConstructor // definir constructor sin argumentos
@AllArgsConstructor // definir constructor con argumentos
@Getter
@Setter
public class UsuarioEntity {

    @Id // define que es la llave primaria
    @GeneratedValue(strategy = GenerationType.AUTO) // que es auto
    private Long id;
    @Column(length = 100, nullable = false)
    private String nombre;
    private String apellido;
    private String email;
}
