import sbt._

object Dependencies {

  lazy val dependencies =
    Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.6.14",
      "com.typesafe.akka" %% "akka-stream" % "2.6.14",
      "com.typesafe.akka" %% "akka-http" % "10.2.4",
      "org.json4s" %% "json4s-native" % "3.6.11",
      "ch.qos.logback" % "logback-classic" % "1.2.3",
      "com.typesafe.akka" %% "akka-testkit" % "2.6.14" % "test,it",
      "com.typesafe.akka" %% "akka-http-testkit" % "10.2.4" % "test,it",
      "org.scalatest" %% "scalatest" % "3.2.8" % "test,it"
    )
}
