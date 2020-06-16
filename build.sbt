import play.sbt.PlaySettings
  
name := "Webjar test"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  guice,
//  "org.webjars" % "webjars-locator" % "0.40",
  "org.webjars" %% "webjars-play" % "2.8.0",
  "org.webjars" % "bootstrap" % "4.1.3"
)

lazy val root = (project in file("."))
  .enablePlugins(PlayScala,SbtWeb)

