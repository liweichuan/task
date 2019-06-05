<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="msg" value="${msg}"/>
    <json:array name="jsonArray" var="banner" items="${bannerList}">
        <json:object>
            <json:property name="id" value="${banner.id}"/>
            <json:property name="page" value="${banner.page}"/>
            <json:property name="editor" value="${banner.editor}"/>
            <json:property name="url" value="${banner.url}"/>
            <json:property name="status" value="${banner.status}"/>
            <json:property name="create_time" value="${banner.create_time}"/>
            <json:property name="update_time" value="${banner.update_time}"/>
        </json:object>
    </json:array>
</json:object>
