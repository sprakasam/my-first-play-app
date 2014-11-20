import sbt.Keys._

name := "web-ui"

version := "1.0.0-SNAPSHOT"

libraryDependencies += "com.typesafe.play" % "play_2.10" % "2.3.6"

//devSettings += ("application.router", "webui.routes")