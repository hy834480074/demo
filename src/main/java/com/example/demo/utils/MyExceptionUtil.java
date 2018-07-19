package com.example.demo.utils;

import com.example.demo.entity.MyException;

//异常的utile
public class MyExceptionUtil {
//    如果成功的话就是成功 代码是0 成功的时间外面传
    public static MyException sucees(Object object){
        MyException myException = new MyException();
        myException.setCode(0);
        myException.setMsg("成功");
        myException.setData(object);
        return myException;
    }
    //    如果成功的话就是成功 代码是0 成功的外面为null
    public static MyException sucees(){
        MyException myException = new MyException();
         return sucees(null);
    }


//    失败的话 外面传过来自定义的失败代码   还有失败信息
    public static MyException error(Integer code,String msg){
        MyException myException = new MyException();
        myException.setCode(code);
        myException.setMsg(msg);
        return myException;
    }
}
