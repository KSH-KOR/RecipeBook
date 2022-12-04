<%--
  Created by IntelliJ IDEA.
  User: UserK
  Date: 2022-12-04
  Time: 오후 2:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Recipe</h1>

<form:form modelAttribute = "Recipe" method = "POST" action = "../editok">
  <form:hidden path ="id"/>
  <table id = "edit">
    <tr>
      <td>종류:</td>
      <td><form:select name="category" path="category">
        <option value="">종류선택</option>
        <option value="한식">한식</option>
        <option value="중식">중식</option>
        <option value="일식">일식</option>
        <option value="베트남 음식">베트남 음식</option>
      </form:select></td>
    </tr>
    <tr><td>Name:</td><td><form:input path = "name"/></td></tr>
    <tr><td>rating:</td><td><form:input path = "rating"/></td></tr>
    <tr>
      <td>Ingredients:</td>
      <td><form:input path = "name"/>
<%--        재료를 어떻게 불러와야할지 모르겠음..--%>
        <form:input path = "name"/>
        <form:input path = "name"/></td>
    </tr>
    <tr><td>description</td><td><form:textarea cols="50" rows ="5" path = "description"/></td></tr>
  </table>
  <input type="submit" value="수정하기"/>
  <input type="button" value="취소하기" onclick="history.back()"/>
</form:form>
</body>
</html>
