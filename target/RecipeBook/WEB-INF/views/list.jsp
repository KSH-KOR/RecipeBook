
<%--
  Created by IntelliJ IDEA.
  User: UserK
  Date: 2022-12-04
  Time: 오후 2:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>free board</title>
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
    <script>
        function delete_ok(id){
            const a = confirm("정말로 삭제하겠습니까?");
            if(a) location.href='deleteRecipeOk/' + id;
        }
    </script>
</head>
<body>
<h1>요리게시판</h1>
<%--<%--%>
<%--    BoardDAO boardDAO = new BoardDAO();--%>
<%--    List<BoardVO> list = boardDAO.getBoardList();--%>
<%--    request.setAttribute("list",list);--%>
<%--%>--%>
<table id="list" width="90%">
    <tr>
        <th>Id</th>
        <th>Category</th>
        <th>Name</th>
        <th>rating</th>
        <th>description</th>
        <th>Regdate</th>
        <th>Editdate</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${recipeList}" var="u">
        <tr>
            <td>${u.recipeID}</td>
            <td>${u.category}</td>
            <td>${u.name}</td>
            <td>${u.rating}</td>
            <td><div style="white-space: pre-line">
                <c:out value="${u.description}"/>
            </div> </td>
            <td>${u.createdTime}</td>
            <td>${u.lastModifiedTime}</td>
            <td><a href="editRecipe/${u.recipeID}">Edit</a></td>
            <td><a href="javascript:delete_ok('${u.recipeID}')">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br/><a href="addRecipe">Add New Recipe</a>
</body>
</html>
