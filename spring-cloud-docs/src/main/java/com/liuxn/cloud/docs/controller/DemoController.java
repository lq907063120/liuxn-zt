package com.liuxn.cloud.docs.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接口文档 Demo
 * @author liuxn
 * @date 2022/7/27
 */
@RestController
@Api(value = "DemoApi", tags = "APIDemo测试接口")
public class DemoController {

    @ApiOperation("测试接口1")
    @GetMapping("/demo/test1")
    public String test1(@ApiParam("测试参数1") String test){
        return "test1";
    }

    @ApiOperation("测试接口2")
    @GetMapping("/demo/test2")
    public String test2(@ApiParam("测试参数2") String test){
        return "test2";
    }

}
