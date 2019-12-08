package net.leasure.swagger.demo.config;

import net.leasure.swagger.demo.controller.SwaggerDemoController;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("swagger demo apis")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(SwaggerDemoController.class.getPackage().getName()))
//                .paths(Predicates.not(ant("/error")))
//                .paths(PathSelectors.ant("/app/**"))
                .build()
                .ignoredParameterTypes(ApiIgnore.class)
                .enableUrlTemplating(true);
    }


    @Bean
    public Docket defaultApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("SpringBoot default apis")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(BasicErrorController.class.getPackage().getName()))
//                .paths(PathSelectors.ant("/error/**"))
                .build()
                .ignoredParameterTypes(ApiIgnore.class)
                .enableUrlTemplating(true);
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger Demo apis UI")
                .description("演示使用 Swagger 生成 RESTful 接口文档")
                .contact(new Contact("LeaSir", "http:/test-url.com", "lea_sir@xx.com"))
                .license("Apache v2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("v1.0")
                .build();
    }
}
