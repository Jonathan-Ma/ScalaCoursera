name := "fp-princpls-1"

scalaVersion := "2.13.1"

scalacOptions ++= Seq("-deprecation")

// grading libraries
libraryDependencies += "org.scalatest"  %% "scalatest"  % "3.2.2"  % "test"

// for funsets
//libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"

scalacOptions ++= Seq(
  "-Xfatal-warnings"
)

resolvers += Classpaths.sbtPluginReleases

publishArtifact in Test := false

parallelExecution in Test := false
