package com.example.demo.exception;
//RuntimeException  Spring这个只有对Runtime才会事物回滚  直接EX不会回滚

import com.example.demo.enums.MyEnum;

public class AreaException extends RuntimeException{
    private Integer code;

    public AreaException(MyEnum myEnum) {
        super(myEnum.getMsg());
        this.code = myEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
