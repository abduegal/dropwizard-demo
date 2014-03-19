'use strict';

angular.module('frontendApp')
  .controller('MainCtrl', function ($scope, Httpservice) {

    $scope.init = function(){
      $scope.producten = Httpservice.allProducten();
      $scope.product = Httpservice.newProduct();
      $scope.errorMessage = undefined;
    };

    $scope.submitProduct = function(){
      $scope.product.post().then($scope.init, $scope.error);
    };

    $scope.error = function(){
      $scope.errorMessage = "error";
    };

    $scope.verwijder = function(id){
      Httpservice.verwijderProduct(id).then($scope.init, $scope.error);
    }
  });
