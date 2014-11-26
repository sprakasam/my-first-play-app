package controllers

import model.StationsResponse
import org.json4s.DefaultFormats
import org.json4s.Xml.toJson
import org.json4s.jackson.Serialization.write
import play.api.Play.current
import play.api.libs.ws.WS
import play.api.mvc._

import scala.concurrent.ExecutionContext.Implicits.global

/**
 * Minimal controller examples that output text/plain responses.
 */
object Main extends Controller {

  val apiUrl = "http://api.bart.gov/api/%s"
  val apiKey = "Q5LK-UWD2-IABQ-DT35"
  implicit val formats = DefaultFormats

  // returns the station names in Json format
  def stationNames = Action.async {

    WS.url(apiUrl.format("stn.aspx"))
      .withQueryString("key" -> apiKey)
      .withQueryString("cmd" -> "stns")
      .get()
      .map { response =>
      val json = toJson(scala.xml.XML.loadString(response.body))
      val stationResponse = json.extract[StationsResponse]

      val stations = stationResponse.root.stations.station
      val stationNames = stations.map(_.name)

      val jsonResponse = write(stationNames)
      Ok(jsonResponse)
    }
  }
}

