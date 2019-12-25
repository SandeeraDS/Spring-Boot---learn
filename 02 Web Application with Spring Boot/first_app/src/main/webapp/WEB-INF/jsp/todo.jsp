<html>
<head>
<title>First Web Application</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<h3>Add Todo Page</h3>

		<form method="post">
			<fieldset class="form-group">
				<label>Description</label> 
				<input type="text" name="desc" class="form-control" required="required">
			</fieldset>
			<button class="btn btn-success" type="submit"> Add</button>
		</form>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
