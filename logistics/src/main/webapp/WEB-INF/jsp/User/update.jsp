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
	<form action="${pageContext.request.contextPath }/user/update"
		method="post" class="definewidth m20">
		<input type="hidden" name="user.userId" value="${selectUser.userId }"/>
		<table class="table table-bordered table-hover definewidth m10">
			<tr>
				<td width="10%" class="tableleft">登录名</td>
				<td>${selectUser.userName }</td>
			</tr>
			<tr>
				<td class="tableleft">密码</td>
				<td><input type="password" name="user.password"
					value="${selectUser.password }" /></td>
			</tr>
			<tr>
				<td class="tableleft">真实姓名</td>
				<td><input type="text" name="user.realName"
					value="${selectUser.realName }" /></td>
			</tr>
			<tr>
				<td class="tableleft">邮箱</td>
				<td><input type="text" name="user.email"
					value="${selectUser.email }" /></td>
			</tr>

			<tr>
				<td class="tableleft">手机</td>
				<td><input type="text" name="user.phone"
					value="${selectUser.phone }" /></td>
			</tr>
			<tr>
				<td class="tableleft">角色</td>
				<td>
					<c:forEach items="${roleList}" var="role">
						<c:set var="isChecked" value="false" />
							<c:forEach items="${selectRole}" var="checkedRoleId">
								<c:if test="${checkedRoleId == role.roleId}">
									<c:set var="isChecked" value="true" />
								</c:if>
							</c:forEach>
						<input type="checkbox" name="addRoles"
							value="${role.roleId }" ${isChecked?'checked':''} />${role.roleName }
        			</c:forEach>
        		</td>
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
		$('#backid')
				.click(
						function() {
							window.location.href = "${pageContext.request.contextPath }/user/query";
						});

	});
</script>