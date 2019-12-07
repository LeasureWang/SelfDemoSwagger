package net.leasure.swagger.demo.entity;

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
public class ProductInfoEntity implements Serializable {

    private static final long serialVersionUID = -2870156213988012165L;

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
