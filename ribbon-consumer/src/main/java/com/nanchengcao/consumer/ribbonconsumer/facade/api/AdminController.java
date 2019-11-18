package com.nanchengcao.consumer.ribbonconsumer.facade.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1_0/eureka/admin")
public class AdminController {

    @PostMapping(value = "/get", produces = "application/json; charset=utf-8")
    public @ResponseBody
    String get(@RequestBody String req){
        return req+"hehe";
    }

}
