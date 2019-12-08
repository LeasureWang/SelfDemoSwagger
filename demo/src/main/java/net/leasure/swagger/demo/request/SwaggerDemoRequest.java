package net.leasure.swagger.demo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import net.leasure.swagger.demo.enums.LocationEnums;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(
//        value = "插入的数据模型",
        description = "根据下面的数据格式构造数据插入数据库")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SwaggerDemoRequest implements Serializable {

    private static final long serialVersionUID = 7192845920667864678L;

    @ApiModelProperty(
            value = "主键id",
            required = true)
    private long id;
    @ApiModelProperty(
            value = "代理商",
            required = true,
            allowableValues = "hsbc, microsoft, google, libra")
    private String agent;
    @ApiModelProperty(
            value = "生产地",
            required = true,
            allowEmptyValue = false,
            dataType = "net.leasure.swagger.demo.enums.LocationEnums")
    private String location;
    private boolean quality;
    private int refNumber;
    private BigDecimal costPrice;
    private BigDecimal sellingPrice;
    private String productionDate;
    private String tel;
    private String remark;
}
