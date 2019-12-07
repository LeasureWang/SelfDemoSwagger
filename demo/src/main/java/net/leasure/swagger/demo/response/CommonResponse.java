package net.leasure.swagger.demo.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import net.leasure.swagger.demo.enums.ResponseEnums;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CommonResponse<T> implements Serializable {

    private static final long serialVersionUID = 1823611267210679876L;

    private int code;
    private String message;
    private T data;

    public CommonResponse(ResponseEnums responseEnums) {
        this.code = responseEnums.getCode();
        this.message = responseEnums.getMessage();
    }

    public CommonResponse(ResponseEnums responseEnums, T data) {
        this(responseEnums);
        this.data = data;
    }
}
