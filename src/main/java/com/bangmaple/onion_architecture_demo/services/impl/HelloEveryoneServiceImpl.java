package com.bangmaple.onion_architecture_demo.services.impl;

import com.bangmaple.onion_architecture_demo.services.HelloService;


public class HelloEveryoneServiceImpl implements HelloService {

    @Override
    public String getMessage() {
        return "Hello everyone";
    }
}
