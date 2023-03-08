<%
  String errorMessage = (String) session.getAttribute("errorMessage");
  if (null !=errorMessage) {
%>
<h4> <%=errorMessage %></h4>
<%
  }
%>