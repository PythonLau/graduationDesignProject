<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/2/24 0024
  Time: 上午 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html; charset=UTF-8">
    <title>测试接收JSON格式的数据</title>
    <script src="${pageContext.request.contextPath}/test/js/common/jquery-2.2.4.min.js" rel="script"></script>
    <script src="${pageContext.request.contextPath}/test/js/common/json2.js" rel="script"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            testRequestBody();
        });
        function testRequestBody() {
            $.ajax({
                url : "${pageContext.request.contextPath}/testRequestBody",
                dataType : "json",
                type : "post",
                contentType : "application/json",
                data:JSON.stringify({id : 1,name : "Spring MVC企业应用实战"}),
                async : true,
                success : function(data) {
                    console.log(data);
                    $("#id").html(data.id);
                    $("#name").html(data.name);
                    $("#author").html(data.author);
                },
                error:function(){
                    alert("数据发送失败");
                }
            });
        }
    </script>
</head>
<body>
编号:<span id="id"></span><br>
书名:<span id="name"></span><br>
作者:<span id="author"></span><br>
</body>
</html>
