package com.example.sptest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String getHello() {
        return "hello";
    }

    @RequestMapping("/doGetController")
    @ResponseBody
    public String doGetController(){
        return "123";
    }

    @RequestMapping("/doGetControllerTwo")
    public String doGetControllerTwo(String name,Integer age){
        System.out.println( "["+name+"]"+"["+age+"]");
        return "["+name+"]"+"["+age+"]";
    }


    @RequestMapping(value = "/doPostControllerFour",method = RequestMethod.POST)
    public String doPostControllerFour(String name,Integer age){
        System.out.println( "POST["+name+"]"+"["+age+"]");
        return "POST["+name+"]"+"["+age+"]";
    }

    @RequestMapping(value = "/doPostControllerFive",method = RequestMethod.POST)
    @ResponseBody
    public String doPostControllerFive(@RequestBody  User user){
        System.out.println(user.toString());
        return user.toString();
    }
}
