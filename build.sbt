import sbt.Keys._

name := "web-ui"

version := "1.0.0-SNAPSHOT"

libraryDependencies += "com.typesafe.play" % "play_2.10" % "2.3.6"

libraryDependencies += "org.json4s" % "json4s-jackson_2.10" % "3.2.11"

libraryDependencies += ws