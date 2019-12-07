package net.leasure.swagger.demo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SwaggerDemoResponse implements Serializable {

    private static final long serialVersionUID = 8619159150377139019L;

    private long id;
    private String agent;
    private String location;
    private boolean quality;
    private int refNumber;
    private BigDecimal costPrice;
    private BigDecimal sellingPrice;
    private String productionDate;
    private String tel;
    private String remark;
}
