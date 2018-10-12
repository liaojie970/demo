package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author：v
 * @Description：
 * @Date: 2018/9/29
 * @Modified By:
 */
@Component
public class PostConstructDemo {

    @Autowired
    private Person person;

    public PostConstructDemo() {
        System.out.println("此时b还未被注入: b = " + person);
    }

    @PostConstruct
    private void init() {
        System.out.println("@PostConstruct将在依赖注入完成后被自动调用: b = " + person);
    }

}
