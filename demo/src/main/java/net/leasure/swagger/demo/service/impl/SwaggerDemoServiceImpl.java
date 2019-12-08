package net.leasure.swagger.demo.service.impl;

import lombok.extern.slf4j.Slf4j;
import net.leasure.swagger.demo.enums.ResponseEnums;
import net.leasure.swagger.demo.entity.ProductInfoEntity;
import net.leasure.swagger.demo.request.SwaggerDemoRequest;
import net.leasure.swagger.demo.response.CommonResponse;
import net.leasure.swagger.demo.response.SwaggerDemoListResponse;
import net.leasure.swagger.demo.response.SwaggerDemoResponse;
import net.leasure.swagger.demo.service.SwaggerDemoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class SwaggerDemoServiceImpl implements SwaggerDemoService {

    // mock records from db
    private static List<ProductInfoEntity> PRODUCTION_MOCK_DB;

    static {
        ProductInfoEntity productInfoEntity1 = new ProductInfoEntity(10000001, "microsoft", "usa", true,
                20001, new BigDecimal("299.9"), new BigDecimal("1299.9"),
                "2019-12-01", "010-1000002", "microsoft");
        ProductInfoEntity productInfoEntity2 = new ProductInfoEntity(20000012, "google", "usa", true,
                20002, new BigDecimal("2299.9"), new BigDecimal("19299.9"),
                "2019-12-02", "010-2000002", "google");
        ProductInfoEntity productInfoEntity3 = new ProductInfoEntity(30022001, "ibm", "usa", true,
                20003, new BigDecimal("99.9"), new BigDecimal("599.9"),
                "2019-12-03", "010-3000002", "ibm");
        ProductInfoEntity productInfoEntity4 = new ProductInfoEntity(40025002, "hsbc", "uk", true,
                20004, new BigDecimal("9.9"), new BigDecimal("200.2"),
                "2019-12-04", "010-4000002", "hsbc");
        ProductInfoEntity productInfoEntity5 = new ProductInfoEntity(50302099, "accenture", "FIN", true,
                20005, new BigDecimal("22.9"), new BigDecimal("12222.9"),
                "2019-12-05", "010-5000002", "accenture");
        ProductInfoEntity productInfoEntity6 = new ProductInfoEntity(62200407, "huawei", "chn", true,
                20006, new BigDecimal("6.9"), new BigDecimal("77.79"),
                "2019-12-06", "010-6000002", "huawei");

        PRODUCTION_MOCK_DB = Arrays.asList(productInfoEntity1, productInfoEntity2, productInfoEntity3, productInfoEntity4, productInfoEntity5, productInfoEntity6);
    }


    @Override
    public CommonResponse insert(SwaggerDemoRequest request) {

        log.info("request body: {}", request);

        try {
            log.info("query db logic..");

            // todo: use the request for insert db

        } catch (Exception e) {
            new CommonResponse<>(ResponseEnums.REP_SYSTEM_ERROR, e.getMessage());
        }

        return new CommonResponse(ResponseEnums.REP_SUCCESS, null);
    }

    @Override
    public CommonResponse<SwaggerDemoResponse> getById(String id) {

        log.info("request param id: {}", id);

        try {

            // todo: use id query db
            // todo: set db record to response body --> PRODUCTION_MOCK_DB.get(0)

            log.info("query db logic..");

        } catch (Exception e) {
            new CommonResponse<>(ResponseEnums.REP_SYSTEM_ERROR, e.getMessage());
        }

        SwaggerDemoResponse swaggerDemoResponse = new SwaggerDemoResponse();
        BeanUtils.copyProperties(PRODUCTION_MOCK_DB.get(0), swaggerDemoResponse);

        // set response
        CommonResponse<SwaggerDemoResponse> response = new CommonResponse<>(ResponseEnums.REP_SUCCESS);
        response.setData(swaggerDemoResponse);

        return response;
    }

    @Override
    public CommonResponse<SwaggerDemoListResponse> getList(String agent, int refNumber, String location) {

        try {

            // todo: query db for a list records --> PRODUCTION_MOCK_DB

            log.info("query db logic..");

        } catch (Exception e) {
            new CommonResponse<>(ResponseEnums.REP_SYSTEM_ERROR, e.getMessage());
        }

        SwaggerDemoListResponse swaggerDemoListResponse = new SwaggerDemoListResponse();
        List<SwaggerDemoResponse> swaggerDemoResponseList = new ArrayList<>();
        for (ProductInfoEntity productInfoEntity : PRODUCTION_MOCK_DB) {
            SwaggerDemoResponse swaggerDemoResponse = new SwaggerDemoResponse();
            BeanUtils.copyProperties(productInfoEntity, swaggerDemoResponse);
            swaggerDemoResponseList.add(swaggerDemoResponse);
        }
        swaggerDemoListResponse.setSwaggerDemoResponseList(swaggerDemoResponseList);


        // set response
        CommonResponse<SwaggerDemoListResponse> response = new CommonResponse<>(ResponseEnums.REP_SUCCESS);
        response.setData(swaggerDemoListResponse);

        return response;
    }

}
