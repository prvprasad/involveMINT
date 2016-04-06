


var app=angular.module("loginApp" , ['ngRoute']);



	app.controller('loginCtrl', function($scope , $location ){
console.log("Come on5");
		$scope.submit= function(){
			var userName = $scope.userName;
			var password = $scope.password;

			console.log("Inside the redirect method");
			console.log("User Name" , userName);
			console.log("Password" , password);
			if($scope.userName == 'admin@pnc.com' && 
				$scope.password =='password'){

					


				$location.path('/dashboard');
				console.log("After the call");
				console.log($rootScope.loggedIn);
			}

		};

	});