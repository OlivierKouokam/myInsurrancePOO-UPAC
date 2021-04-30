<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion - Securite Sociale</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" 
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">


</head>
<body>
	<%@ include file="header.jsp" %>
	<p></p>
	<br>
	<div class="container col-md-6 col-md-offset-3">
		<div class="panel panel-primary">
			<div class="panel-heading">Authentification</div>

			<div class="panel-body">
				<form action="home.do" method="post">
					<div class="form-group">
						<label class="control-label">Username</label> 
						<input class="form-control" type="text" name="username">
					</div>
					<div class="form-group">
						<label class="control-label">Password</label> 
						<input class="form-control" type="password" name="password">
					</div>
					<div class="form-group">
						<label for="role">Role : </label><br>
						<input type="radio" id="admin" name="role" value="admin">
						<label for="admin">admin</label><br>
						<input type="radio" id="medecin" name="role" value="medecin">
						<label for="medecin">medecin</label>
					</div><br>
					<center><button class="btn btn-success" type="submit">Login</button></center>
				</form>
			</div>
			<div class="panel-footer">Merci de vous authentifier</div>
		</div>		
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" 
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>