<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file = "/include/certification.jsp" %>
<c:set var="ctp" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>test5.jsp</title>
  <%@ include file = "/include/bs4.jsp" %>
</head>
<body>
<jsp:include page="/include/header.jsp"/>
<jsp:include page="/include/nav.jsp"/>
<p><br/></p>
<div class="container">
	<h2>이곳은 test5.jsp</h2>
  <div class="dropdown">
  	<button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown">
			선택
  	</button>
  	<div class="dropdown-menu">
  		<a class="dropdown-item" href="t5input.do5">회원가입</a>
  		<a class="dropdown-item" href="t5update.do5">수정</a>
  		<a class="dropdown-item" href="t5delete.do5">삭제</a>
  		<a class="dropdown-item" href="t5search.do5">검색</a>
  		<a class="dropdown-item" href="t5allsearch.do5">전체리스트</a>
  	</div>
  </div>
</div>
<p><br/></p>
<jsp:include page="/include/footer.jsp"/>
</body>
</html>