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
		action="${pageContext.request.contextPath }/user/query" method="get">
		用户名称： <input type="text" name="userName" id="userName"
			class="abc input-default" placeholder="" value="${user.userName }">&nbsp;&nbsp;

		邮箱： <input type="text" name="email" id="email"
			class="abc input-default" placeholder="" value="${user.email }">&nbsp;&nbsp;
		<button type="submit" class="btn btn-primary">查询</button>
		&nbsp;&nbsp;
		<button type="button" class="btn btn-success" id="addnew">新增用户</button>
	</form>
	<table class="table table-bordered table-hover definewidth m10">
		<thead>
			<tr>
				<th>用户id</th>
				<th>用户名称</th>
				<th>真实姓名</th>
				<th>邮箱</th>
				<th>手机</th>
				<th>角色</th>
				<th>操作</th>
			</tr>
		</thead>
		<c:forEach items="${pageInfo.list }" var="list">
			<tr>
				<td>${list.userId }</td>
				<td>${list.userName }</td>
				<td>${list.realName }</td>
				<td>${list.email }</td>
				<td>${list.phone }</td>
				<td><c:forEach items="${list.roles }" var="roles">
						${roles.roleName }
					</c:forEach></td>
				<td><a
					href="${pageContext.request.contextPath }/user/update?userId=${list.userId}">编辑</a>
					<a
					href="${pageContext.request.contextPath }/user/delete?userId=${list.userId}">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div class="row">
			<div class="col-sm-12">
				<div class="dataTables_info" id="DataTables_Table_0_info"
					role="alert" aria-live="polite" aria-relevant="all">
					<c:if test="${pageInfo.pageNum != 1 }">
						<a href="?pageNum=${pageInfo.prePage}">上一页</a>
					</c:if>
					<a href="?pageNum=1">首页</a> <a href="?pageNum=${pageInfo.pages}">尾页</a>
					<c:if test="${pageInfo.pageNum != pageInfo.pages}">
						<a href="?pageNum=${pageInfo.nextPage}">下一页</a>
					</c:if>

					显示第${pageInfo.pageNum}页/共${pageInfo.pages }页，共${pageInfo.total}条
				</div>
			</div>
		</div>
</body>
</html>
<script>
	$(function() {

		$('#addnew')
				.click(
						function() {

							window.location.href = "${pageContext.request.contextPath }/user/queryRole";
						});

	});

	function del(id) {

		if (confirm("确定要删除吗？")) {

			var url = "index.html";

			window.location.href = url;

		}

	}
</script>