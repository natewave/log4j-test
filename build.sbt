import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "log4jtest",
      scalaVersion := "2.11.8"
    )),
    name := "HelloLog4j",
    libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
    libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.10"
  )
