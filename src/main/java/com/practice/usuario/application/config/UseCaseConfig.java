package com.practice.usuario.application.config;

import com.practice.usuario.domain.model.gateways.UsuarioGateway;
import com.practice.usuario.domain.usecase.UsuarioUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public UsuarioUseCase usuarioUseCase(UsuarioGateway usuarioGateway) {
        return new UsuarioUseCase(usuarioGateway);
    }

}
