


var app=angular.module("loginApp" , ['ngRoute']);

	app.config(function ($routeProvider){
		$routeProvider.when('/',{
			templateUrl :'login.html'
		})
		.when('/dashboard',{
			resolve:{
				"check": function($location , $rootScope){
					console.log($rootScope.loggedIn);
							if(!$rootScope.loggedIn){
								console.log('not logged in' );
								$location.path('/');
							}

				}
			
			} ,templateUrl:'dashboard.html'
			
		})
		.otherwise({
			redirectTo:'/'
		});


});

	app.controller('loginCtrl', function($scope , $location , $rootScope){
		$scope.submit= function(){
			var userName = $scope.userName;
			var password = $scope.password;

			console.log("Inside the redirect method");
			console.log("User Name" , userName);
			console.log("Password" , password);
			if($scope.userName == 'admin@pnc.com' && 
				$scope.password =='password'){

					$rootScope.loggedIn = true;


				$location.path('/dashboard');
				console.log("After the call");
				console.log($rootScope.loggedIn);
			}

		};

	});