'use strict';

angular.module('frontendApp')
  .service('Httpservice', function Httpservice(Restangular) {

    this.allCatalogus = function(){
      return Restangular.all('catalogus').all('zoek').getList().$object;
    };

    this.newCatalogus = function(){
      return Restangular.one('catalogus').one('voegtoe');
    };

  });
