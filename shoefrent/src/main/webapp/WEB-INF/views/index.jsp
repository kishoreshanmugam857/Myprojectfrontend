<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<title>hello</title>
	<jsp:include page="navbar.jsp"></jsp:include>

	<c:if test="${indexpage}">
		<jsp:include page="home.jsp"></jsp:include>
	</c:if>

	<c:if test="${registerpage}">
		<jsp:include page="register.jsp"></jsp:include>
	</c:if>

	<c:if test="${login}">
		<jsp:include page="login.jsp"></jsp:include>
	</c:if>

	<c:if test="${aboutus}">
		<jsp:include page="aboutus.jsp"></jsp:include>
	</c:if>

	<c:if test="${contactus}">
		<jsp:include page="contactus.jsp"></jsp:include>
	</c:if>
	<c:if test="${category}">
		<jsp:include page="category.jsp"></jsp:include>
	</c:if>



	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
