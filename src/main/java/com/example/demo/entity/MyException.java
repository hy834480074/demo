package com.example.demo.entity;


//固定的错误代码字段这三个字段http请求返回最外层对象
public class MyException<T> {
//    错误码
    private Integer code;
//    提示信息
    private String msg;
//    具体内容
    private T data;

    public MyException() {
    }

    public MyException(Integer code, String msg, T data) {

        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {

        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
