
var myApp = angular.module('BartApp', []);

myApp.controller('StationCtrl', function StationCtrl($scope, $http) {
        echo('hi')
    // get station names using AngularJS AJAX API
    $http.get('/stations').success(function(data){
//        echo('data='+data)
        $scope.stationNames = data;
        $scope.currentStation = undefined;
//        $scope.sortStationsBy = 'name';
    });
});
