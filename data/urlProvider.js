(function(){
'use strict';
	angular.module('loginApp')
	.provider('url', function(){
		var url = "";
		function setUrl(newUrl ){
			url=newUrl;
		}
		function getUrl(){
			return url;
		}
		return{
			setUrl:setUrl,
			$get:function(){
				return({
					getUrl:getUrl
				})
			}
		}
	})


})();