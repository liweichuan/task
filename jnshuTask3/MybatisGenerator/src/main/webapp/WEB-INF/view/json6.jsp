<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="msg" value="${msg}"/>
    <json:array name="jsonArray" var="comment" items="${commentList}">
        <json:object>
            <json:property name="id" value="${comment.id}"/>
            <json:property name="title" value="${comment.title}"/>
            <json:property name="type" value="${comment.type}"/>
            <json:property name="reply_id" value="${comment.reply_id}"/>
            <json:property name="nickname" value="${comment.nickname}"/>
            <json:property name="status" value="${comment.status}"/>
            <json:property name="create_time" value="${comment.create_time}"/>
            <json:property name="update_time" value="${comment.update_time}"/>
            <json:property name="editor" value="${comment.editor}"/>
            <json:property name="text" value="${comment.text}"/>
        </json:object>
    </json:array>
</json:object>

