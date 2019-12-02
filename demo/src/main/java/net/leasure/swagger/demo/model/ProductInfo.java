package net.leasure.swagger.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ProductInfo {

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
