'use strict';

angular.module('frontendApp')
  .controller('MainCtrl', function ($scope, Httpservice) {

    $scope.init = function(){
      $scope.catalogussen = Httpservice.allCatalogus();
      $scope.catalogus = Httpservice.newCatalogus();
      $scope.errorMessage = undefined;
    };

    $scope.submitCatalogus = function(){
      $scope.catalogus.post().then($scope.init, $scope.error);
    };

    $scope.error = function(){
      $scope.errorMessage = "error";
    };
  });
