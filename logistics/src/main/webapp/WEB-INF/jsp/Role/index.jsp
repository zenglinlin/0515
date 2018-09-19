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
	<form class="form-inline definewidth m20" action="${pageContext.request.contextPath }/role/query"
		method="get">
		角色名称： <input type="text" name="roleName" id="roleName"
			class="abc input-default" placeholder="" value="">&nbsp;&nbsp;
		<button type="submit" class="btn btn-primary">查询</button>
		&nbsp;&nbsp;
		<button type="button" class="btn btn-success" id="addnew">新增角色</button>
	</form>
	<table class="table table-bordered table-hover definewidth m10">
		<thead>
			<tr>
				<th>角色id</th>
				<th>角色名称</th>
				<th>描述</th>
				<th>操作</th>
			</tr>
		</thead>
		<c:forEach items="${roleList }" var="role">
			<tr>
				<td>${role.roleId}</td>
				<td>${role.roleName}</td>
				<td>${role.roleDesc}</td>
				<td>
					<a href="${pageContext.request.contextPath }/role/update?roleId=${role.roleId}">编辑角色</a>
					<a href="${pageContext.request.contextPath }/role/addPower">菜单权限分配</a>
					<a href="#" onclick="del(${role.roleId})">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

<script>
	$(function() {

		$('#addnew').click(function() {

			window.location.href = "${pageContext.request.contextPath }/role/addOne";
		});

	});

	function del(id) {
		if (confirm("确定要删除吗？")) {
			//发送ajax请求
			$.ajax({
				url: "${pageContext.request.contextPath}/role/delete",
				data: {"roleId": id},
				type: "POST",
				dataType: "json",
				success: function(data) {
					if(data.status == 1){
						window.location.href 
							= "${pageContext.request.contextPath}/role/query";
					}
					else if(data.status == 2){
						alert("删除失败,有用户分配了此角色");
					}
					else {
						alert("删除失败");
					}
				}
			});
		}
	}
</script>