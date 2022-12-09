<%--
  Created by IntelliJ IDEA.
  User: chzhv
  Date: 2022-12-09
  Time: 오전 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <style>
    img, label { display:inline-block;}
    label{ width:130px}
    button{ background-color:blue; color:white;font-size:15px}
  </style>
</head>
<body>
<div style='width:100%;text-align:center;padding-top:100px'>
  <form method="post" action="loginOk">
    <div><label>User ID: </label><input type='text' name='userid' /></div>
    <div><label>Password: </label>
      <input type='password' name='password' /></div>
    <button type='submit'>login</button>
  </form>
</div>
</body>
</html>