package net.leasure.swagger.demo.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties("swagger.props")
public class SwaggerConfigProps {

    private String title = "Swagger Demo apis UI";
    private String description = "演示使用 Swagger 生成 RESTful 接口文档";
    private String license = "Apache v2.0";
    private String licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0.html";
    private String name = "LeaSir";
    private String url = "http:/test-url.com";
    private String email = "lea_sir@mail.com";
}
