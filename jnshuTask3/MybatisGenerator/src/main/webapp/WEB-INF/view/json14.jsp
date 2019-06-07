<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="msg" value="${msg}"/>
    <json:array name="jsonArray" var="user" items="${userList}">
        <json:object>
            <json:property name="id" value="${user.id}"/>
            <json:property name="user" value="${user.user}"/>
            <json:property name="password" value="${user.password}"/>
            <json:property name="nickname" value="${user.nickname}"/>
            <json:property name="create_time" value="${user.create_time}"/>
            <json:property name="creator" value="${user.creator}"/>
        </json:object>
    </json:array>
</json:object>

