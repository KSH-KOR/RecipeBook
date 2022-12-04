<%--
  Created by IntelliJ IDEA.
  User: UserK
  Date: 2022-12-04
  Time: 오후 2:40
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Recipe</h1>

<form:form modelAttribute="editIngredientInfo" method="post" action="../editIngredientOk">
  <form:hidden path ="ingredientID"/>
  <table id = "edit">
    <tr><td>Ingredient Name:</td><td><form:input path="name"/></td></tr>
    <tr><td>Amount:</td><td><form:input path="weight"/></td></tr>
    <tr><td>unit:</td><td><form:input path="unit"/></td></tr>
    <tr><td colspan="2">
      <input type="submit" value="Edit Recipe"/>
      <input type="button" value="Cancel" onclick="history.back()"/>
    </td></tr>
  </table>
</form:form>
</body>
</html>
