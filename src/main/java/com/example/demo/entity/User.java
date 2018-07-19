package com.example.demo.entity;

import javax.validation.Valid;
import javax.validation.constraints.Min;

public class User {
    private String id;
// 用注解限制一些比如int类型的  就是min 小于18不可以
// @Min(value = 18,message = "非法字符")
// 在controller层的对线中注解一个 @Valid 验证一下对象然后
// 在写一个BindingResult 这个是验证的结果返回BindingResult对象可以打印一下
// 如果出错就是打印出来然后return
//   if(bindingResult.hasErrors()){
//        System.out.println(bindingResult.getFiledError().getDefautMessage());
//        retrun null;
//    }

    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String id, String name) {

        this.id = id;
        this.name = name;
    }

    public User() {

    }
}
