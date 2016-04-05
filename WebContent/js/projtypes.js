(function() {

	var app = angular.module("adminApp", []);

	app.controller("projtypesCtrl", function($scope, $http, $location, $window) {
		var app = this;

		var response = $http.get('/involveMINT/rest/admin/types');
		response.success(function(data) {
			$scope.projtypes = data;
			$scope.title = "Project Types"
			$scope.showProjTypes = true;
			$scope.showProjType = false;

			console.log("[main] # of project types: " + data.length)
			angular.forEach(data, function(element) {
				console.log("[main] Type: " + element.projTypeName);
			});
		})
		response.error(function(data, status, headers, config) {
			alert("AJAX failed to get data, status=" + status);
		})

		$scope.getTypes = function() {
			var response = $http.get('/involveMINT/rest/admin/types');

			response.success(function(data) {
				$scope.projtypes = data;
				$scope.title = "Project Types"
				$scope.showProjTypes = true;
				$scope.showProjType = false;

				console.log("[main] # of project types: " + data.length)
				angular.forEach(data, function(element) {
					console.log("[main] Type: " + element.projTypeName);
				});
			})

			response.error(function(data, status, headers, config) {
				alert("AJAX failed to get data, status=" + status);
			})
		};

		$scope.getProjType = function(id) {
			var response = $http.get('/involveMINT/rest/admin/types/' + id);

			response.success(function(data) {
				$scope.projType = data;
				$scope.showProjTypes = false;
				$scope.showProjType = true;
				$scope.operation = "update";
				$scope.isSaveDisabled = false;
				$scope.isDeleteDisabled = false;
				console.log("[main] # Project Type: " + data.projTypeName)
			})

			response.error(function(data, status, headers, config) {
				alert("AJAX failed to get data, status=" + status);
			})
		};

		$scope.clearForm = function() {
			$scope.projType = {
				projTypePk : '',
				projTypeName : '',
				activeInd : '',
				weightage : ''
			};

		}

		$scope.addProjType = function(element) {
			$scope.operation = "create";
			$scope.clearForm();
			$scope.showProjTypes = false;
			$scope.showProjType = true;
			frmProjType.txtProjTypeName.focus();
			$scope.isSaveDisabled = false;
			$scope.isDeleteDisabled = true;
		}

		$scope.saveProjType = function(id) {
			$scope.jsonObj = angular.toJson($scope.projType, false);
			console.log("[update] data: " + $scope.jsonObj);

			if ($scope.operation == "update") {
				var response = $http.put('/involveMINT/rest/admin/types/' + id,
						$scope.jsonObj);
				response.success(function(data, status, headers, config) {
					$scope.statusTitle = 'Update Status'
					$scope.statusDescription = 'Successful update of Project Type [' + $scope.projType.projTypeName + '] '
					$('#statusModal').modal({
						  keyboard: true
						})
				});

				response.error(function(data, status, headers, config) {
					alert("AJAX failed to get data, status=" + status);
				})
			} else if ($scope.operation == "create") {
				var response = $http.post('/involveMINT/rest/admin/types/add',
						$scope.jsonObj);
				response.success(function(data, status, headers, config) {
					$scope.statusTitle = 'Add Status'
					$scope.statusDescription = 'Successful update of Project Type [' + $scope.projType.projTypeName + '] '
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
			$window.location.href = '/involveMINT/projtypes.jsp'				
			})	
		

		$scope.deleteProjType = function(id) {
			var response = $http.delete('/involveMINT/rest/admin/types/' + id);
			response.success(function(data, status, headers, config) {
				$scope.statusTitle = 'Delete Status'
					$scope.statusDescription = 'Successfully deleted Project Type [' + $scope.projType.projTypeName + '] '
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