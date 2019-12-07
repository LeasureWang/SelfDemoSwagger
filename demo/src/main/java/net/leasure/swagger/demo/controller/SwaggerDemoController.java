package net.leasure.swagger.demo.controller;

import net.leasure.swagger.demo.request.SwaggerDemoRequest;
import net.leasure.swagger.demo.response.CommonResponse;
import net.leasure.swagger.demo.response.SwaggerDemoListResponse;
import net.leasure.swagger.demo.response.SwaggerDemoResponse;
import net.leasure.swagger.demo.service.SwaggerDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/app/v1")
public class SwaggerDemoController {

    @Autowired
    private SwaggerDemoService swaggerDemoService;

    @PostMapping("/insert")
    public CommonResponse insert(@Valid @RequestBody SwaggerDemoRequest request,
                                 BindingResult bindingResult) {

        // todo: params checking with bindingResult

        return swaggerDemoService.insert(request);
    }

    @GetMapping("/getById/{id}")
    public CommonResponse<SwaggerDemoResponse> getById(@PathVariable String id) {

        return swaggerDemoService.getById(id);
    }

    @GetMapping("/getList")
    public CommonResponse<SwaggerDemoListResponse> getList() {

        return swaggerDemoService.getList();
    }
}
