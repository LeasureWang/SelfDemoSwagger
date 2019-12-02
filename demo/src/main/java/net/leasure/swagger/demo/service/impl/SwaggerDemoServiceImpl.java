package net.leasure.swagger.demo.service.impl;

import net.leasure.swagger.demo.enums.ResponseEnums;
import net.leasure.swagger.demo.model.ProductInfo;
import net.leasure.swagger.demo.response.CommonResponse;
import net.leasure.swagger.demo.service.SwaggerDemoService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Service
public class SwaggerDemoServiceImpl implements SwaggerDemoService {


    // mock records from db
    private static List<ProductInfo> PRODUCTION_MOCK_DB;

    static {
        ProductInfo productInfo1 = new ProductInfo(10000001, "microsoft", "usa", true,
                20001, new BigDecimal(299.9), new BigDecimal(1299.9),
                "2019-12-01", "010-1000002", "microsoft");
        ProductInfo productInfo2 = new ProductInfo(20000012, "google", "usa", true,
                20002, new BigDecimal(2299.9), new BigDecimal(19299.9),
                "2019-12-02", "010-2000002", "google");
        ProductInfo productInfo3 = new ProductInfo(30022001, "ibm", "usa", true,
                20003, new BigDecimal(99.9), new BigDecimal(599.9),
                "2019-12-03", "010-3000002", "ibm");
        ProductInfo productInfo4 = new ProductInfo(40025002, "hsbc", "uk", true,
                20004, new BigDecimal(9.9), new BigDecimal(200.2),
                "2019-12-04", "010-4000002", "hsbc");
        ProductInfo productInfo5 = new ProductInfo(50302099, "accenture", "FIN", true,
                20005, new BigDecimal(22.9), new BigDecimal(12222.9),
                "2019-12-05", "010-5000002", "accenture");
        ProductInfo productInfo6 = new ProductInfo(62200407, "huawei", "chn", true,
                20006, new BigDecimal(6.9), new BigDecimal(77.79),
                "2019-12-06", "010-6000002", "huawei");

        PRODUCTION_MOCK_DB = Arrays.asList(productInfo1, productInfo2, productInfo3, productInfo4, productInfo5, productInfo6);
    }


    @Override
    public void insert() {
    }

    public static CommonResponse<List<String>> insert2() {

        return new CommonResponse<>(ResponseEnums.REP_SUCCESS, Arrays.asList("22", "33"));
    }

    public static void main(String[] args) {
        System.out.println(insert2());
    }
}
