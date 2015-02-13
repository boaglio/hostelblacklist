<html>
 <head>
  <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
  <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.2/css/jquery.dataTables.css">
  <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body style="background-color: black;">
 <br/>
 <div class="container">
  <p style="text-align:center">
   <img src="${pageContext.request.contextPath}/img/hb-logo-min.png" alt="Hostel Blacklist" width="129"/>
  </p>
  <div class="alert alert-success" role="alert">Hostel Blacklist</div>
  <form method="get" action="busca">
   <p>
    <div class="input-group">
     <span class="input-group-addon">Busca</span>
     <input type="text" name="criterioDeBusca" id="criterioDeBusca" class="form-control" placeholder="nome do hospede ?">
    </div>
   </p>
   <p>
    <input class="btn btn-primary btn-lg" type="submit" value="buscar !" />
   </p>
  </form>
  <br/>
 </div>
</body>
</html>
<script>
 document.getElementById('criterioDeBusca').focus();
</script>
