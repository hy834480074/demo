<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/js/bootstrap-3.3.7-dist/css/bootstrap-theme.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/js/css/login.css" rel="stylesheet">
    <script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function(){
            $(":button").click(function(){
                var falg = confirm("确认提交？");
                if(falg){
                    return true;
                }else{
                    return false;
                }
            })
        })
    </script>
<body>
<div class="niuniu">
    <form action="user/nice">
        <table>
            <tr>
                <td><label for="exampleInputPassword1">账户：</label></td>
                <td><label for="exampleInputPassword1">${sessionScope.user.name}</label></td>
            </tr>
            <tr>
                <td><label for="exampleInputPassword1">密码：</label></td>
                <td><label for="exampleInputPassword1">${sessionScope.user.password}</label></td>
            </tr>
            <tr>
                <td><label for="exampleInputPassword1">年龄：</label></td>
                <td><label for="exampleInputPassword1">${sessionScope.user.age}</label></td>
            </tr>
            <tr>
                <td><label for="exampleInputPassword1">注册时间：</label></td>
                <td><label for="exampleInputPassword1">${sessionScope.user.jointime}</label></td>
            </tr>

            <tr>
                <td><label for="exampleInputPassword1">报名科目：</label></td>
                <td>
                    <select name="opt">
                        <c:forEach items="${sessionScope.classes }" var="sb">
                            <option>${sb.name }</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td olspan="2"><button name="choose"  class="btn btn-warning">确认</button></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
