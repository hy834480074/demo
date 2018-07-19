package com.example.demo.handler;

import com.example.demo.aop.HttpAspect;
import com.example.demo.entity.MyException;
import com.example.demo.exception.AreaException;
import com.example.demo.utils.MyExceptionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 捕获异常类   最后把code 错误代码  msg错误信息写成枚举    统一管理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
////    可以处理所有的异常处理这种写法  value="自定义错误的名字.class"
//    @ExceptionHandler(value = Exception.class)
//    @ResponseBody
//    private Map<String,Object> exceptionHandler(HttpServletRequest req,Exception e){
//        HashMap<String, Object> modelMap = new HashMap<>();
////        因为异常了所以报错 所以就是false
//        modelMap.put("success",false);
////        返回为什么是false的解释
//        modelMap.put("errMsg",e.getMessage());
////        return 到前台
//        return modelMap;
//    }



    //    可以处理所有的异常处理这种写法  value="自定义错误的名字.class"
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private MyException  handler(Exception e){
        if(e instanceof AreaException){
            AreaException areaException = (AreaException) e;
            return MyExceptionUtil.error(100,e.getMessage());
        }
        logger.error("系统异常",e);
        return MyExceptionUtil.error(-1,"未知错误");
    }


}
