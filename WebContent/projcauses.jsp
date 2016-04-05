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
<body ng-controller="projcausesCtrl as adminApp">
	<%@ include file="include/header.html"%>

	<div class="container">{{title}}</div>
	<div class="container" ng-show="showProjCauses">
		<div class="list-group">
			<a href="#" class="list-group-item" style="color: #BCD94D;"
				ng-repeat="prCause in projCauses"
				ng-click="getProjCause(prCause.projCausePk)"><button type="button"
					class="btn btn-default" aria-label="Left Align">
					<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
				</button> <b>{{prCause.projCauseName}}</b> </a>
		</div>
	</div>

	<table ng-show="showProjCause"
		style="border-collapse: separate; border-spacing: 4px;">
		<tr>
			<td><label for="lblProjTypePk">ID:</label></td>
			<td><label ng-model="projCause.projCausePk"></label></td>
		</tr>
		<tr>
			<td><label for="txtProjCauseName">Name:</label></td>
			<td><input id="txtProjCauseName" type="text" class="form-control"
				ng-model="projCause.projCauseName"></td>
		</tr>
		<tr>
			<td><label for="btnActiveInd">Is Active:</label></td>
			<td><input id="btnActiveInd" type="text" class="form-control"
				ng-model="projCause.activeInd"></td>
		</tr>
		<tr>
			<td><label for="txtWeightage">Weightage:</label></td>
			<td><input id="txtWeightage" type="text" class="form-control"
				ng-model="projCause.weightage"></td>
		</tr>
	</table>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<script type="text/javascript"
		src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.16/angular.min.js"></script>
	<script src="js/projcauses.js"></script>
</body>
</html>