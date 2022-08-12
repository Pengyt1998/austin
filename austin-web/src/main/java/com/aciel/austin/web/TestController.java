package com.aciel.austin.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @RequestMapping("/test")
    private String test(){
        System.out.println("Hello,Aciel");
        log.info("log:Hello,Aciel");
        return "Hello,Aciel" ;
    }
}
