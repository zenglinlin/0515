<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<head>
<title></title>
<meta charset="UTF-8">

<link
	href="${pageContext.request.contextPath }/resources/css/bootstrap.min.css?v=3.3.6"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath }/resources/css/font-awesome.min.css?v=4.4.0"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath }/resources/css/animate.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath }/resources/css/style.css?v=4.1.0"
	rel="stylesheet">

<style type="text/css">
body {
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}

@media ( max-width : 980px) {
	/* Enable use of floated navbar text */
	.navbar-text.pull-right {
		float: none;
		padding-left: 5px;
		padding-right: 5px;
	}
}
</style>
<script
	src="${pageContext.request.contextPath }/resources/js/jquery.min.js?v=2.1.4"></script>
<script
	src="${pageContext.request.contextPath }/resources/js/bootstrap.min.js?v=3.3.6"></script>
</head>
<body>
	<form class="form-inline definewidth m20"
		action="${pageContext.request.contextPath }/menu/query" method="get">
		菜单名称： <input type="text" name="menuName" id="menuName"
			class="abc input-default" placeholder="" value="">&nbsp;&nbsp;
		<button type="submit" class="btn btn-primary">查询</button>
		&nbsp;&nbsp;
		<button type="button" class="btn btn-success" id="addnew">新增菜单</button>
	</form>
	<table class="table table-bordered table-hover definewidth m10">
		<thead>
			<tr>
				<th>菜单编号</th>
				<th>菜单名称</th>
				<th>地址</th>
				<th>权限名称</th>
				<th>父菜单编号</th>
				<th>描述</th>
				<th>管理操作</th>
			</tr>
		</thead>

		<c:forEach items="${menuList}" var="menu">
			<tr>
				<td>${menu.menuId }</td>
				<td><c:if test="${menu.m1==1 }">
						<option>${menu.menuName }</option>
					</c:if> <c:if test="${menu.m1==2 }">
						<option>&nbsp;&nbsp;&nbsp;&nbsp;${menu.menuName }</option>
					</c:if> <c:if test="${menu.m1==3 }">
						<option>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${menu.menuName }</option>
					</c:if></td>
				<td>${menu.menuLink }</td>
				<td>${menu.securityName }</td>
				<td>${menu.menuParentId }</td>
				<td>${menu.menuDesc }</td>
				<td><a href="${pageContext.request.contextPath }">编辑</a> <a
					href="${pageContext.request.contextPath }">删除</a></td>
			</tr>
		</c:forEach>



	</table>

</body>
</html>
<script>
	$(function() {

		$('#addnew')
				.click(
						function() {

							window.location.href = "${pageContext.request.contextPath }/menu/add";
						});

	});
</script>