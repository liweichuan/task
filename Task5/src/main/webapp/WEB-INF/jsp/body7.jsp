<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"
         isELIgnored="false" %>

    <%--@elvariable id="studentList" type="java.util.List"--%>

<json:object>
            <json:property name="code" value="${result1.code}"/>
            <json:property name="message" value="${result1.message}"/>
            <json:property name="data" value="${result1.data}"/>
</json:object>
