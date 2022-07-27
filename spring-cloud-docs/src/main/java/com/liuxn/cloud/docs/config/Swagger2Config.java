package com.liuxn.cloud.docs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author liuxn
 * @date 2022/7/27
 */
@Configuration
public class Swagger2Config {


    @Bean
    public ApiInfo apiInfo() {
        ApiInfo apiInfo =
                new ApiInfoBuilder()
                        .title("系统API")
                        .description("API文档集成Swagger")
                        .version("1.0")
                        .contact(new Contact("liuxn", "", ""))

                        .build();
        return apiInfo;
    }

    @Bean
    public Docket createRestApi(ApiInfo apiInfo) {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .groupName("demo")
                .apiInfo(apiInfo)
                .enable(true)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.regex("/demo.*")).build();
        return docket;
    }
}
