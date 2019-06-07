<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="msg" value="${msg}"/>
    <json:array name="jsonArray" var="first" items="${firstList}">
        <json:object>
            <json:property name="id" value="${first.id}"/>
            <json:property name="title" value="${first.title}"/>
            <json:property name="status" value="${first.status}"/>
            <json:property name="create_time" value="${first.create_time}"/>
            <json:property name="update_time" value="${first.update_time}"/>
            <json:property name="editor" value="${first.editor}"/>
        </json:object>
    </json:array>
</json:object>

