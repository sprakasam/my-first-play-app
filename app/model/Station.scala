package model


case class StationsResponse(root: UriAndStation, message: String)

case class UriAndStation(uri: String, stations: List[Station])

/**
 * Station data model
 */
case class Station(name: String,
                   abbr: String,
                   gtfs_latitude: String,
                   gtfs_longitude: String,
                   address: String,
                   city: String,
                   county: String,
                   state: String,
                   zipcode: String) {

}
