<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"
         isELIgnored="false" %>

<%--
  这个页面主要来压测josn
--%>
<json:object>
    <json:array name="studentJson" var="Student" items="${studentList}">
      <json:object>
          <json:property name="id" value="${Student.id}"/>
          <json:property name="name" value="${Student.name}"/>
          <json:property name="picture" value="${Student.picture}"/>
          <json:property name="working" value="${Student.working}"/>
          <json:property name="company" value="${Student.company}"/>
          <json:property name="job" value="${Student.job}"/>
          <json:property name="profession_id" value="${Student.profession_id}"/>
          <json:property name="expreience" value="${Student.expreience}"/>
          <json:property name="excellent" value="${Student.excellent}"/>
          <json:property name="create_time" value="${Student.create_time}"/>
          <json:property name="update_time" value="${Student.update_time}"/>
          <json:property name="create_by" value="${Student.create_by}"/>
          <json:property name="update_by" value="${Student.update_by}"/>
      </json:object>
   </json:array>
</json:object>