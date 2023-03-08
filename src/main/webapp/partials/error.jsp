<%
  String errorMessage = (String) session.getAttribute("errorMessage");
  if (null !=errorMessage) {
%>
<h4 class="error p-2"> <%=errorMessage %></h4>
<%
  }
%>