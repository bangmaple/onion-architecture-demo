<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<c:if test="${sessionScope.USER.role eq 'Administrator'}">
    <c:redirect url="admin.jsp"/>
</c:if>
<c:if test="${empty sessionScope.USER}">
    <c:redirect url="login.jsp"/>
</c:if>