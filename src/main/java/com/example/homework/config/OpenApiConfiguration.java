package com.example.homework.config;


import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;


@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI openApiConfig() {
        return new OpenAPI()
                .info(apiInfo());
    }

    protected Info apiInfo() {
        return new Info().title("API")
                .description("Exam project")
                .version("v1")
                .contact(new Contact().name("Andriy Liulka").email("andriy0liulka@gmail.com"));
    }

}

