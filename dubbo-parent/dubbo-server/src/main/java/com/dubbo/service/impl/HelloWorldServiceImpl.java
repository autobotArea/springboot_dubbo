package com.dubbo.service.impl;

import com.dubbo.domain.HelloWorld;
import com.dubbo.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public HelloWorld sayHello(HelloWorld helloWorld) {
        helloWorld.setName("helloworld");
        return helloWorld;
    }
}
