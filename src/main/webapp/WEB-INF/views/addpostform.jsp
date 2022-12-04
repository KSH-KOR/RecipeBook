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
<form action="addok" method="post">
    <table>
        <tr><td>Category:</td><td><select name="category">
            <option value="">없음</option>
            <option value="한식">한식</option>
            <option value="중식">중식</option>
            <option value="일식">일식</option>
            <option value="일식">양식</option>
            <option value="베트남 음식">베트남 음식</option>
        </select></td></tr>
        <tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
        <tr><td>rating:</td><td><input type="text" name="rating"/></td></tr>
        <tr>
            <td>Ingredients:</td>
            <td>
                <table id="list" width="90%">
                    <tr>
                        <th>Name</th>
                        <th>weight</th>
                        <th>unit</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                    <c:forEach items="${list}" var="u">
                        <tr>
                            <td>${u.name}</td>
                            <td>${u.weight}</td>
                            <td>${u.unit}</td>
                            <td><a href="editform/${u.getId()}">Edit</a></td>
                            <td><a href="javascript:delete_ok('${u.getId()}')">Delete</a></td>
                        </tr>
                    </c:forEach>
                </table>
                <br/><a href="add">Add New Ingredient</a>
            </td>

        </tr>

        <tr><td>description:</td><td><textarea cols="50" rows="5" name="description"> </textarea></td></tr>
        <tr><td align="right"><input type="submit" value="Add Recipe"/></td></tr>
    </table>
</form>
</body>
</html>
