<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap-theme.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/js/css/information.css" rel="stylesheet">

    <script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function(){

            /*点击显示\隐藏*/
            $('.modify_frame').hide();
            var count = 1;

            $('.modify').click(function() {
                if (count % 2 != 0) {
                    $(this).next().show(100);
                }
                else {
                    $(this).next().hide(100);
                }
                count++;
            })



            function seta(name){
                if(name==='删除'){
                    return true
                }else{
                    return false
                }
            }
            function boo(a){
                var falg = confirm(a+"?")
                if(falg){
                    return true
                }else{
                    return false
                }
            }

            $("a").click(function(){
                var choose = $(this).text()
                if(seta(choose)){
                    boo(choose)
                }else{
                    boo(choose)
                }
            })
        })
    </script>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<body>
<div class="ak47">
    <table>
        <tr>
            <td><label for="exampleInputPassword1">id:</label></td>
            <td><label for="exampleInputPassword1">女友:</label></td>
            <td><label for="exampleInputPassword1">胸罩:</label></td>
            <td><label for="exampleInputPassword1">加入时间:</label></td>
            <td><label for="exampleInputPassword1">修改时间:</label></td>
            <td><label for="exampleInputPassword1">删除:</label></td>
            <td><label for="exampleInputPassword1">修改:</label></td>
        </tr>

        <c:forEach items="${requestScope.lists }" var="xoxo">
            <tr>
                <td><label for="exampleInputPassword1">${xoxo.areaId }</label></td>
                <td><label for="exampleInputPassword1">${xoxo.areaName }</label></td>
                <td><label for="exampleInputPassword1">${xoxo.priority }</label></td>
                <td><label for="exampleInputPassword1">${xoxo.createTime }</label></td>
                <td><label for="exampleInputPassword1">${xoxo.lastEditTime }:</label></td>

                <td><label for="exampleInputPassword1">
                    <a href="javascript:void(0)" name="choose">删除</a>
                    <div class="modify_frame">
                        <input type="text"><button>删除</button>
                    </div>
                </label></td>
                <td><label for="exampleInputPassword1"><a href="javascript:void(0)" name="choose">修改</a></label></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
