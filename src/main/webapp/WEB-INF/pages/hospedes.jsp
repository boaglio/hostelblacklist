<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.2/css/jquery.dataTables.css">
<script	src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" language="javascript" src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script type="text/javascript" language="javascript" src="//cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" class="init">
	$(document).ready(function() {
	    $('#hospedes').dataTable({
	    	  "info":     false,
	    	  "paging":   false,
	    	  "oLanguage": {
	    	         "sSearch": "Filtrar resultados:"
	    	       }
	    });
    });
</script>
</head>
<body  style="background-color: black;">
<div class="container">

  <p style="text-align:center">
   <img src="${pageContext.request.contextPath}/img/hb-logo-min.png" alt="Hostel Blacklist" width="129"/>
  </p>
  <div class="alert alert-success" role="alert">Hostel Blacklist</div>
  <form method="get" action="busca">
   <p>
    <div class="input-group">
     <span class="input-group-addon">Busca</span>
     <input type="text" name="criterioDeBusca" id="criterioDeBusca" class="form-control" placeholder="nome do hospede ?" value="${criterioDeBusca}">
    </div>
   </p>
   <p>
    <input class="btn btn-primary btn-lg" type="submit" value="buscar !" />
   </p>
  </form>
  <br/>
 <table id="hospedes" class="display" cellspacing="0" width="100%">
  <thead>
  </thead>
  <tbody>
   <c:forEach items="${hospedes}" var="hospede">
	<tr>
	 <td>
	   <a href="${pageContext.request.contextPath}/buscar-por-id/${hospede.id}">
	   ${hospede.nome} (${hospede.cidadeOrigem}) -
	   ${hospede.ocorrencias}
	   </a>
     </td>
	</tr>
   </c:forEach>
  </tbody>
 </table>
 <br/>
  <div class="alert alert-warning alert-dismissible" >Exibindo at&eacute; 100 resultados <span class="sr-only">Close</span></div>

 <br/>
</div>
</body>
</html>
<script>
 document.getElementById('criterioDeBusca').focus();
</script>