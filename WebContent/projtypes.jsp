<!DOCTYPE html>
<html ng-app="adminApp">
<head>
<title>Administration</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">
<link href="font-awesome-4.5.0/css/font-awesome.css" rel="stylesheet">
</head>
<body ng-controller="projtypesCtrl as adminApp">
	<%@ include file="include/header.html"%>

	<!-- 	<div class="container"> -->
	<!-- 		<h3> -->
	<!-- 			<span class="label label-primary col-md-6 col-xs-6">Project -->
	<!-- 				Types</span> -->
	<!-- 		</h3> -->
	<!-- 		<button type="button" -->
	<!-- 			class="btn btn-default col-md-6 col-xs-2 pull-right" -->
	<!-- 			aria-label="Add New">Add New</button> -->
	<!-- 	</div> -->

	<form id="frmProjType">
		<!-- 	<div class="container" ng-show="showProjTypes"> -->
		<div class="panel panel-default" ng-show="showProjTypes">
			<div class="panel-heading">
				<b>Project Types</b>
			</div>
			<div class="panel-body"
				style="padding-top: 2px; padding-bottom: 2px;">
				<button type="button" class="btn btn-primary btn-right"
					aria-label="Add New" ng-click="addProjType()">Add New</button>
			</div>

			<ul class="list-group">
				<li class="list-group-item" ng-repeat="prType in projtypes"
					ng-click="getProjType(prType.projTypePk)"><button
						type="button" class="btn btn-default" aria-label="Left Align">
						<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
					</button> <b>{{prType.projTypeName}}</b></li>
			</ul>
			<!-- 				<div class="list-group" ng-repeat="prType in projtypes" -->
			<!-- 					ng-click="getProjType(prType.projTypePk)"> -->
			<!-- 					<a href="#" class="list-group-item" style="color: #BCD94D;" -->
			<!-- 						ng-repeat="prType in projtypes" -->
			<!-- 						ng-click="getProjType(prType.projTypePk)"><button -->
			<!-- 							type="button" class="btn btn-default" aria-label="Left Align"> -->
			<!-- 							<span class="glyphicon glyphicon-edit" aria-hidden="true"></span> -->
			<!-- 						</button> <b>{{prType.projTypeName}}</b> </a> -->
			<!-- 				</div> -->
			<!-- 		</div> -->
		</div>

		<div class="container" ng-show="showProjType">
			<table ng-show="showProjType"
				style="border-collapse: separate; border-spacing: 4px;">
				<tr>
					<td><label for="lblProjTypePk">ID:</label></td>
					<td><label ng-model="projType.projTypePk"></label></td>
				</tr>
				<tr>
					<td><label for="txtProjTypeName">Name:</label></td>
					<td><input id="txtProjTypeName" type="text"
						class="form-control" ng-model="projType.projTypeName"></td>
				</tr>
				<tr>
					<td><label for="btnActiveInd">Is Active:</label></td>
					<td><input id="btnActiveInd" type="text" class="form-control"
						ng-model="projType.activeInd"></td>
				</tr>
				<tr>
					<td><label for="txtWeightage">Weightage:</label></td>
					<td><input id="txtWeightage" type="text" class="form-control"
						ng-model="projType.weightage"></td>
				</tr>
				<tr>
					<td><button type="button" class="btn btn-default"
							aria-label="Save" ng-click="saveProjType(projType.projTypePk)">Save</button></td>
					<td><button type="button" class="btn btn-default"
							aria-label="Delete"
							ng-click="deleteProjType(projType.projTypePk)">Delete</button></td>
				</tr>
			</table>
		</div>

		<%@ include file="include/statusmodal.html"%>

		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<script src="js/bootstrap.js"></script>
		<script type="text/javascript"
			src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.16/angular.min.js"></script>
		<script src="js/projtypes.js"></script>
	</form>
</body>
</html>