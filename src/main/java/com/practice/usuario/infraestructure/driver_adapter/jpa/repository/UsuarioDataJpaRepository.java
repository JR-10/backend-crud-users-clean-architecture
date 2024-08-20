package com.practice.usuario.infraestructure.driver_adapter.jpa.repository;

import com.practice.usuario.infraestructure.driver_adapter.jpa.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface UsuarioDataJpaRepository extends JpaRepository<UsuarioEntity, Long> {

}
