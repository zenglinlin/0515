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
	<form action="${pageContext.request.contextPath}/role/menuAssignment"
		method="post" class="definewidth m20">
		<input type="hidden" name="roleId" value="${roleId}" />
		<table class="table table-bordered table-hover definewidth m10">
			<tr>
				<td width="10%" class="tableleft">菜单权限</td>
				<td><c:forEach items="${roleMenu}" var="menu">
						<c:forEach begin="1" end="${menu.m1}">
            			&nbsp;&nbsp;&nbsp;&nbsp;
            		</c:forEach>
						<input type="checkbox" name="checkMenuIds"
							${menu.checked?'checked':''} value="${menu.menuId}">${menu.menuName}
            		<br />
					</c:forEach></td>
			</tr>

			<tr>
				<td class="tableleft"></td>
				<td>
					<button type="submit" class="btn btn-primary" type="button">分配菜单</button>
					&nbsp;&nbsp;
					<button type="button" class="btn btn-success" name="backid"
						id="backid">返回列表</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
<script>
	$(function() {
		$(':checkbox[name="group[]"]').click(
				function() {
					$(':checkbox', $(this).closest('li')).prop('checked',
							this.checked);
				});

		$('#backid').click(function() {
			window.location.href = "index.html";
		});
	});
</script>