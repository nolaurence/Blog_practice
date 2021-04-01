package com.nolaurence.controller;

import com.nolaurence.entity.User;
import com.nolaurence.handler.MyRuntimeException;
import com.nolaurence.api.TestService;
import com.nolaurence.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
author nolaurence
2021.4.1-pm
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;
    @GetMapping("/test")
    public Result test() {
        User user = testService.getUserById(1);
        return Result.success().data("data", user);
    }

}
