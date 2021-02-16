package com.bangmaple.onion_architecture_demo.services.impl;

import com.bangmaple.onion_architecture_demo.services.HelloService;

import javax.enterprise.inject.Alternative;

@Alternative
public class HelloServiceImpl implements HelloService {
    @Override
    public String getMessage() {
        return "Hello Service";
    }
}
