package com.kode.simple_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(){
        return "Hi from hello service";
    }
}
