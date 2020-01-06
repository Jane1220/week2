<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/index3.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<title>Insert title here</title>
</head>
<body>

<form action="list" method="post">

id编号模糊查询：<input type="text" name="id"/>
keywords模糊查询：<input type="text" name="gj"/><br>
description模糊查询:<input type="text" name="ms"/>
 公司名称模糊查询:<input type="text" name="name"/><br>
主营产品模糊查询:<input type="text" name="brand"/>
 地址模糊查询:<input type="text" name="address"/><br>
 注册资本范围查询:<input type="text" name="price1"/>--<input type="text" name="price2"/>
成立时间范围查询:<input type="text" name="s1"/>--<input type="text" name="s2"/>
年检日期范围查询:<input type="text" name="n1"/>--<input type="text" name="n2"/>
年检状态选择查询:<input type="text" name="status"/>
<input type="submit" value="查询"/>
</form>

<table>
	<tr>
		<td>编号</td>
		<td>关键字</td>
		<td>描述</td>
		<td>公司名称</td>
		<td>主营产品</td>
		<td>地址</td>
		<td>注册资本</td>
		<td>成立时间</td>
		<td>年检日期</td>
		<td>年检状态</td>
		<td>备注</td>
	</tr>
	<c:forEach items="${info.list }" var="b">
	<tr>
		<td>${b.id }</td>
		<td>${b.gj }</td>
		<td>${b.ms }</td>
		<td>${b.name }</td>
		<td>${b.brand }</td>
		<td>${b.address }</td>
		<td>${b.price }</td>
		<td>${b.starttime }</td>
		<td>${b.njtime }</td>
		<td>${b.status }</td>
		<td>${b.bz }</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="11">
		当前页${info.pageNum }/${info.pages }--总条数${info.total }
			<a href="list?pageNum=1&id=${vo.id }&gj=${vo.gj }
			&ms=${vo.ms }&name=${vo.name }&brand=${vo.brand }&address=${vo.address }
			&price1=${vo.price1 }&price2=${vo.price2 }&s1=${vo.s1 }&s2=${vo.s2 }&n1=${vo.n1 }
			&n2=${vo.n2 }&status=${vo.status }">首页</a>
			<a href="list?pageNum=${info.prePage }&id=${vo.id }&gj=${vo.gj }
			&ms=${vo.ms }&name=${vo.name }&brand=${vo.brand }&address=${vo.address }
			&price1=${vo.price1 }&price2=${vo.price2 }&s1=${vo.s1 }&s2=${vo.s2 }&n1=${vo.n1 }
			&n2=${vo.n2 }&status=${vo.status }">上一页</a>
			<a href="list?pageNum=${info.nextPage }&id=${vo.id }&gj=${vo.gj }
			&ms=${vo.ms }&name=${vo.name }&brand=${vo.brand }&address=${vo.address }
			&price1=${vo.price1 }&price2=${vo.price2 }&s1=${vo.s1 }&s2=${vo.s2 }&n1=${vo.n1 }
			&n2=${vo.n2 }&status=${vo.status }">下一页</a>
			<a href="list?pageNum=${info.pages }&id=${vo.id }&gj=${vo.gj }
			&ms=${vo.ms }&name=${vo.name }&brand=${vo.brand }&address=${vo.address }
			&price1=${vo.price1 }&price2=${vo.price2 }&s1=${vo.s1 }&s2=${vo.s2 }&n1=${vo.n1 }
			&n2=${vo.n2 }&status=${vo.status }">尾页</a>
		</td>
	</tr>
</table>
</body>
</html>