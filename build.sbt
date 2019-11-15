name := "Cafebabe"

version := "1.2"

scalaVersion := "2.13.0"

crossScalaVersions := Seq("2.10.4", "2.11.8", "2.13.0")

scalacOptions += "-deprecation"

scalacOptions += "-unchecked"

scalacOptions += "-Xexperimental"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"

