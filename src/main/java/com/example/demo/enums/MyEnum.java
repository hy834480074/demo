package com.example.demo.enums;

public enum MyEnum {
    UNKONW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    ADD_ERROR(100,"加入失败"),
    UPDATAERROR(101,"修改信息失败"),
    NAMENULL(102,"您的名字为空"),
    IDNULL(103,"您的id为空"),
    DELETE_ERROR(104,"删除失败"),
    ;

    private Integer code;

    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    MyEnum() {

    }

    MyEnum(Integer code, String msg) {

        this.code = code;
        this.msg = msg;
    }
}
