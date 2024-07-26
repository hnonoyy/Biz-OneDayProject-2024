<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<link rel="stylesheet" href="${rootPath }/static/css/memo/list.css">
<section class="memo input" >
	<form method="post">
		<input type="date"> <input type="time"> 
		<button>새로작성</button>
	</form>
	<c:forEach items="${MEMO_LIST}" var="ML">
		<div>
			<p>${ML.m_title }</p>
		</div>
	</c:forEach>
</section>