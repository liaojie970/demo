package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author：v
 * @Description：
 * @Date: 2018/8/1
 * @Modified By:
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/person")
    Person person() {
        Person person = new Person("liaojie", "wuhan");
        person.setBirthday(new Date());
        return person;
    }
}
