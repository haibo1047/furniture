<%@ page contentType="text/html; charset=utf-8"%>

<jsp:include page="<%=basePath %>/pages/header.jsp" flush="true"/>
<body>
    <main role="main" class="container">
      <div class="jumbotron">
        <h1>Navbar example</h1>
        <p class="lead">This example is a quick exercise to illustrate how fixed to top navbar works. As you scroll, it will remain fixed to the top of your browser's viewport.</p>
      </div>
    </main>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="<c:url value="/js/jquery-3.2.1.min.js"/>"></script>
    <script src="<c:url value="/js/popper.min.js"/>"></script>
    <script src="<c:url value="/js/bootstrap.min.js"/>"></script>
  </body>
