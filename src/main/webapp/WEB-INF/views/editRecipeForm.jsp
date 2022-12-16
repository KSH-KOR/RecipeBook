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
  <form:hidden path ="recipeId"/>
  <table id = "edit">
    <tr>
      <td>category:</td>
      <td><form:select name="category" path="category">
        <form:option value="">category</form:option>
        <form:option value="korean">korean</form:option>
        <form:option value="western">western</form:option>
        <form:option value="mexican">mexican</form:option>
        <form:option value="japanese">japanese</form:option>
        <form:option value="others">others</form:option>
      </form:select></td>
    </tr>
    <tr><td>Recipe Name:</td><td><form:input path = "name"/></td></tr>
    <tr><td>rating:</td>
      <td>

      <input type="radio" id="contactChoice1"
                 name="rating" value="1">
        <label for="contactChoice1">1star</label>

        <input type="radio" id="contactChoice2"
               name="rating" value="2">
        <label for="contactChoice2">2star</label>

        <input type="radio" id="contactChoice3"
               name="rating" value="3" checked>
        <label for="contactChoice3">3star</label>

      </td>
    </tr>
    <tr><td>description</td><td><form:textarea cols="50" rows ="5" path = "description"/></td></tr>
    <tr><td colspan="2">
      <input type="submit" value="Edit Recipe"/>
      <input type="button" value="Cancel" onclick="history.back()"/>
    </td></tr>
  </table>
</form:form>
</body>
</html>
