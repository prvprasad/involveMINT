(function(){
	'use strict';
	angular.module('loginApp').service('loginService', loginService);

	function loginService($http, url){
		console.log("getUrl: ",url.getUrl());
		this.fetchDate = function(){
			$http.get(url.getUrl()).then(function success(data){
				console.log("data", data);	
			})

		}
	}
})();