
lazy val root = (project in file(".")).enablePlugins(PlayScala)

name := "play-specs2-testbench"
version := "1.0"
scalaVersion := "2.11.7"
routesGenerator := InjectedRoutesGenerator // needed to be able to use classes (instead of objects) as controllers

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases" // needed for specs2
libraryDependencies ++= Seq(
  specs2 % Test,
  filters
)
