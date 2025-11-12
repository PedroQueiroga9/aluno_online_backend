package br.com.alunoonline.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API - Aluno Online")
                        .description("Documentação interativa da API do sistema Aluno Online")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Equipe Aluno Online")
                                .email("suporte@alunoonline.com")
                                .url("https://alunoonline.com")))
                .servers(List.of(
                        new Server().url("http://localhost:8080").description("Servidor local"),
                        new Server().url("https://api.alunoonline.com").description("Servidor de produção")
                ));
    }
}
