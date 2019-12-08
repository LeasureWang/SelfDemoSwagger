package net.leasure.swagger.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ResponseEnums {

    REP_SUCCESS(HttpStatus.OK.value(), "Success"),

    REP_PARAM_ERROR(5001, "Invalid params"),
    REP_SYSTEM_ERROR(5002, "System error");

    private int code;
    private String message;
}
