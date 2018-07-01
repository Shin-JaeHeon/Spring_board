<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>${title}</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</head>
<body>
<nav class="nav-extended" style="height: 128px;">
    <div class="nav-wrapper">
        <div class="nav-wrapper">
            <form style="height: 4.2rem;">
                <div class="input-field">
                    <input id="search" type="search" required>
                    <label class="label-icon" for="search"><i class="material-icons">search</i></label>
                    <i class="material-icons">close</i>
                </div>
            </form>
            <div class="nav-content">
                <ul class="tabs tabs-transparent">
                    <li class="tab"><a href="${pageContext.request.contextPath}/board">자유 게시판</a></li>
                    <li class="tab"><a href="${pageContext.request.contextPath}/question">질문 게시판</a></li>
                    <li class="tab"><a href="${pageContext.request.contextPath}/trade">거래 게시판</a></li>
                </ul>
            </div>
        </div>
    </div>
</nav>
<div class="container row">
    <%
        ArrayList lastList = (ArrayList) request.getAttribute("lastList");
        for (Object obj : lastList) {
            ArrayList list = (ArrayList) obj;
    %>
    <div class="col s12 m4 l3">
        <div class="card white darken-1s">
            <div class="card-content black-text">
                <span class="card-title"><%=list.get(0)%></span>
                <p><%=list.get(1)%>
                </p>
            </div>
        </div>
    </div>
    <% } %>
    <div class="fixed-action-btn">
        <a class="btn-floating btn-large red">
            <i class="large material-icons">menu</i>
        </a>
        <ul>
            <li><a class="btn-floating green" href="${pageContext.request.contextPath}/profile"><i
                    class="material-icons">people</i></a></li>
            <li><a class="btn-floating yellow darken-1" href="${pageContext.request.contextPath}/edit"><i
                    class="material-icons">mode_edit</i></a></li>
            <li><a class="btn-floating red" href="${pageContext.request.contextPath}/"><i
                    class="material-icons">home</i></a></li>
        </ul>
    </div>
</div>
<script>
    document.addEventListener('DOMContentLoaded', () => {
        const elems = document.querySelectorAll('.fixed-action-btn');
        const instances = M.FloatingActionButton.init(elems);
    });

</script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>
</body>
</html>