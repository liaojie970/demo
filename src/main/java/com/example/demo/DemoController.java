package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Date;

/**
 * @Author：v
 * @Description：
 * @Date: 2018/8/1
 * @Modified By:
 */
@RestController
public class DemoController {

    Logger log = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/doLogin")
    @ResponseBody
    Boolean doLogin(@Valid Person vo) {
        log.info(vo.toString());
        return Boolean.TRUE;
    }

    @RequestMapping("/person")
    Person person() {
        Person person = new Person("liaojie", "wuhan");
        person.setBirthday(new Date());
        return person;
    }
}
