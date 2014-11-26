
function StationsCtrl($scope, $http) {
    // get stations using AngularJS AJAX API
    $http.get('/stations').success(function(data){
        echo('data='+data)
        $scope.stationNames = data;
    });
});
