package net.leasure.swagger.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum LocationEnums {

    BEIJING(1010, "beijing"),
    SHANGHAI(1021, "shanghai"),
    GUANGZHOU(1020, "guangzhou");

    private int locationCode;
    private String locationName;
}
