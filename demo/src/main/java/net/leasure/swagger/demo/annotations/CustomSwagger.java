package net.leasure.swagger.demo.annotations;

import net.leasure.swagger.demo.config.SwaggerConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(SwaggerConfig.class)
public @interface CustomSwagger {

}
