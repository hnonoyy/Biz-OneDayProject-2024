<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<link rel="stylesheet" href="${rootPath }/static/css/memo/input.css">
<section class="memo input" >
	<form method="post">
		<input type="text" placeholder="제목을 입력하세요" name="title">
		<textarea placeholder="내용을 입력하세요" name="memo"></textarea>
		<button>저장</button>
	</form>
</section>