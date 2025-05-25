package br.com.felipeamorim.ShortMyUrl.Infrastructure.Config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpemApi() {
        return new OpenAPI().components(new Components())
                .info(new Info()
                        .title("API para encurtar URLs")
                        .description("Projeto para encurtar URls")
                        .version("V1")
                );
    }
}
