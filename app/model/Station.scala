package model


case class StationsResponse(root: Root)
case class Root(uri: String, stations: Stations, message: String)
case class Stations(station: List[Station])

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
