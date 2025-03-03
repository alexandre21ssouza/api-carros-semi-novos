package com.spring.carros_semi_novos.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI().info(new Info()
                .title("API Concessionária de Veículos Semi-novos")
                .version("1.0")
                .description("Documentação da API para gerenciamento " +
                        "da Concessionária de Veículos Semi-novos"));
    }
}
