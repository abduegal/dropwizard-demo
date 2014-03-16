'use strict';

describe('Service: httpservice', function () {

  // load the service's module
  beforeEach(module('frontendApp'));

  // instantiate service
  var httpservice;
  beforeEach(inject(function (_httpservice_) {
    httpservice = _httpservice_;
  }));

  it('should do something', function () {
    expect(!!httpservice).toBe(true);
  });

});
