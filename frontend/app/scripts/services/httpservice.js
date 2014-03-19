'use strict';

angular.module('frontendApp')
  .service('Httpservice', function Httpservice(Restangular) {

    this.allProducten = function(){
      return Restangular.all('product').all('zoek').getList().$object;
    };

    this.newProduct = function(){
      return Restangular.one('product').one('voegtoe');
    };

    this.verwijderProduct = function(id){
      return Restangular.one('product').one('verwijder', id).remove();
    };

  });
