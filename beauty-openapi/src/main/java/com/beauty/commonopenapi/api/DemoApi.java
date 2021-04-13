package com.beauty.commonopenapi.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "demo-api")
@RestController
@RequestMapping("/api")
public class DemoApi {

    /**
     * demo
     *
     * @return hello
     */
    @ApiOperation("demo-test")
    @GetMapping("/welcome")
    public String demo(){
        return "hello, welcome to beauty";
    }


}
