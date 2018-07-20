
    $(function(){
        function set(set,st){
            $("form").attr(set,st);
            $("form").submit();
        }
        $(":button").click(function(){
            var name = $(":text[name='name']").val();
            var password = $(":text[name='password']").val();
            var choose = $(this).text();
            $.ajax({
                url:"user/login",
                type:"post",
                dataType:"text",
                data:{
                    "choose":choose,
                    "name":name,
                    "password":password
                },
                success:function(data){
                    if(data==="success"){
                        set("action","user/lookAll")
                    }else if(data==="sb"){
                        alert("账号密码错误")
                        set("action","user/back")
                    }else{
                        set("action","user/register")
                    }
                }
            })
        })
    })
