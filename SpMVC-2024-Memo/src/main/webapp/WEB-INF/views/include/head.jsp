<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Today Memo</title>
	<link href="${rootPath}/static/css/main.css" rel="stylesheet" />
	<link href="${rootPath}/static/css/memo/list.css" rel="stylesheet" />
	<link href="${rootPath}/static/css/memo/input.css" rel="stylesheet" />
	<script>
		const rootPath = "${rootPath}"
	</script>
	<script src="${rootPath}/static/js/memo/list.js"></script>
</head>