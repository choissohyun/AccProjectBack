package com.project.Accounting.acc.swagger;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;

import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("75기 vue acc")
                .version("springdocVersion")
                .description("각자 만든 Controller에 내용 추가해주세요");

        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}
