package com.wty.dubbo.springbootdubboconsumer.Service;



import com.alibaba.dubbo.config.annotation.Reference;
import com.wty.dubbo.springbootdubboprovider.Service.SayHello;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SayService  {

//    @Reference
    @Resource
   private SayHello sayHello;

    public String say (String name) {
        System.out.println("服务层"+name);
       String s= sayHello.sayHello(name);
        return s;
    }

}
