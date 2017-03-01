<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/2/24 0024
  Time: 上午 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html; charset=UTF-8">
    <title>测试接收JSON格式的数据</title>
    <script src="${pageContext.request.contextPath}/test/js/common/jquery-2.2.4.min.js" rel="script"></script>
    <script src="${pageContext.request.contextPath}/test/js/common/json2.js" rel="script"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            sendxml();
        });
        function sendxml() {
            var xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
                "<book><id>1</id><name>疯狂java讲义</name><author>李刚</author></book>";
            $.ajax({
                url : "${pageContext.request.contextPath}/sendxml",
                type : "POST",
                contentType : "application/xml",
                data : xmlData,
                async : true,
            });
        }
    </script>
</head>
<body>
</body>
</html>