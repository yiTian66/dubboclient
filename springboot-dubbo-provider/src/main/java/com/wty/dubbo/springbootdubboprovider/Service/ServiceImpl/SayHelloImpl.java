package com.wty.dubbo.springbootdubboprovider.Service.ServiceImpl;

import com.wty.dubbo.springbootdubboprovider.Service.SayHello;
import org.springframework.stereotype.Service;

@Service
public class SayHelloImpl implements SayHello{
    @Override
    public String sayHello(String name) {
        System.out.println("service 被调用了");
        return "Hello "+name;
    }
}
