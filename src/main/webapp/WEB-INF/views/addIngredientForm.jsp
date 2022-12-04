<%--
  Created by IntelliJ IDEA.
  User: UserK
  Date: 2022-12-04
  Time: 오후 4:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>Add New Ingredient</h1>
<form action="addIngredientOk" method="post">
  <table>
    <tr><td>Ingredient Name:</td><td><input type="text" name="name"/></td><tr/>
    <tr><td>Amount:</td><td><input type="text" name="weight"/></td>
      <td>Unit:</td><td><input type="text" name="unit"/></td></tr><tr/>
    <tr><td colspan="2">
      <input type="submit" value="Add Ingredient"/>
      <input type="button" value="Cancel" onclick="history.back()"/>
    </td></tr>
  </table>
</form>
</body>
</html>