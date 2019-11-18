package com.nanchengcao.smart.eureka.facade.api;

import com.nanchengcao.smart.eureka.biz.common.CommonConstans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1_0/eureka/admin")
public class AdminController {

    @PostMapping(value = "/get", produces = "application/json; charset=utf-8")
    public @ResponseBody
    String get(@RequestBody String req){
        return req+"hehe"+CommonConstans.serviceAuthor;
    }

}
