package com.xiexl.sp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/hi")
    public String sayHi() {
        return  "hi enjoy";
    }
}