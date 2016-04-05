(function() {

	var app = angular.module("adminApp", []);

	app.controller("projcausesCtrl", function($scope, $http, $location, $window) {
		var app = this;

		var response = $http.get('/involveMINT/rest/admin/causes');
		response.success(function(data) {
			$scope.projCauses = data;
			$scope.title = "Project Causes"
			$scope.showProjCauses = true;
			$scope.showProjCause = false;

			console.log("[main] # of project causes: " + data.length)
			angular.forEach(data, function(element) {
				console.log("[main] Cause: " + element.projCauseName);
			});
		})
		response.error(function(data, status, headers, config) {
			alert("AJAX failed to get data, status=" + status);
		})

		$scope.getCauses = function() {
			var response = $http.get('/involveMINT/rest/admin/causes');

			response.success(function(data) {
				$scope.projCauses = data;
				$scope.title = "Project Causes"
				$scope.showProjCauses = true;
				$scope.showProjCause = false;

				console.log("[main] # of project Causes: " + data.length)
				angular.forEach(data, function(element) {
					console.log("[main] Cause: " + element.projTypeName);
				});
			})

			response.error(function(data, status, headers, config) {
				alert("AJAX failed to get data, status=" + status);
			})
		};

		$scope.getProjCause = function(id) {
			var response = $http.get('/involveMINT/rest/admin/causes/' + id);

			response.success(function(data) {
				$scope.projCause = data;
				$scope.showProjCauses = false;
				$scope.showProjCause = true;
				$scope.operation = "update";
				$scope.isSaveDisabled = false;
				$scope.isDeleteDisabled = false;
				console.log("[main] # Project Cause: " + data.projCauseName)
			})

			response.error(function(data, status, headers, config) {
				alert("AJAX failed to get data, status=" + status);
			})
		};

		$scope.clearForm = function() {
			$scope.projCuase = {
				projCausePk : '',
				projCauseName : '',
				activeInd : '',
				weightage : ''
			};

		}

		$scope.addProjCause = function(element) {
			$scope.operation = "create";
			$scope.clearForm();
			// main.id.focus();
			$scope.isSaveDisabled = false;
			$scope.isDeleteDisabled = true;
		}

		$scope.saveProjCause = function(id) {
			$scope.jsonObj = angular.toJson($scope.projCause, false);
			console.log("[update] data: " + $scope.jsonObj);

			if ($scope.operation == "update") {
				var response = $http.put('/involveMINT/rest/admin/causes/' + id,
						$scope.jsonObj);
				response.success(function(data, status, headers, config) {
					$scope.statusTitle = 'Update Status'
					$scope.statusDescription = 'Successful update of Project Cause [' + $scope.projType.projCauseName + '] '
					$('#statusModal').modal({
						  keyboard: true
						})
				});

				response.error(function(data, status, headers, config) {
					alert("AJAX failed to get data, status=" + status);
				})
			} else if ($scope.operation == "create") {
				var response = $http.post('/involveMINT/rest/admin/causes/add',
						$scope.jsonObj);
				response.success(function(data, status, headers, config) {
					$scope.statusTitle = 'Create Status'
					$scope.statusDescription = 'Successful update of Project Cause [' + $scope.projCause.projCauseName + '] '
					$('#statusModal').modal({
						keyboard: true
						})
				});

				response.error(function(data, status, headers, config) {
					alert("AJAX failed to get data, status=" + status);
				})
			}
		};
		
		$('#statusModal').on('hidden.bs.modal', function (event) {
			$window.location.href = '/involveMINT/projcauses.jsp'				
			})	
		

		$scope.deleteProjType = function(id) {
			var response = $http.delete('/involveMINT/rest/admin/causes/' + id);
			response.success(function(data, status, headers, config) {
				$scope.statusTitle = 'Delete Status'
				$scope.statusDescription = 'Successful deletion of Project Cause [' + $scope.projCause.projCauseName + '] '
				$('#statusModal').modal({
						keyboard: true
						})			
				});

			response.error(function(data, status, headers, config) {
				alert("AJAX failed to get data, status=" + status);
			})
		};

	});
})();