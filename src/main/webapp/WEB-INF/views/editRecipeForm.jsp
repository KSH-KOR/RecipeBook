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

<form:form modelAttribute="editRecipeInfo" method="post" action="../editRecipeOk">
  <form:hidden path ="recipeID"/>
  <table id = "edit">
    <tr>
      <td>종류:</td>
      <td><form:select name="category" path="category">
        <option value="">category</option>
        <option value="korean">korean</option>
        <option value="western">western</option>
        <option value="mexican">mexican</option>
        <option value="japanese">japanese</option>
        <option value="others">others</option>
      </form:select></td>
    </tr>
    <tr><td>Name:</td><td><form:input path = "name"/></td></tr>
    <tr><td>rating:</td><td><form:input path = "rating"/></td></tr>

    <tr><td>description</td><td><form:textarea cols="50" rows ="5" path = "description"/></td></tr>
  </table>
  <input type="submit" value="Edit Recipe"/>
  <input type="button" value="Cancel" onclick="history.back()"/>
</form:form>
</body>
</html>
