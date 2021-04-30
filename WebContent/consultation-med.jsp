<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Assurance Sante</title>

	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script><link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
	
	<link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">
        
    <link href="https://cdn.datatables.net/1.10.23/css/dataTables.bootstrap4.min.css" rel="stylesheet">
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" 
    		integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA==" 
    		crossorigin="anonymous" />
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/startbootstrap-sb-admin-2/4.1.3/css/sb-admin-2.min.css" 
    	integrity="sha512-RIG2KoKRs0GLkvl0goS0cdkTgQ3mOiF/jupXuBsMvyB3ITFpTJLnBu59eE+0R39bxDQKo2dsatA5CwHeIKVFcw==" 
    	crossorigin="anonymous" />

    <!-- Custom fonts for this template-->
    <link href="resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="resources/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <%@ include file="sidebar-med.jsp" %>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <%@ include file="topbar.jsp" %>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Formulaire d'ajout</h1>
                    </div>                    

                    <!-- Content Row -->
                    <div class="row">
                        <!-- Outer Row --> 
                        <div class="col-xl-10 col-lg-12 col-md-9">

                            <div class="card o-hidden border-0 shadow-lg my-5">
                                <div class="card-body p-0">
                                    <!-- Nested Row within Card Body -->                                    
                                    <div class="p-5">
                                        <div class="text-center">
                                            <h1 class="h4 text-gray-900 mb-4">Ajouter une personne </h1>
                                        </div>
                                        <form>
                                            <div class="form-group">
                                                <label for="nom">Nom</label>
                                                <input class="form-control" id="nom" type="text" placeholder="Nom" name="nom">
                                            </div>
                                            
                                            <div class="form-group">
                                                <label for="nom">Prenom</label>
                                                <input class="form-control" id="prenom" type="text" placeholder="Prenom" name="prenom">
                                            </div>

                                            <div class="form-group">
                                                <label class="control-label col-md-6 col-sm-3 col-xs-12">Sexe</label>
                                                <div class="col-md-6 col-sm-6 col-xs-12">
                                                  <div id="sexe" class="btn-group" data-toggle="buttons">
                                                    <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                                                      <input type="radio" name="sexe" value="masculin"> &nbsp; Masculin &nbsp;
                                                    </label>
                                                    <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default" style="margin-bottom: 15px;">
                                                      <input type="radio" name="sexe" value="feminin"> Feminin
                                                    </label>
                                                  </div>
                                                </div>
                                              </div>

                                            <div class="form-group">
                                                <label for="nom">Age</label>
                                                <input class="form-control" id="age" type="number" placeholder="" name="age">
                                            </div>
                                            <div class="form-group">
                                                <label for="nom">Telephone</label>
                                                <input class="form-control" id="telephone" type="text" placeholder="Numéro de Téléphone" name="telephone">
                                            </div>
                                            <div class="form-group">
                                                <label for="nom">Quartier</label>
                                                <input class="form-control" id="quartier" type="text" placeholder="Quartier" name="quartier">
                                            </div>
                                            <div class="form-group">
                                                <label for="nom">Date de naissance</label>
                                                <input class="form-control date-picker form-control col-md-7 col-xs-12" required="required" id="datenaissance" type="date" placeholder="" name="datenaissance">
                                            </div>

                                            <div class="form-group">
                                                <label class="">Type</label>
                                                <div class="">
                                                  <div id="typeperson" class="btn-group" data-toggle="buttons">
                                                    <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                                                    <input type="radio" name="typeperson" value="medecin"> &nbsp; Médécin &nbsp;
                                                    </label>
                                                    <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default" style="margin-bottom: 15px;">
                                                      <input type="radio" name="typeperson" value="patient"> Patient
                                                    </label>
                                                  </div>
                                                </div>
                                              </div>

                                              <div class="text-center">
                                                <h1 class="h4 text-gray-900 mb-4">Assuré </h1>
                                            </div>
                                            <div class="form-group">
                                            <label class="control-label col-md-6 col-sm-3 col-xs-12">Assuré</label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                              <div id="isassure" class="btn-group" data-toggle="buttons">
                                                <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                                                  <input type="radio" name="isassure" value="yes"> &nbsp; Oui &nbsp;
                                                </label>
                                                <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default" style="margin-bottom: 15px;">
                                                  <input type="radio" name="isassure" value="non"> Non
                                                </label>
                                              </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="nom">Matricule</label>
                                                <input class="form-control" id="matricule" type="text" placeholder="Matricule" name="matricule">
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-6 col-sm-3 col-xs-12">Médécin traitant</label>                                                
                                                  <div class="btn-group" data-toggle="buttons">
                                                    <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                                                      <select style="width:300px; height:30px;border:1px solid #ced4da;border-radius: .25rem;">
                                                            <option> Dr AYISSI</option>
                                                            <option> Dr Nyangwa</option>
                                                            <option> Dr Atangana</option>
                                                            <option> Dr Nyangwa</option>
                                                            <option> Dr Atangana</option>
                                                        </select>
                                                    </label>
                                                  </div>
                                                
                                            </div>

                                            <div class="text-center">
                                                <h1 class="h4 text-gray-900 mb-4">Catégories </h1>
                                            </div>
                                            <div class="form-group">
                                            <label class="control-label col-md-6 col-sm-3 col-xs-12">Catégorie</label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                              <div id="categorie" class="btn-group" data-toggle="buttons">
                                                <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                                                  <input type="radio" name="categorie" value="specialiste"> &nbsp; Spécialiste &nbsp;
                                                </label>
                                                <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default" style="margin-bottom: 15px;">
                                                  <input type="radio" name="categorie" value="generaliste"> Généraliste
                                                </label>
                                              </div>
                                            </div>
                                          </div>
                                              <div class="form-group">
                                                <label for="nom">Nom du Cabinet</label>
                                                <input class="form-control" id="nomcabinet" type="text" placeholder="Cabinet" name="nomcabinet">
                                            </div>
                                            <div class="form-group">
                                                <label for="nom">Numéro du Cabinet</label>
                                                <input class="form-control" id="phonecabinet" type="text" placeholder="Téléphone du Cabinet" name="phonecabinet">
                                            </div><br>
                                            <div class="form-group">
                                                <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                                  <button type="submit" class="btn btn-success">ENREGISTRER</button>
                                                  <button type="reset" class="btn btn-primary">ANNULEZ</button>
                                                </div>
                                              </div>
                                            </div>
                                        </form>

                                        
                                    </div>  

                                        
                                </div>
                            </div>

                        </div>
                    </div>                    

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->
            
            <!-- Footer -->
            <%@ include file="footer.jsp" %>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="login.html">Logout</a>
                </div>
            </div>
        </div>
    </div>
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js" integrity="sha512-bLT0Qm9VnAYZDflyKcBaQ2gg0hSYNQrJ8RilYldYQ1FxQYoCLtUjuuRuZo+fjqhx/qtq/1itJ0C2ejDxltZVFg==" crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>    
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/startbootstrap-sb-admin-2/4.1.3/js/sb-admin-2.min.js" integrity="sha512-COtY6/Rv4GyQdDShOyay/0YI4ePJ7QeKwtJIOCQ3RNE32WOPI4IYxq6Iz5JWcQpnylt/20KBvqEROZTEj/Hopw==" crossorigin="anonymous"></script>
	
    <!-- Bootstrap core JavaScript-->
    <script src="resources/vendor/jquery/jquery.min.js"></script>
    <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="resources/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="resources/js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="resources/vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="resources/js/demo/chart-area-demo.js"></script>
    <script src="resources/js/demo/chart-pie-demo.js"></script>

</body>

</html>