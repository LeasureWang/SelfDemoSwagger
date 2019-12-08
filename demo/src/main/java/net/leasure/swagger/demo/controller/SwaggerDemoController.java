package net.leasure.swagger.demo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.leasure.swagger.demo.request.SwaggerDemoRequest;
import net.leasure.swagger.demo.response.CommonResponse;
import net.leasure.swagger.demo.response.SwaggerDemoListResponse;
import net.leasure.swagger.demo.response.SwaggerDemoResponse;
import net.leasure.swagger.demo.service.SwaggerDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//@Api(tags = "xx-tags",description = "xx-tags-descriptions")
@RestController
@RequestMapping(value = "/app/v1")
public class SwaggerDemoController {

    @Autowired
    private SwaggerDemoService swaggerDemoService;

    @ApiOperation(value = "数据插入接口", notes = "根据模型数据格式使用POST请求插入一条数据到database")
    @PostMapping("/insert")
    public CommonResponse insert(@Valid @RequestBody SwaggerDemoRequest request,
                                 BindingResult bindingResult) {

        // todo: params checking with bindingResult

        return swaggerDemoService.insert(request);
    }

    @GetMapping("/getById/{id}")
    public CommonResponse<SwaggerDemoResponse> getById(@PathVariable String id) {

        // todo: params checking

        return swaggerDemoService.getById(id);
    }

    @GetMapping("/getList")
    public CommonResponse<SwaggerDemoListResponse> getList(

            @ApiParam(value = "代理商", example = "hsbc"/*, allowableValues = "1,2,3"*/)
            @RequestParam(name = "agent", required = true) String agent,

            @RequestParam(name = "refNumber", required = true) int refNumber,
            @RequestParam(name = "location", required = false) String location) {

        // todo: params checking

        return swaggerDemoService.getList(agent, refNumber, location);
    }
}
