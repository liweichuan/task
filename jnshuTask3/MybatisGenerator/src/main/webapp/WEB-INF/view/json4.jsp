<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="msg" value="${msg}"/>
    <json:array name="jsonArray" var="art" items="${artList}">
        <json:object>
            <json:property name="id" value="${art.id}"/>
            <json:property name="title" value="${art.title}"/>
            <json:property name="main_menu_title" value="${art.main_menu_title}"/>
            <json:property name="second_menu_title" value="${art.second_menu_title}"/>
            <json:property name="status" value="${art.status}"/>
            <json:property name="create_time" value="${art.create_time}"/>
            <json:property name="update_time" value="${art.update_time}"/>
            <json:property name="editor" value="${art.editor}"/>
            <json:property name="introduction" value="${art.introduction}"/>
            <json:property name="thumbnail" value="${art.thumbnail}"/>
            <json:property name="video_link" value="${art.video_link}"/>
            <json:property name="art_picture" value="${art.art_picture}"/>
            <json:property name="text" value="${art.text}"/>
        </json:object>
    </json:array>
</json:object>
