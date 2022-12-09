<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: UserK
  Date: 2022-12-04
  Time: 오후 2:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #list {
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }
        #list td, #list th {
            border: 1px solid #ddd;
            padding: 8px;
            text-align:center;
        }
        #list tr:nth-child(even){background-color: #f2f2f2;}
        #list tr:hover {background-color: #ddd;}
        #list th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: center;
            background-color: #006bb3;
            color: white;
        }

    </style>
</head>
<body>
<h1>Add New Recipe</h1>
<form action="addRecipeOk" method="post">
    <table>
        <tr><td>Recipe Name:</td><td><input type="text" name="name"/></td></tr>
        <tr><td>Category:</td><td>
            <select name="category">
                <option value="">category</option>
                <option value="korean">korean</option>
                <option value="western">western</option>
                <option value="mexican">mexican</option>
                <option value="japanese">japanese</option>
                <option value="others">others</option>
            </select>
        </td></tr>
        <tr><td>rating:</td>
            <td><input type="radio" id="contactChoice1"
                       name="rating" value="1">
                <label for="contactChoice1">1star</label>

                <input type="radio" id="contactChoice2"
                       name="rating" value="2">
                <label for="contactChoice2">2star</label>

                <input type="radio" id="contactChoice3"
                       name="rating" value="3">
                <label for="contactChoice3">3star</label>
                </td>
        </tr>
        <tr><td>description:</td><td><textarea cols="50" rows="5" name="description"> </textarea></td></tr>
        <tr><td colspan="2">
            <input type="submit" value="Add Recipe"/>
            <input type="button" value="Cancel" onclick="history.back()"/>
        </td></tr>
    </table>
</form>
</body>
</html>
