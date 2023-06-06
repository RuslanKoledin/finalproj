//package com.exam.demo.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    @Value("${swagger.enabled}")
//    private boolean swaggerEnabled;
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .enable(swaggerEnabled) // Проверка флага наличия Swagger
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.exam.demo"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//}
//
