package com.macpro.springboot.demo.controller;

import com.macpro.springboot.demo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/13
 */
@Controller
@RequestMapping("/demo")
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot!!!!";
    }
    //
    // @Value("${name}")
    // private String name;
    //
    // @Value("${hobbies[1]}")
    // private String hobby;
    //
    // @Value("${admin.password}")
    // private Integer password;
    //
    // @ResponseBody
    // @RequestMapping("/test01")
    // public String test(){
    //     System.out.println("name==>"+name);
    //     System.out.println("hobby==>"+hobby);
    //     System.out.println("password==>"+password);
    //     return "SUCCESS";
    // }

    @Autowired
    private Environment environment;
    // @ResponseBody
    // @RequestMapping("/test02")
    // public String test02(){
    //     System.out.println("name==>"+environment.getProperty("name"));
    //     System.out.println("hobby==>"+environment.getProperty("hobbies[2]"));
    //     System.out.println("password==>"+environment.getProperty("admin.password"));
    //     return "SUCCESS";
    // }


@Autowired
private Person person;
    @ResponseBody
    @RequestMapping("/test03")
    public String test03(){
        System.out.println(person);
        String[] hobbies = person.getHobbies();
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
        return "SUCCESS";
    }

}