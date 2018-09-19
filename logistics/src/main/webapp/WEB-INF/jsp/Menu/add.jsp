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
	<form action="${pageContext.request.contextPath }/menu/add" method="post" class="definewidth m20">
		<table class="table table-bordered table-hover m10">
			<tr>
				<td class="tableleft">菜单名称</td>
				<td><input type="text" name="menuName" /></td>
			</tr>
			<tr>
				<td class="tableleft">地址</td>
				<td><input type="text" name="menuLink" /></td>
			</tr>
			<tr>
				<td class="tableleft">权限名称</td>
				<td><input type="text" name="securityName" /></td>
			</tr>
			<tr>
				<td width="10%" class="tableleft">父菜单</td>
				<td><select name="menuParentId">
					<c:forEach items="${menuList }" var="menu">
						<c:if test="${menu.m1==1 }"><option>${menu.menuName }</option></c:if>
						<c:if test="${menu.m1==2 }"><option>&nbsp;&nbsp;&nbsp;&nbsp;${menu.menuName }</option></c:if>
						<c:if test="${menu.m1==3 }"><option></option></c:if>
					</c:forEach>
				</select>
				</td>
			</tr>

			<tr>
				<td class="tableleft">描述</td>
				<td><input type="text" name="menuDesc" /></td>
			</tr>

			<tr>
				<td class="tableleft"></td>
				<td>
					<button type="submit" class="btn btn-primary" type="button">保存</button>
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
		$('#backid').click(function() {
			window.location.href = "index.html";
		});

	});
</script>