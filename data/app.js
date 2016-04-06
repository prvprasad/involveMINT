(function(){
	'use strict';
	var dependencies = [
		'ngRoute'
			];
			console.log("Come on");
	var app = angular.module('loginApp' , ['ngRoute']);

		app.config([function($routeProvider){
		$routeProvider.when('/',{

			templateUrl :'login.html',
			controller : 'loginCtrl'

		})
		.otherwise({
			redirectTo:'/'
		});
		}]);
		console.log("Come on3");
	app.config(function(urlProvider){
	urlProvider.setUrl("http://jsonplaceholder.typicode.com/posts/1");
		}) 
console.log("Come on4");
})();