package com.example.demo;

import com.example.demo.validation.Mobile;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author：v
 * @Description：
 * @Date: 2018/8/1
 * @Modified By:
 */
@Component
public class Person {

    private String name;

    private String address;

    private String feature;

    private Date birthday;

    @Mobile
    private String mobile;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
