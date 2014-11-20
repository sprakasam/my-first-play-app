import play.PlayScala
import sbt.Keys._
import sbt._

object MyBuild extends Build {
  override lazy val settings = super.settings ++ Seq(
    scalaVersion := "2.10.4",
    organization := "com.suresh"
  )

  val webUi = Project (
    id = "web-ui",
    base = file("web-ui"),
    settings = settings ++ PlayScala.projectSettings
  )

  val webService = Project(id = "web-service",
    base = file("web-service")
  )
    .settings(settings: _*)

  lazy val root = (project in file("."))
    .enablePlugins(PlayScala)
    .settings(settings : _*)
    .aggregate(webService)
    .aggregate(webUi)

}