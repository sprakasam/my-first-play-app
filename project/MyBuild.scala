import play.PlayScala
import sbt._

object MyBuild extends Build {

  lazy val root = (project in file("."))
    .enablePlugins(PlayScala)

}