package net.leasure.swagger.demo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SwaggerDemoListResponse implements Serializable {

    private static final long serialVersionUID = -8127407461929141431L;

    private List<SwaggerDemoResponse> swaggerDemoResponseList;
}
