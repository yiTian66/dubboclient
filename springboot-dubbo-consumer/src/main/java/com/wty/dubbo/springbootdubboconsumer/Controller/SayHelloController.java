package com.wty.dubbo.springbootdubboconsumer.Controller;


import com.wty.dubbo.springbootdubboconsumer.Service.SayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
    @Autowired
    SayService sayService;

    @RequestMapping("/hello")
    public String say(@RequestParam("name") String name) {
        System.out.println("name：" +name);
        return sayService.say(name);
    }


}
