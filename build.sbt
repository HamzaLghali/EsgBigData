ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.19"

lazy val root = (project in file("."))
  .settings(
    name := "EsgBigData",
    libraryDependencies ++= Seq(

      "org.apache.spark" %% "spark-core" % "3.3.0" exclude("org.slf4j", "slf4j-log4j12"),
      "org.apache.spark" %% "spark-sql" % "3.3.0" exclude("org.slf4j", "slf4j-log4j12"),
      "org.postgresql" % "postgresql" % "42.6.0"
    )
  )
