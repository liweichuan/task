<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="msg" value="${msg}"/>
    <json:array name="jsonArray" var="studio" items="${studioList}">
        <json:object>
            <json:property name="id" value="${studio.id}"/>
            <json:property name="title" value="${studio.title}"/>
            <json:property name="status" value="${studio.status}"/>
            <json:property name="create_time" value="${studio.create_time}"/>
            <json:property name="update_time" value="${studio.update_time}"/>
            <json:property name="editor" value="${studio.editor}"/>
            <json:property name="picture" value="${studio.picture}"/>
            <json:property name="text" value="${studio.text}"/>
        </json:object>
    </json:array>
</json:object>

