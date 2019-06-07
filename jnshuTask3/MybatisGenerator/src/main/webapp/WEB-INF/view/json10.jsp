<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="msg" value="${msg}"/>
    <json:array name="jsonArray" var="second" items="${secondList}">
        <json:object>
            <json:property name="id" value="${second.id}"/>
            <json:property name="title" value="${second.title}"/>
            <json:property name="status" value="${second.status}"/>
            <json:property name="main_menu_title" value="${second.main_menu_title}"/>
            <json:property name="create_time" value="${second.create_time}"/>
            <json:property name="update_time" value="${second.update_time}"/>
            <json:property name="editor" value="${second.editor}"/>
        </json:object>
    </json:array>
</json:object>

