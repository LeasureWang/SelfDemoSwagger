package net.leasure.swagger.demo.service;

import net.leasure.swagger.demo.request.SwaggerDemoRequest;
import net.leasure.swagger.demo.response.CommonResponse;
import net.leasure.swagger.demo.response.SwaggerDemoListResponse;
import net.leasure.swagger.demo.response.SwaggerDemoResponse;

public interface SwaggerDemoService {

    CommonResponse insert(SwaggerDemoRequest request);

    CommonResponse<SwaggerDemoResponse> getById(String id);

    CommonResponse<SwaggerDemoListResponse> getList();
}
