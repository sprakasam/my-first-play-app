import play.PlayScala
import sbt.Keys._
import sbt._

object MyBuild extends Build {

  lazy val webUi = Project ( id = "web-ui", base = file("web-ui") ).enablePlugins(PlayScala)

  lazy val webService = Project( id = "web-service", base = file("web-service") ).enablePlugins(PlayScala)

  lazy val root = (project in file("."))
    .enablePlugins(PlayScala)
    .aggregate(webService)
    .aggregate(webUi)

}